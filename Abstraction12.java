/*12. Write a Java program to create an abstract class GeometricShape with 
 * abstract methods area() and perimeter(). Create subclasses Triangle and Square
 *  that extend the GeometricShape class and implement the respective methods to calculate 
 *  the area and perimeter of each shape.*/
package practice1;

abstract class GeometricShape {
	abstract void area();

	abstract void perimeter();
}

class Triangle1 extends GeometricShape {
	double s1 = 2.5;
	double s2 = 2.9;
	double s3 = 3.1;
	double b = 3.1;
	double h = 4;

	public void area() {
		double a1 = s1 + s2 + s3;
		System.out.println("Area of triangle is " + a1);
	}

	public void perimeter() {
		double p1 = 1 / 2 * b * h;
		System.out.println("perimeter of triangle is " + p1);
	}
}

class Square extends GeometricShape {
	double s = 2.5;

	public void area() {
		double a2 = s * s;
		System.out.println("Area of square is " + a2);
	}

	public void perimeter() {
		double p2 = 4 * s;
		System.out.println("Perimeter of Square is " + p2);
	}
}

public class Abstraction12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle1 tr = new Triangle1();
		Square sq = new Square();
		tr.area();
		tr.perimeter();
		sq.area();
		sq.perimeter();

	}

}
