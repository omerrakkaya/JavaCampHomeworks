package Entity;

public class Student {

	public Student() {
		System.out.println("Student i�in 1. tip constructor kullan�ld�");
	};

	public Student(int id, String name, String lastName, String detail) {
		System.out.println("Student i�in 2. tip constructor kullan�ld�");
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
