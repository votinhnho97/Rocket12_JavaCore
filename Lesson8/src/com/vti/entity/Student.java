package com.vti.entity;

import java.util.Date;

public class Student implements Comparable<Student> {
	private static int count = 0;
	private int id;
	private String name;
	private Date birthday;
	private float point;

	public Student(String name, Date birthday, float point) {
		super();
		this.id = count;
		this.name = name;
		this.birthday = birthday;
		this.point = point;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.getName());
	}

}
