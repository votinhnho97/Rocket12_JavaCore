package com.vti.entity;

public class Student2<T> {
	private T id;
	private String name;

	public Student2(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getId() {
		return id;
	};

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
