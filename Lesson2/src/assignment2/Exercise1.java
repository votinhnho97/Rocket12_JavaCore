package assignment2;

import assignment1.*;

public class Exercise1 {
	public static void main(String[] args) {
		Program p = new Program();

		Department[] departments;
		departments = p.createDepartments();

		Position[] positions;
		positions = p.createPositions();

		Group[] groups;
		groups = p.createGroup();

		Account[] accounts;
		accounts = p.createAccounts(departments, positions, groups);

		// Question 1
		System.out.println("\nQuestion 1");
		if (accounts[1].department == null) {
			System.out.println("Nhân viên này chưa có phòng ban.");
		} else {
			System.out.println("Phòng ban của nhân viên là " + accounts[1].department.name);
		}
		// Question 2
		System.out.println("\nQuestion 2");
		int account_id = 1;
		if (accounts[account_id].groups.length == 0) {
			System.out.println("Nhân viên này chưa có group.");
		} else if (accounts[account_id].groups.length == 1) {
			System.out.println("Nhân viên này tham gia 1 group.");
		} else if (accounts[account_id].groups.length == 2) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group.");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện.");
		}
		// Question 3
		System.out.println("\nQuestion 3");
		System.out.println(accounts[1].department == null ? "Nhân viên này chưa có phòng ban."
				: "Phòng ban của nhân viên là " + accounts[1].department.name);
		// Question 4
		System.out.println("\nQuestion 4");
		System.out.println(accounts[0].position.name == "Dev" ? "Developer" : "Không phải Developer");
		// Question 5 chưa xong
		System.out.println("\nQuestion 5");
		int[] countGroup = new int[groups.length];
		for (int i = 0; i < countGroup.length; i++) {

		}
		for (Account account : accounts) {
			System.out.println(account.fullName);
			for (Group group : account.groups) {
				System.out.println("\t" + group.name);
			}
		}
		// Question 6
		System.out.println("\nQuestion 6");
		switch (accounts[account_id].groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa có group.");
			break;
		case 1:
			System.out.println("Nhân viên này tham gia 1 group.");
			break;
		case 2:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group.");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện.");
			break;
		}
		// Question 7
		System.out.println("\nQuestion 7");
		switch (accounts[0].position.name) {
		case "Dev":
			System.out.println("Developer");
			break;
		default:
			System.out.println("Không phải Developer");
			break;
		}
		// Question 8
		System.out.println("\nQuestion 8");
		for (Account account : accounts) {
			System.out.println("AccountID: " + account.id + "\n\tEmail: " + account.email + "\n\tFullname: "
					+ account.fullName + "\n\tDepartment: " + account.department.name);
		}
		// Question 9
		System.out.println("\nQuestion 9");
		for (Department department : departments) {
			System.out.println("DepartmentID: " + department.id + "\nDepartmentName: " + department.name);
		}
		// Question 10
		System.out.println("\nQuestion 10");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department);
			System.out.println("\n");
		}

		// Question 11
		System.out.println("\nQuestion 11");
		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			System.out.println("\n");
		}

		// Question 13
		System.out.println("\nQuestion 13");
		for (int i = 0; i < accounts.length; i++) {
			if (i == 1)
				continue;
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department);
			System.out.println("\n");
		}

		// Question 14
		System.out.println("\nQuestion 14");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].id < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullName);
				System.out.println("Department: " + accounts[i].department);
				System.out.println("\n");
			}
		}

		// Question 15
		System.out.println("\nQuestion 15");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.print(i + ", ");
		}
		System.out.println("\n");

		// Question 16
		System.out.println("\nQuestion 16. Dùng While cho question 10.");
		int i = 0;
		while (i < accounts.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department);
			System.out.println("\n");
			i++;
		}
		System.out.println("\nQuestion 16. Dùng While cho question 11.");
		i = 0;
		while (i < departments.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			System.out.println("\n");
			i++;
		}

		// Question 17
		System.out.println("\nQuestion 17. Dùng While cho question 10.");
		i = 0;
		do {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department);
			System.out.println("\n");
			i++;
		} while (i < accounts.length);
		System.out.println("\nQuestion 17. Dùng While cho question 11.");
		i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			System.out.println("\n");
			i++;
		} while (i < departments.length);
	}
}
