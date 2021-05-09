package com.vti.backend;

import java.sql.*;

public class Exercise4 {
	public static void deleteDepartment() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String dbUser = "root";
		String dbPassword = "root";
		Connection connection = null;
		try {
			// Tạo kết nối tới database
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			connection.setAutoCommit(false);
			System.out.println("Connected!");
		} catch (SQLException e) {
			System.out.println("Something wrong when connect to database.");
		}
		
		try {
			String sql = "DELETE FROM Account WHERE DepartmentID = 3";
			Statement statement = connection.createStatement();
			int rowsEffected = statement.executeUpdate(sql);
			System.out.println("DELETE FROM Account WHERE DepartmentID = 3");
			System.out.println("Row[s] effected: " + rowsEffected);
			
			sql = "DELETE FROM Department WHERE DepartmentID = 3";
			rowsEffected = statement.executeUpdate(sql);
			System.out.println("DELETE FROM Department WHERE DepartmentID = 3");
			System.out.println("Row[s] effected: " + rowsEffected);
			
			connection.commit();
			System.out.println("Transaction commit!");
		} catch (SQLException e) {
			System.out.println("Something wrong when query to database.");
			connection.rollback();
			System.out.println("Transaction rollback!");
			e.printStackTrace();
		}
		
		try {
			connection.close();
			System.out.println("Disconnected.");
		} catch (SQLException e) {
			System.out.println("Something wrong when close database.");
		}	
	}
}
