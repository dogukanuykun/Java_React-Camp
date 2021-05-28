package kodlamaio.HRMS.core;

import kodlamaio.HRMS.entities.concretes.Jobseeker;

public interface CustomerCheckService {
	boolean chechIfRealPerson(Jobseeker jobseeker);

}
