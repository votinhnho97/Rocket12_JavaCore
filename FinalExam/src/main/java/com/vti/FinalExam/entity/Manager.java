package com.vti.FinalExam.entity;

public class Manager extends User {
	private int expInYear;

	public Manager(int id, String fullName, String email, String passWord, int expInYear) {
		super(id, fullName, email, passWord);
		this.expInYear = expInYear;
	}

	public float getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

}
