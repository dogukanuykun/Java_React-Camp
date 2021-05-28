package kodlamaio.HRMS.api.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.entities.concretes.Job;



@RestController
@RequestMapping("/api/jobs")
public class JobController {

	private JobService jobService;

	@Autowired
	public JobController(JobService jobService) {
		
		this.jobService = jobService;
	}

    @GetMapping("/get/getByCompanyId")
    public DataResult<List<Job>> getByCompanyId(@RequestParam int id){
    	return this.jobService.getByCompanyId(id);
    }
    
    @GetMapping("/get/getAllSorted")
    public DataResult<List<Job>> getAllSorted(){
		return this.jobService.getAllSorted();
    	
    }
	
    @PutMapping("/get/activeJob")
    public Result activeJob(@RequestParam Job job) {
    	return this.jobService.activeJob(job);
    	
    }
    
    @PutMapping("/get/disactiveJob")
    public Result disactiveJob(@RequestParam Job job) {
    	return this.jobService.disactiveJob(job);
    	
    }
    
    @GetMapping("/get/getactivejobs")
	public DataResult<List<Job>> getByIsActive() {
    	return this.jobService.getByIsActive();
	}
    
    @GetMapping("/get/getByCompanyIdAndIsActive")
    public DataResult<List<Job>> getByCompanyIdAndIsActive(int id){
    	return this.jobService.getByCompanyIdAndIsActive(id);
    }
    
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Job job) {
		jobService.delete(job);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Job job) {
		jobService.update(job);
	}
	
    @GetMapping("/getalljobs")
    public DataResult<List<Job>> getAll(){
        return this.jobService.getAll();
    }
    

    @GetMapping("/get/{id}")
    public Optional<Job> get(@RequestParam int id){
        return jobService.get(id);
    }
    

    
    
	
}
