package com.vti.entity;

import java.util.Arrays;

public class Employee<T> {
	private static int count = 0;
	private int id;
	private String name;
	private T[] salaries;

	public Employee(String name, T[] salaries) {
		super();
		this.id = count;
		this.name = name;
		this.salaries = salaries;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getSalaries() {
		return salaries;
	}

	public void setSalaries(T[] salaries) {
		this.salaries = salaries;
	}

	public int getId() {
		return id;
	}

	public void showInfo1() {
		System.out.println("Employee id = " + id + ", name = " + name + ", salary = " + Arrays.toString(salaries));
	}

	public void showInfo2() {
		System.out.println("Employee id = " + id + ", name = " + name + ", salary = " + salaries[salaries.length - 1]);
	}
}
