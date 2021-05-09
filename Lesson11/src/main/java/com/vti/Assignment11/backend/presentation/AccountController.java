package com.vti.Assignment11.backend.presentation;

import java.util.List;

import com.vti.Assignment11.backend.business.AccountService;
import com.vti.Assignment11.backend.business.IAccountService;
import com.vti.Assignment11.entity.Account;

public class AccountController {
	private IAccountService accountService;

	public AccountController() {
		accountService = new AccountService();
	}

	public List<Account> getListAccounts() {
		return accountService.getListAccounts();
	}

	public Account getAccountById(int id) {
		if (!isAccountExists(id)) {
			System.out.printf("Account which has AccountID = `%d` not exists!\n", id);
		} else {
			return accountService.getAccountById(id);
		}
		return null;
	}

	public boolean isAccountExists(String username) {
		return accountService.isAccountExists(username);
	}

	public boolean isAccountExists(int id) {
		return accountService.isAccountExists(id);
	}

	public void createAccount(String email, String userName, String fullName) {
		if (isAccountExists(userName)) {
			System.out.printf("Account which has Username = `%s` exists!\n", userName);
		} else {
			accountService.createAccount(email, userName, fullName);
		}
	}

	public void updateAccountById(int id, String newFullName) {
		if (!isAccountExists(id)) {
			System.out.printf("Account which has AccountID = `%d` not exists!\n", id);
		} else {
			accountService.updateAccountById(id, newFullName);
		}
	}

	public void deleteAccount(int id) {
		if (!isAccountExists(id)) {
			System.out.printf("Account which has AccountID = `%d` not exists!\n", id);
		} else {
			accountService.deleteAccount(id);
		}
	}

}
