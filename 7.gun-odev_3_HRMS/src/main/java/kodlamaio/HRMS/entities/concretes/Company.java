package kodlamaio.HRMS.entities.concretes;

import javax.persistence.*;

import kodlamaio.HRMS.entities.abstracts.Members;
import lombok.Data;

@Data
@Entity
@Table(name="Companies")
public class Company extends User {
	
	@Id
	@GeneratedValue
	@Column(name="company_id")
	private int id;
	
	@Column(name="CompanyName")
	private String companyName;
	
	@Column(name="WebAddress")
	private String webAddress;
	
	@Column(name="PhoneNumber")
	private String phoneNumber;
	
	@Column(name="Jobs")
	private Job[] jobs;

	public Company(int id, String companyName, String webAddress, String phoneNumber, Job[] jobs) {
		this.id = id;
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		this.jobs = jobs;
	}
	
	
	
	
	
}
