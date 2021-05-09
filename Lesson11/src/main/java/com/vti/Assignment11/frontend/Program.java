package com.vti.Assignment11.frontend;

import java.util.List;

import com.vti.Assignment11.backend.presentation.AccountController;
import com.vti.Assignment11.entity.Account;

public class Program {
	private static AccountController accountController;

	public static void main(String[] args) {
		accountController = new AccountController();
		showListAccounts();
		System.out.println("===================================================================");
		showAccountById(100);
		System.out.println("===================================================================");
		isAccountExists("sushumen");
		System.out.println("===================================================================");
		isAccountExists(1);
		System.out.println("===================================================================");
		createAccount("email@gmail.com", "username", "fullname");
		System.out.println("===================================================================");
		updateAccountById(22, "new fullname");
		System.out.println("===================================================================");
		deleteAccount(22);
		System.out.println("===================================================================");
	}

	private static void deleteAccount(int id) {
		accountController.deleteAccount(id);
	}

	private static void updateAccountById(int id, String newFullName) {
		accountController.updateAccountById(id, newFullName);
	}

	private static void createAccount(String email, String userName, String fullName) {
		accountController.createAccount(email, userName, fullName);
	}

	private static void isAccountExists(int id) {
		if (accountController.isAccountExists(id)) {
			System.out.printf("Account which has AccountID = `%d` exists!\n", id);
		} else {
			System.out.printf("Account which has AccountID = `%d` not exists!\n", id);
		}
	}

	private static void isAccountExists(String username) {
		if (accountController.isAccountExists(username)) {
			System.out.printf("Account which has Username = `%s` exists!\n", username);
		} else {
			System.out.printf("Account which has Username = `%s` not exists!\n", username);
		}
	}

	private static void showAccountById(int id) {
		Account account = accountController.getAccountById(id);
		System.out.println(account != null ? account.toString() : "");
	}

	private static void showListAccounts() {
		List<Account> accounts = accountController.getListAccounts();
		for (Account account : accounts) {
			System.out.println(account.toString());
		}
	}
}
