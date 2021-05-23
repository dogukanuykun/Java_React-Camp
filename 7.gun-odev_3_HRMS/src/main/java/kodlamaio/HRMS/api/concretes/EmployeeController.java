package kodlamaio.HRMS.api.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.concretes.EmployeeManager;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.Employees;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeManager employeeManager;

	@Autowired
	public EmployeeController(EmployeeManager employeeManager) {
		super();
		this.employeeManager = employeeManager;
	}
	
	@PostMapping("/add")
 	public void add(@RequestBody Employees employee){
		employeeManager.add(employee);
	 }
	
	@PostMapping("/delete")
	 	public void delete(@RequestBody Employees employee){
		employeeManager.add(employee);
	 }
	
	@PostMapping("/update")
	 	public void update(@RequestBody Employees employee){
		employeeManager.update(employee);
	}
	
	@GetMapping("/getalljobseekers")
	public DataResult<List<Employees>> getAll(){
		return employeeManager.getAll();
	}
	
	 @GetMapping("/get/{id}")
	 public Optional<Employees> get(@PathVariable int id){
	    return employeeManager.get(id);
	 }
	
	

}
