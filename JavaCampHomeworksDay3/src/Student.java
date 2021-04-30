
public class Student extends User {
	String educationStatus;
	int age;
	
	public Student() {
	
	}
	
	public Student(String educationStatus, int age) {
		super();
		this.educationStatus = educationStatus;
		this.age = age;
	}

	public String getEducationStatus() {
		return educationStatus;
	}

	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
