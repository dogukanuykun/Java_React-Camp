package kodlamaio.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Employees;

public interface EmployeeDal extends JpaRepository<Employees, Integer> {

}
