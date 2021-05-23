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
import kodlamaio.HRMS.business.concretes.CompanyManager;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {

	private CompanyManager companyManager;

	@Autowired
	public CompanyController(CompanyManager companyManager) {
		super();
		this.companyManager = companyManager;
	}
	
		@PostMapping("/add")
	 	public void add(@RequestBody Company company){
			companyManager.add(company);
	 }
	
	@PostMapping("/delete")
	 	public void delete(@RequestBody Company company){
		companyManager.add(company);
	 }
	
	@PostMapping("/update")
	 	public void update(@RequestBody Company company){
		companyManager.update(company);
	}
	
	@GetMapping("/getallusers")
	public DataResult<List<Company>> getAll(){
		return companyManager.getAll();
	}
	
	 @GetMapping("/get/{id}")
	 public Optional<Company> get(@PathVariable int id){
	    return companyManager.get(id);
	 }
	
}
