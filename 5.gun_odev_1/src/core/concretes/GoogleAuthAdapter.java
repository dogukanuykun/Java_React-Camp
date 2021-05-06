package core.concretes;

import Google.GoogleAuth;
import business.abstracts.UserService;
import core.abstracts.AuthService;
import entities.concretes.User;

public class GoogleAuthAdapter implements AuthService {
	private UserService userService;
	
	public GoogleAuthAdapter(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void auth(User user) {
		GoogleAuth googleAuth = new GoogleAuth();
		googleAuth.authUserWithGoogle(user);
	}

}
