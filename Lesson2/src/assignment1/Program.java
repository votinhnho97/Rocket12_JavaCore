package assignment1;

import java.util.Date;
import java.util.Random;

public class Program {

	public static void main(String[] args) {

	}

	public Department[] createDepartments() {
		String[] list_department = new String[] { "Marketing", "Sale", "Bảo vệ", "Nhân sự", "Kỹ thuật", "Tài chính",
				"Giám đốc", "Thư ký" };
		Department[] departments = new Department[list_department.length];
		for (int i = 0; i < list_department.length; i++) {
			departments[i] = new Department();
			departments[i].id = i + 1;
			departments[i].name = list_department[i];
		}
		return departments;
	}

	public Position[] createPositions() {
		String[] list_position = new String[] { "Dev", "Test", "Scrum Master", "PM" };
		Position[] positions = new Position[list_position.length];
		for (int i = 0; i < list_position.length; i++) {
			positions[i] = new Position();
			positions[i].id = i + 1;
			positions[i].name = list_position[i];
		}
		return positions;
	}

	public Group[] setGroups(Group[] groups, int sizeOfGroup) {
		Group[] groupsOfAccount = new Group[sizeOfGroup];
		for (int i = 0; i < groupsOfAccount.length; i++) {
			groupsOfAccount[i] = groups[i];
		}
		return groupsOfAccount;
	}

	public Account[] createAccounts(Department[] departments, Position[] positions, Group[] groups) {
		String[] list_email = new String[] { "a@gmail.com", "b@gmail.com", "c@gmail.com", "d@gmail.com" };
		String[] list_username = new String[] { "username_a", "username_b", "username_c", "username_d" };
		String[] list_fullname = new String[] { "fullname_a", "fullname_b", "fullname_c", "fullname_d" };
		String[] list_date = new String[] { "2020/03/05", "2020/03/07", "2020/03/10", "2020/04/05" };
		Account[] accounts = new Account[list_email.length];
		for (int i = 0; i < list_email.length; i++) {
			accounts[i] = new Account();
			accounts[i].id = i + 1;
			accounts[i].email = list_email[i];
			accounts[i].userName = list_username[i];
			accounts[i].fullName = list_fullname[i];
			accounts[i].department = departments[i];
			accounts[i].position = positions[i];
			accounts[i].groups = setGroups(groups, i);
			accounts[i].createDate = new Date(list_date[i]);
		}
		return accounts;
	}

	public Group[] createGroup() {
		String[] list_group = new String[] { "Testing System", "Test", "Developement", "Management" };
		Group[] groups = new Group[list_group.length];
		for (int i = 0; i < list_group.length; i++) {
			groups[i] = new Group();
			groups[i].id = i + 1;
			groups[i].name = list_group[i];
			groups[i].createDate = new Date();
		}
		return groups;
	}
}
