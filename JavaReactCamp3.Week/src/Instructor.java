
public class Instructor extends User {

	String �nstructorName;

	public Instructor(int id, int passaword, String username, String instructorName) {
		super(id, passaword, username);
		�nstructorName = instructorName;
	}
	
	public String getInstructorName() {
		return �nstructorName;
	}

	public void setInstructorName(String instructorName) {
		�nstructorName = instructorName;
	}
	
}
