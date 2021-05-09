package assignment4.Exercise5.HighSchool;

public abstract class Student extends Person {
	private int id;

	public Student(int id, String name) {
		super(name);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
