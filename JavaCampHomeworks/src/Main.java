import Business.CourseManager;
import Entity.Course;
import Entity.Student;

public class Main {

	public static void main(String[] args) {
	
		Student student1= new Student(1,"Ömer","Akkaya","1.grup öğrenci");
		Student student2= new Student();
		
		student2.id=2;
		student2.name="Arel";
		student2.lastName="Akkaya";
		student2.detail="2. grup öğrenci";
		
		Student[] students = { student1,student2};
		for (Student student : students) {
			System.out.println(student.name);
		}
		
	
	Course course1=new Course(1,"C#","C# ve ANGULAR");
	Course course2=new Course();
	
	course2.id=2;
	course2.name="Java";
	course2.detail="JAVA ve REACT";
	
	CourseManager courseManager = new CourseManager();
	courseManager.addCourse(course1);
	courseManager.updateCourse(course2);
	
	
	
	}
}
