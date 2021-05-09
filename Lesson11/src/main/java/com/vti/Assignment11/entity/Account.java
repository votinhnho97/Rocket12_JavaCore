package com.vti.Assignment11.entity;

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

	public Account(int id, String email, String userName, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName + "]";
	}

}
