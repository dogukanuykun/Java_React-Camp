package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.entities.concretes.Jobseeker;

public interface JobseekerService {
    Result add(Jobseeker jobseeker);
    Result delete(Jobseeker jobseeker);
    Result update(Jobseeker jobseeker);
    Optional<Jobseeker> get(int id);
    DataResult<List<Jobseeker>> getAll();

}
