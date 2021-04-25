package Entity;

public class Student {

	public Student() {
		System.out.println("Student için 1. tip constructor kullanýldý");
	};

	public Student(int id, String name, String lastName, String detail) {
		System.out.println("Student için 2. tip constructor kullanýldý");
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.detail = detail;

	};

	public int id;
	public String name;
	public String lastName;
	public String detail;

}
