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

import kodlamaio.HRMS.business.concretes.JobseekerManager;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.Jobseeker;


@RestController
@RequestMapping("/api/jobseekers")
public class JobseekersController {

	private JobseekerManager jobseekerManager;

	@Autowired
	public JobseekersController(JobseekerManager jobseekerManager) {
		super();
		this.jobseekerManager = jobseekerManager;
	}
	
	@PostMapping("/add")
 	public void add(@RequestBody Jobseeker jobseeker){
	jobseekerManager.add(jobseeker);
	 }
	
	@PostMapping("/delete")
	 	public void delete(@RequestBody Jobseeker jobseeker){
		jobseekerManager.add(jobseeker);
	 }
	
	@PostMapping("/update")
	 	public void update(@RequestBody Jobseeker jobseeker){
		jobseekerManager.update(jobseeker);
	}
	
	@GetMapping("/getalljobseekers")
	public DataResult<List<Jobseeker>> getAll(){
		return jobseekerManager.getAll();
	}
	
	 @GetMapping("/get/{id}")
	 public Optional<Jobseeker> get(@PathVariable int id){
	    return jobseekerManager.get(id);
	 }
	
	
	
}
