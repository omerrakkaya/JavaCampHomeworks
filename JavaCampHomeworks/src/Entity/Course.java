package Entity;

public class Course {

	public Course() {
		System.out.println("Course i�in 1. tip constructor kullan�ld�");
	};

	public Course(int id, String name, String detail) {
		System.out.println("Course i�in 2. tip constructor kullan�ld�");
		this.id = id;
		this.name = name;
		this.detail = detail;

	};

	 public	 int id;
	 public String name;
	 public	 String detail;

}
