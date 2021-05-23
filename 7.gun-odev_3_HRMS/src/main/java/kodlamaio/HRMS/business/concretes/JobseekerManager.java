package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.JobseekerService;
import kodlamaio.HRMS.core.CustomerCheckService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.core.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.JobseekerDal;
import kodlamaio.HRMS.entities.concretes.Jobseeker;

@Service
public class JobseekerManager implements JobseekerService{
	private CustomerCheckService checkService;
	private JobseekerDal jobseekerDal;

	@Autowired
	public JobseekerManager(JobseekerDal jobseekerDal,CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
		this.jobseekerDal = jobseekerDal;
	}
	
	@Autowired
	public boolean verifyJobseeker(Jobseeker jobseeker) {
		return checkService.chechIfRealPerson(jobseeker);
	}

	@Override
	public Result add(Jobseeker jobseeker) {
		this.jobseekerDal.save(jobseeker);
		return new SuccessResult("Is arayan eklendi.");
	}

	@Override
	public Result delete(Jobseeker jobseeker) {
		this.jobseekerDal.delete(jobseeker);
		return new SuccessResult("Is arayan silindi.");
	}

	@Override
	public Result update(Jobseeker jobseeker) {
		this.jobseekerDal.save(jobseeker);
		return new SuccessResult("Is arayan guncellendi.");
	}

	@Override
	public Optional<Jobseeker> get(int id) {
		return this.jobseekerDal.findById(id);
	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>
		(this.jobseekerDal.findAll(),"Guncel is arayanlar listelendi");
	}
	
	
	
	

}
