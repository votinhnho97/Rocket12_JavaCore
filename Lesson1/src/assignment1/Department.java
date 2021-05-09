package assignment1;

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
