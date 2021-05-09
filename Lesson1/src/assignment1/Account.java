package assignment1;

import java.util.Arrays;
import java.util.Date;

public class Account {
	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department department;
	public Position position;
	public Group[] groups;
	public Date createDate;

	public Account() {

	}

	public Account(int id, String email, String userName, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
	}

	public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.position = position;
		this.createDate = new Date();
	}

	public Account(int id, String email, String userName, String firstName, String lastName, Position position,
			Date createDate) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName + lastName;
		this.position = position;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", groups=" + Arrays.toString(groups)
				+ ", createDate=" + createDate + "]";
	}
}
