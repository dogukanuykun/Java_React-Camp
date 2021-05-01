package courses;

public class CourseManager {

	public void begin(Course course) {
		System.out.println("Eğitime başlandı " + course.title);
	}
	
	public void exit(Course course) {
		System.out.println("Eğitimden çıkıldı " + course.title);
	}

}