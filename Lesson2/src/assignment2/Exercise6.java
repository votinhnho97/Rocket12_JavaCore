package assignment2;

import assignment1.Account;

public class Exercise6 {
	public static void main(String[] args) {
		q1();
	}

	static void q1() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i % 2 == 0 ? i + ", ": "");
		}
	}

	static void q2(Account[] accounts) {
		for (Account acc : accounts) {
			acc.toString();
		}
	}

	static void q3() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
	}
}
