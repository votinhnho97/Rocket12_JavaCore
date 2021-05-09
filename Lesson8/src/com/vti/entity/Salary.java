package com.vti.entity;

public class Salary<T extends Number> {
	private T salaries;

	public Salary(T salaries) {
		super();
		this.salaries = salaries;
	}

	public T getSalaries() {
		return salaries;
	}

	public void setSalaries(T salaries) {
		this.salaries = salaries;
	}

	public void showSalaries() {
		System.out.println(salaries.toString());
	}
}
