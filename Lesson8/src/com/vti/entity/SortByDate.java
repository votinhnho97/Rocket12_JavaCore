package com.vti.entity;

import java.util.Comparator;

public class SortByDate implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
//		if(o1.getBirthday() > o2.getBirthday())
//			return 1;
//		else if (o1.getBirthday() < o2.getBirthday())
//			return -1;
		return o1.getBirthday().compareTo(o2.getBirthday());
	}
}
