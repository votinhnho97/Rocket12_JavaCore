package assignment3;

import java.util.Date;

import assignment1.Account;

public class Exercise2 {
	public static void main(String[] args) {
		q1();
	}

	static void q1() {
		Account[] accounts = new Account[5];
		for (Account acc : accounts) {
			acc.email = "Email 1";
			acc.userName = "Username 1";
			acc.fullName = "Fullname 1";
			acc.createDate = new Date();
		}
	}
}
