package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@Column(name="Title")
	private String title;

	public Job(int jobId, String title) {
		this.jobId = jobId;
		this.title = title;
	}
	
	

}
