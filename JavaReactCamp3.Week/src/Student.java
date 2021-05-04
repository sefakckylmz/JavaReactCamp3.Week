
public class Student extends User  {

int studentNumber;
String studentName;

public Student(int id, int passaword, String username, int studentNumber, String studentName) {
	super(id, passaword, username);
	this.studentNumber = studentNumber;
	this.studentName = studentName;
}

public int getStudentNumber() {
	return studentNumber;
}

public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

}
