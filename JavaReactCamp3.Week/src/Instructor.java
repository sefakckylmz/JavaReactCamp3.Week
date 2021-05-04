
public class Instructor extends User {

	String ýnstructorName;

	public Instructor(int id, int passaword, String username, String instructorName) {
		super(id, passaword, username);
		ýnstructorName = instructorName;
	}
	
	public String getInstructorName() {
		return ýnstructorName;
	}

	public void setInstructorName(String instructorName) {
		ýnstructorName = instructorName;
	}
	
}
