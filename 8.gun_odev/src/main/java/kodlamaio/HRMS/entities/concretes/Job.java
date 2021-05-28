package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import kodlamaio.HRMS.entities.abstracts.Position;


@Data
@Entity
@Table(name="JobTitles")
public class Job implements Position {
	
	@Id
	@GeneratedValue
	@Column(name="JobId")
	private int jobId;
	
	@ManyToOne()
	@JoinColumn(name="companyId")
	private int companyId;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Salary")
	private int salary;
	
	@Column(name="NumberOfPosition")
	private int numberOfPosition;
	
	@Column(name="Deadline")
	private int deadLine;
	
	@Column(name="isActive")
	private boolean isActive;
	
	
	
	

}
