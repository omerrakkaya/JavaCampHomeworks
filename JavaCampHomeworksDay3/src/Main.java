
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "�mer";
		student1.lastName = "Akkaya";
		student1.age = 32;
		student1.email = "omer@akkaya.com";
		student1.password = "123";
		student1.educationStatus = "Civil Engineer";

		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiro�";
		instructor1.email = "engin@demirog.com";
		instructor1.password = "123";
		instructor1.certifications = "MCT PMP, ITIL";

		UserManager userManager = new UserManager();
		userManager.editProfile(instructor1);
		userManager.logIn(instructor1);
		userManager.logOut(instructor1);
		userManager.editProfile(student1);
		userManager.logIn(student1);
		userManager.logOut(student1);

		System.out.println("-----------------------------");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse();
		instructorManager.deleteCourse();
		instructorManager.editProfile(instructor1);

		System.out.println("-----------------------------");

		StudentManager studentManager = new StudentManager();

		studentManager.attendCourse();

	}

}
