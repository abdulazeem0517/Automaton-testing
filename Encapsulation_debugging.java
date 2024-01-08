package practice1;

class Rectangle_a {
	// Declare instance variables as private in the class.
	private int length;
	private int breadth;

	// Declare a constructor Rectangle and define parameters of constructor.
	Rectangle_a(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// Create a getter method for each private variable.
	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}
//	2 privete constuctor find the squre of numbers

	// Create a setter method for each private variable and define parameter.
	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}

public class Encapsulation_debugging {
	public static void main(String args[]) {
		Rectangle_a rt = new Rectangle_a(30, 40);

		float lth = rt.getLength();
		int bth = rt.getBreadth();
		float Area = lth * bth;
		float perimeter = 4 * lth * bth;
		System.out.println("area is " + Area);
		System.out.println("Perimeter is " + perimeter);
	}
}