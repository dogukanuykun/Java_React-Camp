
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Dogukan","Uykun");
		Instructor instructor = new Instructor(2, "Engin", "Demiroğ");
		
		UserManager userManager = new UserManager();
		
		userManager.addNewUser(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addNewCourse(instructor);
		
		instructorManager.shareNewHW(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.takeNewCourse(student1, "Java+React");
		
		
		
		
		
	}

}
