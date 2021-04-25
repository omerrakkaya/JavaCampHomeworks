package Entity;

public class Course {

	public Course() {
		System.out.println("Course için 1. tip constructor kullanýldý");
	};

	public Course(int id, String name, String detail) {
		System.out.println("Course için 2. tip constructor kullanýldý");
		this.id = id;
		this.name = name;
		this.detail = detail;

	};

	 public	 int id;
	 public String name;
	 public	 String detail;

}
