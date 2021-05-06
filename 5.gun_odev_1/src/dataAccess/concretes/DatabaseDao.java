package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class DatabaseDao implements UserDao{

	@Override
	public void createUser(User user) {
		System.out.println("db'ye eklendi "+user.getEmail());
		
	}

	@Override
	public void getUser(User user) {
		System.out.println("Kullanýcý : "+user.getEmail()+" "+user.getName()+" "+user.getSurname());
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("db'den silindi "+user.getEmail());
	}

	@Override
	public void updateUser(User user) {
		System.out.println("Güncellendi "+user.getEmail());
		
	}
	

}
