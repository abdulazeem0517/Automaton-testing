package practice1;

//Abstract class representing a university person
abstract class UniversityPerson {
	String name;
	int id;

// Constructor
	public UniversityPerson(String name, int id) {
		this.name = name;
	}

// Abstract method to display information about the person
	abstract void display();
}

//Concrete class representing a professor
class Professor {
	String department;

// Constructor
	public Professor(String name, int id, String department) {
		this.department = department;
	}

// Implementation of the abstract method to display professor information
	void display() {
		System.out.println("Professor - Name: " + name + ", ID: " + id + ", Department: " + department);
	}
}

//Concrete class representing an administrative staff
class AdministrativeStaff extends UniversityPerson {
	String role;

// Constructor
	public AdministrativeStaff(String name, int id, String role) {
		super(name, id);
	}

// Implementation of the abstract method to display staff information
	@Override
	void display() {
		System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
	}
}

//Concrete class representing a student
class Studentt extends UniversityPerson {
	String major;
	private String major22;

// Constructor
	public Studentt() {
		this.major22 = major;
	}

// Implementation of the abstract method to display student information
	void display() {
		System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
	}
}

public class Abstraction_Program {
public static void main(String[] args) {
   // Creating objects of concrete classes
   Professor pro = new Professor(null, 0, null);
   UniversityPerson staff = new AdministrativeStaff( "Admin Assistant", 201, "amit");
   UniversityPerson student = new Studentt();

   // Using abstraction to display information about university persons
   pro.display();
   staff.display();
   student.display();
 }
}
