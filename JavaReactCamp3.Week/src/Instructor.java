
public class Instructor extends User {

	String żnstructorName;

	public Instructor(int id, int passaword, String username, String instructorName) {
		super(id, passaword, username);
		żnstructorName = instructorName;
	}
	
	public String getInstructorName() {
		return żnstructorName;
	}

	public void setInstructorName(String instructorName) {
		żnstructorName = instructorName;
	}
	
}
