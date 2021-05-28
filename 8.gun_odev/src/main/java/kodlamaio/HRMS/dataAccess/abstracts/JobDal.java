package kodlamaio.HRMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Job;

public interface JobDal extends JpaRepository<Job, Integer> {
	
	List<Job> getByCompanyId(int id);
	List<Job> getByIsActive();
	List<Job> getByCompanyIdAndIsActive(int id);
	

	
}
