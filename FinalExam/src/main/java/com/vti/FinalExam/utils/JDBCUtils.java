package com.vti.FinalExam.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vti.FinalExam.utils.Properties.DatabaseProperties;

public class JDBCUtils {
	private Connection connection = null;
	private DatabaseProperties dbProperties;

	public JDBCUtils() throws FileNotFoundException, IOException {
		dbProperties = new DatabaseProperties();
	}

	public void connect() throws SQLException {
		String url = dbProperties.getValue("url");
		String username = dbProperties.getValue("username");
		String password = dbProperties.getValue("password");
		connection = DriverManager.getConnection(url, username, password);
	}

	public void disconnect() throws SQLException {
		connection.close();
	}

	public Connection getConnection() {
		return connection;
	}

}
