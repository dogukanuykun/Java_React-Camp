import java.util.ArrayList;

public class UserManager implements MemberManager {
	private Confirmatory confirmatory;
	
	public UserManager(Confirmatory confirmatory) {
		this.confirmatory = confirmatory;
	}

	@Override
	public void register(User user) {
		confirmatory.confirmMember(user);
		System.out.println("Registered.");
	}

	@Override
	public void setMyInfos(User user) {
		System.out.println("The changes have been saved");
	}

	@Override
	public void delete(User user) {
		confirmatory.confirmMember(user);
		System.out.println("Account has successfully deleted");
		
	}

	@Override
	public void login(User user) {
		confirmatory.confirmMember(user);
		System.out.println("Welcome back "+user.getFirstName());
		
	}
	
	public ArrayList<Game> showMyLib(User user){
		return user.getGames();
	}
	

	

}
