package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.abstracts.CompanyService;
import kodlamaio.HRMS.core.DataResult;
import kodlamaio.HRMS.core.Result;
import kodlamaio.HRMS.core.SuccessDataResult;
import kodlamaio.HRMS.core.SuccessResult;
import kodlamaio.HRMS.dataAccess.abstracts.CompanyDal;
import kodlamaio.HRMS.entities.concretes.Company;


@Service
public class CompanyManager implements CompanyService{
	
	private CompanyDal companyDal;

	@Autowired
	public CompanyManager(CompanyDal companyDal) {
		this.companyDal = companyDal;
		
	}

	@Override
	public Result add(Company company) {
		this.companyDal.save(company);
		return new SuccessResult("Sirket eklendi.");
	}

	@Override
	public Result delete(Company company) {
		this.companyDal.delete(company);
		return new SuccessResult("Sirket silindi.");
	}

	@Override
	public Result update(Company company) {
		this.companyDal.save(company);
		return new SuccessResult("Sirket guncellendi.");
	}

	@Override
	public Optional<Company> get(int id) {
		this.companyDal.findById(id);
		return this.companyDal.findById(id);
	}

	@Override
	public DataResult<List<Company>> getAll() {
		return new SuccessDataResult<List<Company>>
		(this.companyDal.findAll(),"Guncel sirketler listelendi");
	}

}
