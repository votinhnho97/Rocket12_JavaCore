package com.vti.Assignment11.backend.data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.Assignment11.entity.Account;
import com.vti.Assignment11.utils.JDBCUtils;
import com.vti.Assignment11.utils.Properties.MessageProperties;

public class AccountRepository implements IAccountRepository {
	private JDBCUtils jdbcUtils;
	private MessageProperties messageProperties;

	public AccountRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
		messageProperties = new MessageProperties();
	}

	public List<Account> getListAccounts() throws SQLException {
		List<Account> accounts = new ArrayList<Account>();
		jdbcUtils.connect();

		Connection connection = jdbcUtils.getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM `Account` ORDER BY `AccountID`";
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt("AccountID");
			String email = resultSet.getString("Email");
			String userName = resultSet.getString("Username");
			String fullName = resultSet.getString("FullName");
			Account account = new Account(id, email, userName, fullName);
			accounts.add(account);
		}
		if (accounts.size() > 0) {
			System.out.println(messageProperties.getValue("account.select.success"));
		} else {
			System.out.println(messageProperties.getValue("account.select.fail"));
		}
		jdbcUtils.disconnect();
		return accounts;
	}

	public Account getAccountById(int id) throws SQLException {
		jdbcUtils.connect();

		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `Account` WHERE AccountID = ?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet resultSet = preStatement.executeQuery();
		Account account = null;
		while (resultSet.next()) {
			String email = resultSet.getString("Email");
			String userName = resultSet.getString("Username");
			String fullName = resultSet.getString("FullName");
			account = new Account(id, email, userName, fullName);
		}
		if (account != null) {
			System.out.println(messageProperties.getValue("account.select.success"));
		} else {
			System.out.println(messageProperties.getValue("account.select.fail"));
		}
		jdbcUtils.disconnect();
		return account;
	}

	public boolean isAccountExists(String username) throws SQLException {
		boolean isExists = false;
		jdbcUtils.connect();

		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `Account` WHERE Username = ?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, username);
		ResultSet resultSet = preStatement.executeQuery();
		isExists = resultSet.next() ? true : false;

		jdbcUtils.disconnect();
		return isExists;
	}

	public boolean isAccountExists(int id) throws SQLException {
		boolean isExists = false;
		jdbcUtils.connect();

		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `Account` WHERE AccountID = ?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		ResultSet resultSet = preStatement.executeQuery();
		isExists = resultSet.next() ? true : false;

		jdbcUtils.disconnect();
		return isExists;
	}

	public void createAccount(String email, String userName, String fullName) throws SQLException {
		jdbcUtils.connect();

		Connection connection = jdbcUtils.getConnection();
		String sql = "INSERT INTO `Account` (Email, Username, FullName, DepartmentID, PositionID) VALUES (?, ?, ?, 0, 0)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, email);
		preStatement.setString(2, userName);
		preStatement.setString(3, fullName);
		int rowsEffected = preStatement.executeUpdate();
		if (rowsEffected > 0) {
			System.out.println(messageProperties.getValue("account.insert.success"));
		} else {
			System.out.println(messageProperties.getValue("account.insert.fail"));
		}
		jdbcUtils.disconnect();
	}

	public void updateAccountById(int id, String newFullName) throws SQLException {
		jdbcUtils.connect();

		Connection connection = jdbcUtils.getConnection();
		String sql = "UPDATE `Account` SET FullName = ? WHERE AccountID = ?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, newFullName);
		preStatement.setInt(2, id);
		int rowsEffected = preStatement.executeUpdate();
		System.out.println(rowsEffected > 0 ? messageProperties.getValue("account.update.success")
				: messageProperties.getValue("account.update.fail"));

		jdbcUtils.disconnect();
	}

	public void deleteAccount(int id) throws SQLException {
		jdbcUtils.connect();
		
		Connection connection = jdbcUtils.getConnection();
		String sql = "DELETE FROM `Account` WHERE AccountID = ?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int rowsEffected = preStatement.executeUpdate();
		System.out.println(rowsEffected > 0 ? messageProperties.getValue("account.delete.success")
				: messageProperties.getValue("account.delete.fail"));
		
		jdbcUtils.disconnect();
	}

}
