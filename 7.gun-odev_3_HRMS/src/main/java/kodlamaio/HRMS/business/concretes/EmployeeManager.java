package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.EmployeeService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.core.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.EmployeeDal;
import kodlamaio.HRMS.entities.concretes.Employees;


@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDal employeeDal;
	
	@Autowired
	public EmployeeManager(EmployeeDal employeeDal) {
		this.employeeDal = employeeDal;
		
	}

	@Override
	public Result add(Employees employee) {
		this.employeeDal.save(employee);
		return new SuccessResult("Calisan eklendi.");
	}

	@Override
	public Result delete(Employees employee) {
		this.employeeDal.delete(employee);
		return new SuccessResult("Calisan silindi.");
	}

	@Override
	public Result update(Employees employee) {
		this.employeeDal.save(employee);
		return new SuccessResult("Calisan guncellendi.");
	}

	@Override
	public Optional<Employees> get(int id) {
		return this.employeeDal.findById(id);
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>
		(this.employeeDal.findAll(),"Guncel calisanlar listelendi");
	}

}
