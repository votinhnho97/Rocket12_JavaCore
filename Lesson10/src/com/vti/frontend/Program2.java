package com.vti.frontend;

import com.vti.backend.DepartmentDao;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao depDao = new DepartmentDao();
		depDao.connect();
		
		// Question 1
		System.out.println(depDao.getDepartment());
		
		// Question 2, 3
		System.out.println(depDao.getDepartmentByID(5).size() > 0 ? depDao.getDepartmentByID(5) : "Cannot find department which has id = 5");
		
		// Question 4
		System.out.println(depDao.isDepartmentNameExists("Marketing"));
		
		// Question 5
		depDao.createDepartment("Marketing-1");
		
		// Question 6
		depDao.updateDepartmentName(20, "Marketing-2");
		
		// Question 7
		depDao.deleteDepartment(11);
		
		depDao.disconnect();
	}
}
