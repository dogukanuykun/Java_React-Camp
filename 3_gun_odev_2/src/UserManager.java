
public class UserManager {
	
	public void showUser(User user) {
		System.out.println("Id : "+user.getId());
		System.out.println("Name : "+user.getFirstName());
		System.out.println("Surname : "+user.getLastName());
	}
	
	public void addNewUser(User user) {
		System.out.println(user.getFirstName()+ " has successfully added");
	}
	
	public void deleteCurrentUser(User user) {
		System.out.println(user.getFirstName()+ " has successfully deleted");
	}
	
}
