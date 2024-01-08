/*5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() 
 * and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and 
 * implement the respective methods to calculate salary and display information for each role. */
package practice1;

abstract class Employee {
	abstract void calculateSalary();

	abstract void displayInfo();
}

class Manager extends Employee {
	public void calculateSalary() {
		System.out.println("Salary of manager is 10 LPA ");
	}

	public void displayInfo() {
		System.out.println("manager leading 4 testing teams with 10 emplyees on each team");
	}
}

class Programmer extends Employee {
	public void calculateSalary() {
		System.out.println("Salary of programmer  is 6 LPA ");
	}

	public void displayInfo() {
		System.out.println("Programmer develops Apps and working with team under manager");
	}
}

public class Abstraction5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		Programmer p = new Programmer();
		m.calculateSalary();
		m.displayInfo();
		p.calculateSalary();
		p.displayInfo();

	}

}
