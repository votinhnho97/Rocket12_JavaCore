package com.vti.entity;

public class Student1 {
	private static int count = 0;
	private int id;
	private String name;

	public Student1(String name) {
		super();
		this.name = name;
		this.id = count;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
