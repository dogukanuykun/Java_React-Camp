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
			System.out.println("Bu email'e kayýtlý kullanýcý bulunmaktadýr. Lütfen login olunuz!");
		}
		else {
			if(emailValidator.validate(user) && user.getPassword().length()>=6 && user.getName().length()>=2 && user.getSurname().length()>=2) {
				System.out.println("Doðrulama için mail gönderildi.");//simulate
				Scanner validationMail = new Scanner(System.in);
				String response = validationMail.nextLine();
				if(response=="linked") {
					emailList.add(user.getEmail());
					userDao.createUser(user);
				}else {
					System.out.println("Doðrulama baþarýsýz.");
				}

			}	
		}
	}

	@Override
	public void login(User user) {
		if(hasInSystem(user, emailList)) {
			userDao.getUser(user);
			System.out.println("Hoþgeldiniz.");
		}
		else {
			System.out.println("Sistemde kaydýnýz yok. Lütfen üye olunuz!");
		}
		
	}

	@Override
	public void deleteMyAccount(User user) {
		try {
			emailList.remove(user.getEmail());
		}catch (Exception e) {
			System.out.println("Böyle bir kullanýcý mevcut deðil!");
			return;
		}
		userDao.deleteUser(user);
	}
	
	
	
}
