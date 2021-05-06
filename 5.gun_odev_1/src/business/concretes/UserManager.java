package business.concretes;


import java.util.ArrayList;
import java.util.Scanner;

import business.abstracts.UserService;
import core.abstracts.EmailValidator;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private EmailValidator emailValidator;
	private UserDao userDao;
	private ArrayList<String> emailList;
	
	public UserManager(EmailValidator emailValidator, UserDao userDao,ArrayList<String> emailList) {
		this.emailValidator = emailValidator;
		this.userDao = userDao;
		this.emailList = emailList;
	}
	
	@Override
	public boolean hasInSystem(User user,ArrayList<String> mailList) {
		if(mailList.isEmpty()) {
			return false;
		}else {
			for(String email: mailList) {
				if(email==user.getEmail()) 
					return true;
			}
			return false;
		}

	}

	@Override
	public void register(User user) {
		if(hasInSystem(user,emailList)) {
			System.out.println("Bu email'e kay�tl� kullan�c� bulunmaktad�r. L�tfen login olunuz!");
		}
		else {
			if(emailValidator.validate(user) && user.getPassword().length()>=6 && user.getName().length()>=2 && user.getSurname().length()>=2) {
				System.out.println("Do�rulama i�in mail g�nderildi.");//simulate
				Scanner validationMail = new Scanner(System.in);
				String response = validationMail.nextLine();
				if(response=="linked") {
					emailList.add(user.getEmail());
					userDao.createUser(user);
				}else {
					System.out.println("Do�rulama ba�ar�s�z.");
				}

			}	
		}
	}

	@Override
	public void login(User user) {
		if(hasInSystem(user, emailList)) {
			userDao.getUser(user);
			System.out.println("Ho�geldiniz.");
		}
		else {
			System.out.println("Sistemde kayd�n�z yok. L�tfen �ye olunuz!");
		}
		
	}

	@Override
	public void deleteMyAccount(User user) {
		try {
			emailList.remove(user.getEmail());
		}catch (Exception e) {
			System.out.println("B�yle bir kullan�c� mevcut de�il!");
			return;
		}
		userDao.deleteUser(user);
	}
	
	
	
}
