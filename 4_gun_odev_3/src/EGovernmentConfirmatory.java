
public class EGovernmentConfirmatory implements Confirmatory{

	@Override
	public void confirmMember(User user) {
		System.out.println("User confirmed by e-government. TC: "+user.getTcNo());
		
	}
	

}
