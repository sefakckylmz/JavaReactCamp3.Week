
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, 1234, "2323", "Engin Demiroğ");
		System.out.println(instructor1.id);
		System.out.println(instructor1.passaword);
		System.out.println(instructor1.username);
		System.out.println(instructor1.ınstructorName);
		
		System.out.println("------------------------------------");
		
		User user1 = new User(2, 2345, "sefa yılmaz");
		System.out.println(user1.id);
		System.out.println(user1.passaword);
		System.out.println(user1.username);
		
		System.out.println("------------------------------------");
		
		Student student1 = new Student(3, 3456, "sefasefa", 1868, "Sefa Küçükyılmaz");
		System.out.println(student1.id);
		System.out.println(student1.passaword);
		System.out.println(student1.studentName);
		System.out.println(student1.studentNumber);
		System.out.println(student1.username);
		
		System.out.println("------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.join(user1);
		userManager.leave(user1);
		
		System.out.println("------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.join(student1);
		studentManager.leave(student1);
		
		System.out.println("------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.join(instructor1);
		instructorManager.leave(instructor1);
		
		System.out.println("------------------------------------");
	}

}
