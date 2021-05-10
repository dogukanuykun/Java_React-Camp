package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.dataAccess.abstracts.UserDal;
import kodlamaio.HRMS.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDal userDal;
	
	@Autowired
	public UserManager(UserDal userDal) {
		
		this.userDal = userDal;
	}
	

	@Override
	public void add(User user) {
		userDal.save(user);
		
	}

	@Override
	public void delete(User user) {
		userDal.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDal.save(user);
		
	}

	@Override
	public Optional<User> get(int id) {
		return userDal.findById(id);
	}

	@Override
	public List<User> getAll() {
		return userDal.findAll();
	}

}
