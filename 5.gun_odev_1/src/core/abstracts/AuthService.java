package core.abstracts;

import entities.concretes.User;

public interface AuthService {
	void auth(User user);
}
