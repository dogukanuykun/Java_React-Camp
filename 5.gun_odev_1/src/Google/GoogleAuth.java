package Google;

import entities.concretes.User;

public class GoogleAuth {
	public void authUserWithGoogle(User user) {
		System.out.println("Google ile doğrulandı "+ user.getEmail());
	}
	
}
