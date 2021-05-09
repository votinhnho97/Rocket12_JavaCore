package assignment4;

import assignment1.Department;

public class Exercise1 {
	public static void main(String[] args) {
		q1();
	}

	private static void q1() {
		Department department1 = new Department();
		System.out.println(department1.toString());
		Department department2 = new Department("Sale");
		System.out.println(department2.toString());
	}
}
