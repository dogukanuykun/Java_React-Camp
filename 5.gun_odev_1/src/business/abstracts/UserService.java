package business.abstracts;

import java.util.ArrayList;

import entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void deleteMyAccount(User user);
	boolean hasInSystem(User user,ArrayList<String> mailList);

	
	
	
}
