package courses;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course("Java+React", "Engin Demiroğ", 0);
		Course course2 = new Course("C#+Angular", "Engin Demiroğ", 0);
		
		Course[] courses = {course1,course2};
		
		for(Course course: courses) {
			System.out.println(course.title);
				
		}
		
		CourseManager courseManager = new CourseManager();
		
		for(Course course : courses) {
			courseManager.begin(course);
		}
		for(Course course : courses) {
			courseManager.exit(course);
		}
		
		
	}
}


