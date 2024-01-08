/*10. Write a Java program to create an abstract class Shape2D with abstract methods
 * draw() and resize(). Create subclasses Rectangle and Circle that extend the Shape2D 
 * class and implement the respective methods to draw and resize each shape*/

package practice1;

abstract class Shape2D {
	abstract void draw();

	abstract void resize();
}

class Rectangle extends Shape2D {
	public void draw() {
		System.out.println("we can draw Rectangle with 4 sides in which 2 sides of equal length");
	}

	public void resize() {
		System.out.println("Reactangle is resize by reducing the lenght of its sides");
	}
}

class Circle1 extends Shape2D {
	public void draw() {
		System.out.println("circle is drawn round");
	}

	public void resize() {
		System.out.println("circle can be resize");
	}
}

public class Abstractin10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rct = new Rectangle();
		Circle1 crcl = new Circle1();
		rct.draw();
		rct.resize();
		crcl.draw();
		crcl.resize();

	}

}
