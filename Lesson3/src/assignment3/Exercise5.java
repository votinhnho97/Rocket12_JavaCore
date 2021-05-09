package assignment3;

import assignment1.Department;

public class Exercise5 {
	public static void main(String[] args) {
		q1(createDepartments());
		q2(createDepartments());
		q6();
	}

	private static void q1(Department[] departments) {
		System.out.println(departments[0].toString());
	}

	private static void q2(Department[] departments) {
		for (Department dep : departments)
			System.out.println(dep.toString());
	}

	private static Department[] createDepartments() {
		String[] strDeps = "Security,Accounting,Boss of director,Marketing,Sale,Waiting room".split(",");
		Department[] departments = new Department[strDeps.length];
		for (int i = 0; i < strDeps.length; i++) {
			departments[i] = new Department();
			departments[i].id = i;
			departments[i].name = strDeps[i];
		}
		return departments;
	}

	private static void q6() {
		Department[] departments = createDepartments();
		for (int i = 0; i < departments.length - 1; i++) {
			for (int j = i + 1; j < departments.length; j++) {
				if (departments[i].name.charAt(0) > departments[j].name.charAt(0)) {
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		for (Department d : departments)
			System.out.printf("%s, ", d.name);
	}

}
