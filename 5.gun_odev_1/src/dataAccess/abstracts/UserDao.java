package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void createUser(User user);
	void getUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	
}
