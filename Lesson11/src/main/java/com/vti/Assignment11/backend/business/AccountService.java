package com.vti.Assignment11.backend.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.Assignment11.backend.data.AccountRepository;
import com.vti.Assignment11.backend.data.IAccountRepository;
import com.vti.Assignment11.entity.Account;

public class AccountService implements IAccountService {
	private IAccountRepository accountRepository;

	public AccountService() {
		try {
			accountRepository = new AccountRepository();
		} catch (FileNotFoundException e) {
			System.out.println("File `database.properties` not found!");
		} catch (IOException e) {
			System.out.println("File `database.properties` can not access!");
		}
	}

	public List<Account> getListAccounts() {
		try {
			return accountRepository.getListAccounts();
		} catch (SQLException e) {
			System.out.println("Wrong query! Please check query again!");
		}
		return null;
	}

	public Account getAccountById(int id) {
		try {
			return accountRepository.getAccountById(id);
		} catch (SQLException e) {
			System.out.println("Wrong query! Please check query again!");
		}
		return null;
	}

	public boolean isAccountExists(String username) {
		try {
			return accountRepository.isAccountExists(username);
		} catch (SQLException e) {
			System.out.println("Wrong query! Please check query again!");
		}
		return false;
	}

	public boolean isAccountExists(int id) {
		try {
			return accountRepository.isAccountExists(id);
		} catch (SQLException e) {
			System.out.println("Wrong query! Please check query again!");
		}
		return false;
	}

	public void createAccount(String email, String userName, String fullName) {
		try {
			accountRepository.createAccount(email, userName, fullName);
		} catch (SQLException e) {
			System.out.println("Wrong query! Please check query again!");
		}
	}

	public void updateAccountById(int id, String newFullName) {
		try {
			accountRepository.updateAccountById(id, newFullName);
		} catch (SQLException e) {
			System.out.println("Wrong query! Please check query again!");
		}
	}

	public void deleteAccount(int id) {
		try {
			accountRepository.deleteAccount(id);
		} catch (SQLException e) {
			System.out.println("Wrong query! Please check query again!");
		}
	}

}
