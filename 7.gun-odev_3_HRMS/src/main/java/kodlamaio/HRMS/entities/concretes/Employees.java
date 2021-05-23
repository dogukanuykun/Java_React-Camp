package kodlamaio.HRMS.entities.concretes;

import javax.persistence.*;

import kodlamaio.HRMS.entities.abstracts.Members;
import lombok.Data;

@Data
@Entity
@Table(name="Employees")
public class Employees extends User {

	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;

	public Employees(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	
}
