package kodlamaio.HRMS.entities.concretes;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
	
	@OneToMany(mappedBy = "Company")
	private List<Job> jobs;
	
	
	
	
	
}
