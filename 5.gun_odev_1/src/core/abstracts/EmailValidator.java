package core.abstracts;

import entities.concretes.User;

public interface EmailValidator {
	boolean validate(User user);
}
