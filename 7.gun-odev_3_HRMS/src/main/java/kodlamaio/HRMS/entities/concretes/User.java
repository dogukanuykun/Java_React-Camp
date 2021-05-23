package kodlamaio.HRMS.entities.concretes;

import javax.persistence.*;

import kodlamaio.HRMS.entities.abstracts.Members;
import lombok.Data;

@Data
@Entity
@Table(name="Users")
public class User implements Members{

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="ConfirmPassword")
	private String confirmPw;

	public User(int id, String email, String password, String confirmPw) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.confirmPw = confirmPw;
	}
	
	public User() {
		
	}
	
	
}
