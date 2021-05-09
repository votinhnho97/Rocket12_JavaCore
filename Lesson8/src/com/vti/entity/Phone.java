package com.vti.entity;

public class Phone<T> extends MyMap<T, String>{

	public Phone(T key, String phone) {
		super(key, phone);
	}
	
	public String getPhoneNumber() {
		return super.getValue(); 
	}
	
	public T getKey() {
		return super.getKey();
	}
}
