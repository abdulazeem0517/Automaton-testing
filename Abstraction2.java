/* Write a Java program to create an abstract class Shape with abstract methods calculateArea() 
 * and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class 
 * and implement the respective methods to calculate the area and perimeter of each shape.
 */
package practice1;

abstract class Shape {
	abstract void CalculateArea();

	abstract void CalculatePerimeter();

}

class Circle extends Shape {
	@Override
	public void CalculateArea() {
		System.out.println("Area of circle is Pi*r square");
	}

	public void CalculatePerimeter() {
		System.out.println("perimeter of circle is pi*diameter");
	}
}

class Triangle extends Shape {
	@Override
	public void CalculateArea() {
		System.out.println("Area of Triangle is 1/2*breadth*breadth");
	}

	public void CalculatePerimeter() {
		System.out.println("perimeter of Triangle is concadination of all sides");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Triangle t1 = new Triangle();
		c1.CalculateArea();
		c1.CalculatePerimeter();
		t1.CalculateArea();
		t1.CalculatePerimeter();

	}

}
