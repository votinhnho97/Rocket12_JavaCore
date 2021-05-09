package com.vti.entity;

import java.util.Comparator;

public class SortByPoint implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getPoint() > o2.getPoint())
			return 1;
		else if (o1.getPoint() < o2.getPoint())
			return -1;
		return 0;
	}
}
