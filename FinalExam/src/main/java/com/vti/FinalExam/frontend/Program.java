package com.vti.FinalExam.frontend;

import java.util.List;
import java.util.Scanner;

import com.vti.FinalExam.backend.controller.ManagerController;
import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;
import com.vti.FinalExam.utils.Regex;

public class Program {
	private static ManagerController managerController;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		managerController = new ManagerController();
		showUserInProject();
		System.out.println();
		showAllManager();
		System.out.println();
		login();
		scanner.close();
	}

	/*
	 * Viết function để user nhập vào id project, sau đó in ra tất cả các employee &
	 * Manager trong project đó (in ra dạng table)
	 */
	static void showUserInProject() {
		System.out.print("Nhập vào projectID: ");
		int projectId = scanner.nextInt();
		List<User> users = managerController.getUserInProject(projectId);
		System.out.println("Danh sách các employee và manager trong project:");
		System.out.printf("%-10s %-20s %-10s\n", "ProjectId", "FullName", "Role");
		for (User user : users) {
			if (user instanceof Manager)
				System.out.printf("%-10s %-20s %-10s\n", projectId, user.getFullName(), "Manager");
			else
				System.out.printf("%-10s %-20s %-10s\n", projectId, user.getFullName(), "Employee");
		}
	}

	/*
	 * Viết function để user có thể lấy ra tất cả Manager của các project (in ra
	 * dạng table)
	 */
	static void showAllManager() {
		System.out.println("Danh sách các Manager của các Project.");
		List<User> users = managerController.getAllManager();
		System.out.printf("%-5s %-20s %-20s\n", "Id", "FullName", "Email");
		for (User user : users) {
			System.out.printf("%-5s %-20s %-20s\n", user.getId(), user.getFullName(), user.getEmail());
		}
	}

	/*
	 * Viết chức năng login, User sẽ nhập Email và Password trên giao diện login
	 * Chương trình phải kiểm tra được các hợp lệ của các thuộc tính  Email: đúng
	 * định dạng email. (VD: nguyen.vannam@vti.com.vn)  Password: nhập từ 6 tới 12
	 * ký tự, có ít nhất 1 ký tự viết hoa
	 */
	static void login() {
		System.out.print("Nhập email: ");
		String email = scanner.next();
		System.out.print("Nhập password: ");
		String passWord = scanner.next();
		if (!Regex.isEmailFormat(email)) {
			System.out.println("Email không đúng định dạng.");
		} else if (!Regex.isPasswordFormat(passWord, "^(?=.*[A-Z]).{6,12}$"))
			System.out.println("Password không đúng định dạng.");
		else {
			User user = managerController.login(email, passWord);
			if (user == null)
				System.out.println("Đăng nhập thất bại. Kiểm tra email & password.");
			else {
				System.out.println("Đăng nhập thành công.");
				System.out.println(user.toString());
			}
		}
	}
}
