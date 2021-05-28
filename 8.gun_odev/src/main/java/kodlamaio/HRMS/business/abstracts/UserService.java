package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.HRMS.entities.concretes.User;

public interface UserService {
	
	void add(User user);
    void delete(User user);
    void update(User user);
    Optional<User> get(int id);
    List<User> getAll();

}
