package com.vti.Assignment11.backend.business;

import java.util.List;

import com.vti.Assignment11.entity.Account;

public interface IAccountService {
	List<Account> getListAccounts();

	Account getAccountById(int id);

	boolean isAccountExists(String username);

	boolean isAccountExists(int id);

	void createAccount(String email, String userName, String fullName);

	void updateAccountById(int id, String newFullName);

	void deleteAccount(int id);
}
