package kodlamaio.HRMS.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.UserService;
import kodlamaio.HRMS.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		
		this.userService = userService;
	}
	
	@PostMapping("/add")
	 	public void add(@RequestBody User user){
	    userService.add(user);
	 }
	
	@PostMapping("/delete")
	 	public void delete(@RequestBody User user){
	    userService.add(user);
	 }
	
	@PostMapping("/update")
	 	public void update(@RequestBody User user){
	    userService.update(user);
	}
	
	@GetMapping("/getallusers")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	 @GetMapping("/get/{id}")
	 public List<User> get(@PathVariable int id){
	    return userService.getAll();
	 }
	

	 
}
