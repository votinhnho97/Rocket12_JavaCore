package assignment4;

/*
 * Exercise 4:
 */
public class Student {
	private int id;
	private String name;
	private String hometown;
	private float point;

	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.point = 0f;
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public void addPoint(float point) {
		this.point += point;
	}

	public String toString() {
		String hocLuc = "";
		if (this.point < 4.0f)
			hocLuc = "Yếu";
		else if (this.point > 4.0f && this.point < 6.0f)
			hocLuc = "Trung bình";
		else if (this.point > 6.0 && this.point < 8.0f)
			hocLuc = "Khá";
		else
			hocLuc = "Giỏi";
		return "Tên: " + this.name + "\nHọc lực: " + hocLuc;
	}
}
