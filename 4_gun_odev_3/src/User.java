import java.util.ArrayList;

public class User implements Member {
	private String firstName;
	private String lastName;
	private String birthDate;
	private int tcNo;
	private ArrayList<Game> games;
	
	
	public User(String firstName, String lastName, String birthDate, int tcNo, ArrayList<Game> games) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.tcNo = tcNo;
		this.games = games;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}


	
	

}
