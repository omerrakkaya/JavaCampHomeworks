package Business;

import Entity.Course;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println("Yeni kurs eklendi:" + course.name);
	
	}
	
	public void updateCourse(Course course) {
		System.out.println(course.name + "kursu güncellendi!");
	}
}

