package core.concretes;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.abstracts.EmailValidator;
import entities.concretes.User;


public class RegexValidator implements EmailValidator {

	@Override
	public boolean validate(User user) {
		String email = user.getEmail();
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			return true;
		}else {
			return false;
		}
	}

}
