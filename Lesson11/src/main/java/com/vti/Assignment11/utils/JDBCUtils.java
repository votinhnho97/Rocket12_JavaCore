package com.vti.Assignment11.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vti.Assignment11.utils.Properties.DatabaseProperties;

public class JDBCUtils {
	private Connection connection = null;
	private String url = null;
	private String username = null;
	private String password = null;
	private DatabaseProperties dbProperties;

	public JDBCUtils() throws FileNotFoundException, IOException {
		dbProperties = new DatabaseProperties();
	}

	public void connect() throws SQLException {
		url = dbProperties.getValue("url");
		username = dbProperties.getValue("username");
		password = dbProperties.getValue("password");
		connection = DriverManager.getConnection(url, username, password);
	}

	public void disconnect() throws SQLException {
		connection.close();
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
