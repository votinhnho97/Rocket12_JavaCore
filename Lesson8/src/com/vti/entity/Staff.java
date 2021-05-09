package com.vti.entity;

public class Staff<T> extends MyMap<T, String> {

	public Staff(T key, String value) {
		super(key, value);
	}

	public String getName() {
		return super.getValue();
	}

	public T getID() {
		return super.getKey();
	}
}
