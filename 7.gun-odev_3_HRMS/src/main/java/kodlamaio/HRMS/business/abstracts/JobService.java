package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import java.util.Optional;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.entities.concretes.Job;



public interface JobService {
	
    Result add(Job jobPosition);
    Result delete(Job jobPosition);
    Result update(Job jobPosition);
    Optional<Job> get(int id);
    DataResult<List<Job>> getAll();

	
	
}
