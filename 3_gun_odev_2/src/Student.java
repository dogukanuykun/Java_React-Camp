
public class Student extends User{
	private String currentCourse;
	private int successRate;


	public Student(int id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	public String getCurrentCourse() {
		return currentCourse;
	}

	public void setCurrentCourse(String currentCourse) {
		this.currentCourse = currentCourse;
	}
	
	public int getSuccessRate() {
		return successRate;
	}

	public void setSuccessRate(int successRate) {
		this.successRate = successRate;
	}
}
