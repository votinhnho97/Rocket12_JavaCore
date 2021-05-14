package com.vti.FinalExam.entity;

public class Employee extends User {
	private int projectID;
	private String proSkill;

	public Employee(int id, String fullName, String email, String passWord, int projectID, String proSkill) {
		super(id, fullName, email, passWord);
		this.projectID = projectID;
		this.proSkill = proSkill;
	}

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

}
