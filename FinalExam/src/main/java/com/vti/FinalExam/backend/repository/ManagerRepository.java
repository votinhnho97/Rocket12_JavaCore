package com.vti.FinalExam.backend.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.FinalExam.entity.Employee;
import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;
import com.vti.FinalExam.utils.JDBCUtils;

public class ManagerRepository implements IManagerRepository {
	private JDBCUtils jdbcUtils;

	public ManagerRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	public List<User> getUserInProject(int projectId) throws SQLException {
		List<User> users = new ArrayList<User>();
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `ProjectAndUser` pau JOIN `User` u ON u.id = pau.userId WHERE pau.projectId = ?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, projectId);
		ResultSet resultSet = preStatement.executeQuery();
		while (resultSet.next()) {
			int userId = resultSet.getInt("userId");
			String email = resultSet.getString("email");
			String fullName = resultSet.getString("fullName");
			String role = resultSet.getString("Role");
			String passWord = resultSet.getString("password");
			if (role.equals("MANAGER"))
				users.add(new Manager(userId, fullName, email, passWord, 0));
			else {
				users.add(new Employee(userId, fullName, email, passWord, projectId, null));
			}
		}
		jdbcUtils.disconnect();
		return users;
	}

	public List<User> getAllManager() throws SQLException {
		List<User> managers = new ArrayList<User>();
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `User` u JOIN ProjectAndUser pau ON u.id = pau.userId WHERE pau.Role = 'MANAGER'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int userId = resultSet.getInt("userId");
//			int projectId = resultSet.getInt("projectId");
			String fullName = resultSet.getString("fullName");
			String email = resultSet.getString("email");
			String passWord = resultSet.getString("password");
//			String Role = resultSet.getString("Role");
			managers.add(new Manager(userId, fullName, email, passWord, 0));
		}

		jdbcUtils.disconnect();
		return managers;
	}

	public User login(String email, String passWord) throws SQLException {
		User user = null;
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `User` WHERE email = ? AND `password` = ?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, email);
		preStatement.setString(2, passWord);
		ResultSet resultSet = preStatement.executeQuery();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String fullName = resultSet.getString("fullName");
			user = new User(id, fullName, email, passWord);
		}
		jdbcUtils.disconnect();
		return user;
	}

}
