package assignment3;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		// q1();
		// q2();
		q3(45612);
		// q4();
	}

	static void q1() {
		// Question 1
		float luong1 = 5240.5f;
		float luong2 = 10970.055f;
		int luong1_int = (int) luong1;
		int luong2_int = (int) luong2;
		System.out.println("Lương 1: " + luong1_int + "\nLương 2:" + luong2_int);
	}

	static void q2() {
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		if (randomInt < 10000)
			System.out.printf("%05d\n", randomInt);
		else
			System.out.printf(randomInt + "\n");
	}

	static void q3(int number) {
		System.out.println(number % 100);
	}

	static void q4() {
		// Question 4
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên a = ");
		int a = scan.nextInt();
		System.out.println("Nhập vào số nguyên b = ");
		int b = scan.nextInt();
		System.out.println("Thương a / b = " + thuong(a, b));

		scan.close();
	}

	static float thuong(int a, int b) {
		return (float) a / b;
	}
}
