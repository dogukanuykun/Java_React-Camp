package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.HRMS.entities.concretes.Job;

public interface JobService {
	
    void add(Job jobPosition);
    void delete(Job jobPosition);
    void update(Job jobPosition);
    Optional<Job> get(int id);
    List<Job> getAll();

	
}
