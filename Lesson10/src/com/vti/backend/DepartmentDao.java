package com.vti.backend;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.*;

public class DepartmentDao {
	Connection connection = null;

	public void connect() {
		String dbUrl = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String dbUser = "root";
		String dbPassword = "root";
		try {
			// Tạo kết nối tới database
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			System.out.println("Connected!");
		} catch (SQLException e) {
			System.out.println("Something wrong when connect to database.");
		}
	}

	public void disconnect() {
		try {
			connection.close();
			System.out.println("Disconnected.");
		} catch (SQLException e) {
			System.out.println("Something wrong when close database.");
		}
	}

	public List<Department> getDepartment() {
		List<Department> results = new ArrayList<Department>();

		try {
			String sql = "SELECT * FROM Department ORDER BY DepartmentID";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				Department d = new Department(resultSet.getInt("DepartmentID"), resultSet.getString("DepartmentName"));
				results.add(d);
			}
		} catch (SQLException e) {
			System.out.println("Something wrong when query to database.");
			e.printStackTrace();
		}

		return results;
	}

	public List<Department> getDepartmentByID(int id) {
		List<Department> results = new ArrayList<Department>();

		try {
			// Query
			String sql = "SELECT * FROM Department WHERE DepartmentID = ? ORDER BY DepartmentID";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setInt(1, id);
			// Chạy câu Query và hứng kết quả vào ResultSet
			ResultSet resultSet = preStatement.executeQuery();
			// results.next():
			// kiểm tra xem dòng tiếp theo có dữ liệu không, nếu có trả về true
			while (resultSet.next()) {
				Department d = new Department(resultSet.getInt("DepartmentID"), resultSet.getString("DepartmentName"));
				results.add(d);
			}
		} catch (SQLException e) {
			System.out.println("Something wrong when query to database.");
			e.printStackTrace();
		}

		return results;
	}

	public boolean isDepartmentIdExists(int id) {
		boolean isExists = false;
		try {
			String sql = "SELECT DepartmentID FROM Department WHERE DepartmentID = ?";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setInt(1, id);
			ResultSet resultSet = preStatement.executeQuery();
			isExists = resultSet.next();
		} catch (SQLException e) {
			System.out.println("Something wrong when query to database.");
			e.printStackTrace();
		}
		return isExists;
	}

	public boolean isDepartmentNameExists(String name) {
		boolean isExists = false;
		try {
			String sql = "SELECT DepartmentName FROM Department WHERE DepartmentName = ?";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setString(1, name);
			ResultSet resultSet = preStatement.executeQuery();
			isExists = resultSet.next();
		} catch (SQLException e) {
			System.out.println("Something wrong when query to database.");
			e.printStackTrace();
		}
		return isExists;
	}

	public void createDepartment(String name) {
		if (isDepartmentNameExists(name)) {
			System.out.printf("Department '%s' is Exists!\n", name);
		} else {
			try {
				String sql = "INSERT INTO Department (DepartmentName) VALUES (?)";
				PreparedStatement preStatement = connection.prepareStatement(sql);
				preStatement.setString(1, name);
				int rowsEffected = preStatement.executeUpdate();
				System.out.println("Row[s] effected: " + rowsEffected);
			} catch (SQLException e) {
				System.out.println("Something wrong when query to database.");
				e.printStackTrace();
			}
		}
	}

	public void updateDepartmentName(int id, String newName) {
		if (!isDepartmentIdExists(id)) {
			System.out.println("Cannot find department which has id = " + id);
		} else {
			try {
				String sql = "UPDATE Department SET DepartmentName = ? WHERE DepartmentID = ?";
				PreparedStatement preStatement = connection.prepareStatement(sql);
				preStatement.setString(1, newName);
				preStatement.setInt(2, id);
				int rowsEffected = preStatement.executeUpdate();
				System.out.println("Row[s] effected: " + rowsEffected);
			} catch (SQLException e) {
				System.out.println("Something wrong when query to database.");
				e.printStackTrace();
			}
		}
	}

	public void deleteDepartment(int id) {
		if (!isDepartmentIdExists(id)) {
			System.out.println("Cannot find department which has id = " + id);
		} else {
			try {
				String sql = "DELETE FROM Department WHERE DepartmentID = ?";
				PreparedStatement preStatement = connection.prepareStatement(sql);
				preStatement.setInt(1, id);
				int rowsEffected = preStatement.executeUpdate();
				System.out.println("Row[s] effected: " + rowsEffected);
			} catch (SQLException e) {
				System.out.println("Something wrong when query to database.");
				e.printStackTrace();
			}
		}
	}
}
