package assignment5.Polymorphism.Interface_Management;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Override
	public void diemDanh() {
		System.out.println(getName() + " điểm danh.");
	}

	@Override
	public void hocBai() {
		System.out.println(getName() + " học bài.");
	}

	@Override
	public void diDonVeSinh() {
		System.out.println(getName() + " đi dọn vệ sinh.");
	}

}
