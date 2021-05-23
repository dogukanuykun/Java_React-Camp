package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.core.SuccessResult;
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
	public Result add(Job jobPosition) {
		this.jobDal.save(jobPosition);
		return new SuccessResult("Is eklendi.");
	}

	@Override
	public Result delete(Job jobPosition) {
		this.jobDal.delete(jobPosition);
		return new SuccessResult("Is silindi.");
	}

	@Override
	public Result update(Job jobPosition) {
		this.jobDal.save(jobPosition);
		return new SuccessResult("Is guncellendi.");
	}

	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>
		(this.jobDal.findAll(),"Guncel isler listelendi");
	}
	

	@Override
	public Optional<Job> get(int id) {
		return this.jobDal.findById(id);
	}
	
	
	
}
