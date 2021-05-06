import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.abstracts.EmailValidator;
import core.concretes.GoogleAuthAdapter;
import core.concretes.RegexValidator;
import dataAccess.concretes.DatabaseDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Dogukan","Uykun","dogukan@gmail.com","123456");
		
		ArrayList<String> emails = new ArrayList<String>();
		UserService userService = new UserManager(new RegexValidator(), new DatabaseDao(),emails);
		
		//userService.register(user1);
		
		GoogleAuthAdapter authAdapter = new GoogleAuthAdapter(userService);
		authAdapter.auth(user1);

		
		
		
		
		
		
		
	}

}
