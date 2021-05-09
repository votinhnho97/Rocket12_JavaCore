package demo;

import java.util.Comparator;

public class SortByAge implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else if (o1.getAge() < o2.getAge())
			return -1;
		return 0;
	}
}
