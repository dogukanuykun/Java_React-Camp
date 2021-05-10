package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobService;
import kodlamaio.HRMS.dataAccess.abstracts.JobDal;
import kodlamaio.HRMS.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDal jobDal;

	@Autowired
	public JobManager(JobDal jobDal) {
		
		this.jobDal = jobDal;
	}

	@Override
	public void add(Job jobPosition) {
		jobDal.save(jobPosition);

	}

	@Override
	public void delete(Job jobPosition) {
		jobDal.delete(jobPosition);
		
	}

	@Override
	public void update(Job jobPosition) {
		jobDal.save(jobPosition);
		
	}

	@Override
	public Optional<Job> get(int id) {
		return jobDal.findById(id);
	}

	@Override
	public List<Job> getAll() {
		return jobDal.findAll();
	}
	
	
	
}
