package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
	Connection connection = null;
	private String url = null;
	private String username = null;
	private String password = null;

	public JDBCUtils() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("database.properties"));
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
		} catch (FileNotFoundException e) {
			System.out.println("File `database.properties` not found!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void isConnectedForTesting() throws SQLException {
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connected!");
	}

	public Connection connect() throws SQLException {
		if (connection.isClosed() || connection == null) {
			try {
				connection = DriverManager.getConnection(url, username, password);
				System.out.println("Connected!");
			} catch (SQLException e) {
				System.out.println("Something wrong when connect to database.");
			}
		}
		return connection;
	}

	public void disconnect() throws SQLException {
		if (connection != null || !connection.isClosed()) {
			try {
				connection.close();
				System.out.println("Disconnected.");
			} catch (SQLException e) {
				System.out.println("Something wrong when close database.");
			}
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
