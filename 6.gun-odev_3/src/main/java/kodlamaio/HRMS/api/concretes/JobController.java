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

import kodlamaio.HRMS.business.abstracts.JobService;
import kodlamaio.HRMS.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	private JobService jobService;

	@Autowired
	public JobController(JobService jobService) {
		
		this.jobService = jobService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Job job) {
		jobService.add(job);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Job job) {
		jobService.delete(job);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Job job) {
		jobService.update(job);
	}
	
    @GetMapping("/getall")
    public List<Job> getAll(){
        return jobService.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Job> get(@PathVariable int id){
        return jobService.get(id);
    }
	
	
}
