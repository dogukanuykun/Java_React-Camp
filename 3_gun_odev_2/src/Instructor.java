
public class Instructor extends User {
	private String instCourse;
	
	public Instructor(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
		
	}

	public String getInstCourse() {
		return instCourse;
	}

	public void setInstCourse(String instCourse) {
		this.instCourse = instCourse;
	}



}
