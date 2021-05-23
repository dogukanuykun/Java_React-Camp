package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.entities.concretes.Company;

public interface CompanyService {

    Result add(Company company);
    Result delete(Company company);
    Result update(Company company);
    Optional<Company> get(int id);
    DataResult<List<Company>> getAll();
    
}
