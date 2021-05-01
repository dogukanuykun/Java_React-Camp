
public class StudentManager extends UserManager {
	
	public void takeNewCourse(Student student,String courseName) {
		System.out.println(student.getFirstName()+" has joined the course: "+courseName);
	}
	
}
