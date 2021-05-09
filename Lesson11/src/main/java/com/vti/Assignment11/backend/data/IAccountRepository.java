package com.vti.Assignment11.backend.data;

import java.sql.SQLException;
import java.util.List;

import com.vti.Assignment11.entity.Account;

public interface IAccountRepository {
	List<Account> getListAccounts() throws SQLException;

	Account getAccountById(int id) throws SQLException;

	boolean isAccountExists(String username) throws SQLException;

	boolean isAccountExists(int id) throws SQLException;

	void createAccount(String email, String userName, String fullName) throws SQLException;

	void updateAccountById(int id, String newFullName) throws SQLException;

	void deleteAccount(int id) throws SQLException;
}
