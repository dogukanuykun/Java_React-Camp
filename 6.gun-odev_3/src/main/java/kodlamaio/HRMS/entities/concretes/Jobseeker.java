package kodlamaio.HRMS.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.HRMS.entities.abstracts.Members;
import lombok.Data;

@Data
@Entity
@Table(name="Jobseekers")
public class Jobseeker extends User {

	@Id
	@GeneratedValue
	@Column(name="jobseeker_id")
	private int id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Identity")
	private String identityNo;
	
	@Column(name="BirthDate")
	private Date birthDate;

	public Jobseeker(int id, String firstName, String lastName, String identityNo, Date birthDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNo = identityNo;
		this.birthDate = birthDate;
	}
	
	
	
	
	
}
