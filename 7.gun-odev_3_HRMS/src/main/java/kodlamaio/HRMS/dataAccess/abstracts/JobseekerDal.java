package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Jobseeker;

public interface JobseekerDal extends JpaRepository<Jobseeker, Integer> {

}
