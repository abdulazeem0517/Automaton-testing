package practice1;

//Abstract class representing a university person
abstract class UniversityPerson1 {
	String name;
	int id;

// Constructor
	public UniversityPerson1(String name, int id) {
		this.name = name;
		this.id = id;
	}

// Abstract method to display information about the person
	abstract void display();
}

//Concrete class representing a professor
class Professor1 extends UniversityPerson1 {
	String department;

// Constructor
	public Professor1(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}

// Implementation of the abstract method to display professor information
	void display() {
		System.out.println("Professor - Name: " + name + ", ID: " + id + ", Department: " + department);
	}
}

//Concrete class representing an administrative staff
class AdministrativeStaff1 extends UniversityPerson1 {
	String role;

// Constructor
	public AdministrativeStaff1(String name, int id, String role) {
		super(name, id);
		this.role = role;
	}

// Implementation of the abstract method to display staff information
	@Override
	void display() {
		System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
	}
}

//Concrete class representing a student
class Student12 extends UniversityPerson1 {
	String major;

// Constructor
	public Student12(String name, int id, String major) {
		super(name, id);
		this.major = major;
	}

// Implementation of the abstract method to display student information
	void display() {
		System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
	}
}

public class Abstraction_debugging {
	public static void main(String[] args) {
		// Creating objects of concrete classes
		Professor1 staff = new Professor1("amit", 201, "Admin Assistant");
		Student12 s12 = new Student12("abdul", 517, "Testing engineer");
		// Using abstraction to display information about university persons
		staff.display();
		s12.display();
	}
}
