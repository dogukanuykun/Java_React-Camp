package kodlamaio.HRMS.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.entities.concretes.Employees;


public interface EmployeeService {
    Result add(Employees employee);
    Result delete(Employees employee);
    Result update(Employees employee);
    Optional<Employees> get(int id);
    DataResult<List<Employees>> getAll();
}
