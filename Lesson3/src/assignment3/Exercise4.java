package assignment3;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
//		q1();
//		q2();
//		q3();
//		q4();
//		q5();
//		q6();
//		q7();
		System.out.println(q10("1234", "5321") ? "OK" : "KO");
		System.out.println(q11("abcd"));
		System.out.println(q13("abc1"));
		System.out.println(q14("VTI Academy"));
		System.out.println(q15("I am developer"));
		q16("abcde", 2);
	}

	private static void q1() {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
		String str = " chuoi1 chuoi2  chuoi331 123123";
		char[] str2Char = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str2Char.length - 1;) {
			if (str2Char[i] != ' ' && str2Char[i + 1] == ' ')
				count += 1;
			if (str2Char[i + 1] != ' ' && (i + 1) == str2Char.length - 1)
				count += 1;
			i += 1;
		}
		System.out.println("Số từ = " + count);
		// scan.close();
	}

	private static void q2() {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();
		System.out.println("Cách 1: Cộng chuỗi: " + str1 + str2);
		System.out.println("Cách 2: Concat: " + str1.concat(str2));
	}

	private static String q3(String strInput) {
		char[] strName2Char = strInput.toCharArray();
		String strReturn = String.valueOf(strName2Char[0]).toUpperCase()
				+ String.copyValueOf(strName2Char, 1, strName2Char.length - 1);
		return strReturn;
	}

	private static void q4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào tên: ");
		String strName = scan.nextLine();
		char[] strName2Char = strName.toCharArray();
		for (int i = 0; i < strName2Char.length; i++)
			System.out.printf("Ký tự thứ %d là: %s\n", i + 1, String.valueOf(strName2Char[i]).toUpperCase());
		scan.close();
	}

	private static void q5() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào họ: ");
		String strFirstName = scan.nextLine();
		System.out.print("Nhập vào tên: ");
		String strLastName = scan.nextLine();
		System.out.println("Họ và tên: " + strFirstName + " " + strLastName);
		scan.close();
	}

	private static void q6() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào họ và tên: ");
		String strFullName = scan.nextLine();
		String[] strSplit = strFullName.split(" ");
		System.out.printf("Họ là: %s\nTên đệm là: %s\nTên là: %s", q3(strSplit[0]), q3(strSplit[1]), q3(strSplit[2]));
		scan.close();
	}

	private static void q7() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào họ và tên: ");
		String strFullName = scan.nextLine();
		String normFullName = strFullName.trim();
		String[] strSplit = normFullName.split(" ");
		for (String str : strSplit)
			System.out.print(q3(str) + " ");
		scan.close();
	}

	private static boolean q10(String str1, String str2) {
		boolean check = false;
		if (str1.length() == str2.length()) {
			char[] str1Char = str1.toCharArray();
			char[] str2Char = str2.toCharArray();
			for (int i = 0; i < str1Char.length; i++)
				if (str1Char[i] == str2Char[str1Char.length - 1 - i])
					check = true;
				else {
					check = false;
					break;
				}
		}
		return check;
	}

	private static int q11(String str) {
		char[] str2Char = str.toCharArray();
		int count = 0;
		for (char c : str2Char)
			if (c == 'a')
				count += 1;
		return count;
	}

	private static boolean q13(String str) {
		char[] numbers = "0123456789".toCharArray();
		char[] str2Char = str.toCharArray();
		boolean check = true;
		for (int i = 0; i < str2Char.length; i++) {
			for (char c : numbers)
				if (str2Char[i] == c) {
					check = false;
					break;
				}
		}
		return check;
	}

	private static String q14(String str) {
		return str.replace('e', '*');
	}

	private static String q15(String str) {
		String[] strSplit = str.trim().split(" ");
		String strReturn = "";
		for (int i = strSplit.length - 1; i >= 0; i--) {
			strReturn = strReturn.concat(strSplit[i] + " ");
		}
		return strReturn.trim();
	}

	private static void q16(String str, int n) {
		if (str.length() % n == 0) {
			int numOfSubStr = str.length() / n;
			for (int i = 0; i < numOfSubStr; i++) {
				String subStr = str.substring(n * i, n * i + n);
				System.out.println(subStr);
			}
		}
		else System.out.println("KO");
	}

}
