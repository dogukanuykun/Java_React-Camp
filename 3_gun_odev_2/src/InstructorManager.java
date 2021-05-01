
public class InstructorManager extends UserManager {
	
	public void addNewCourse(Instructor instructor) {
		System.out.println(instructor.firstName+ " has added new course!");
	}
	public void shareNewHW(Instructor instructor) {
		System.out.println(instructor.firstName + " has added new homework!");
	}
}
