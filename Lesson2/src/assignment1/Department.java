/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Thanh Trung
 */
public class Department {
	public int id;
	public String name;

	public Department() {
	}

	public Department(String nameDepartment) {
		this.name = nameDepartment;
		this.id = 0;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
