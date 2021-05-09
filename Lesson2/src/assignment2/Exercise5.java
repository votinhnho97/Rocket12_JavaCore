package assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import assignment1.*;

public class Exercise5 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		// Question 1
		System.out.println("Nhập vào 1 số nguyên: ");
		int int1 = scan.nextInt();
		System.out.println("Nhập vào 1 số nguyên: ");
		int int2 = scan.nextInt();
		System.out.println("Nhập vào 1 số nguyên: ");
		int int3 = scan.nextInt();

		// Question 2
		System.out.println("Nhập vào 1 số thực: ");
		float float1 = scan.nextFloat();
		System.out.println("Nhập vào 1 số thực: ");
		float float2 = scan.nextFloat();

		// Question 3
		System.out.println("Nhập vào họ: ");
		String strHo = scan.next();
		System.out.println("Nhập vào tên: ");
		String strTen = scan.next();

		// Question 4
		System.out.println("Nhập vào ngày sinh nhật (mm-dd-yyyy): ");
		String dateInput = scan.next();
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dateInput);
		System.out.println("Input: " + date);

		// Question 5
		System.out.println("Nhập vào ID Position (1 - 4): ");
		int positionID = scan.nextInt();
		System.out.println("Vị trí = " + createAccount(positionID).position.name);

		// Question 6
		System.out.println("Nhập vào DepartmentID: ");
		int departmentID = scan.nextInt();
		System.out.println("Nhập vào DepartmentName: ");
		String departmentName = scan.nextLine();

		// Question 7
		int a = 0;
		do {
			System.out.println("Nhập vào số chẵn: ");
			a = scan.nextInt();
		} while (a % 2 == 0);

		// Question 8
		int funcID = 0;
		do {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			funcID = scan.nextInt();
		} while (funcID != 1 && funcID != 2);
		if (funcID == 1)
			createAccount(1);
		else
			createDepartment(1, "Sale");
		
		// Question 10
		do {
			System.out.println("Mời bạn nhập vào chức năng muốn sử dụng: ");
			funcID = scan.nextInt();
			
			switch (funcID) {
			case 1:
				createAccount(1);
				break;
			case 2:
				createDepartment(1, "Sale");
				break;
			case 3:
				System.out.println("Thêm group...");
				break;
			default:
				System.out.println("Mời bạn nhập lại.");
				break;
			}
		} while (funcID != 1 && funcID != 2 && funcID != 3);

		scan.close();
	}

	static Account createAccount(int position) {
		Account accountObj = new Account();
		Position positionObj = new Position();
		switch (position) {
		case 1:
			positionObj.id = 1;
			positionObj.name = "Dev";
			break;
		case 2:
			positionObj.id = 2;
			positionObj.name = "Test";
			break;
		case 3:
			positionObj.id = 3;
			positionObj.name = "ScrumMaster";
			break;
		case 4:
			positionObj.id = 4;
			positionObj.name = "PM";
			break;
		}
		accountObj.position = positionObj;
		return accountObj;
	}

	static Department createDepartment(int id, String name) {
		Department department = new Department();
		department.id = id;
		department.name = name;
		return department;
	}
}
