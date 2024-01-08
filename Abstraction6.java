/*Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() 
 * and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and
 *  implement the respective methods to calculate the volume and surface area of each shape.*/

package practice1;

abstract class Shape3D {
	abstract void calculateVolume();

	abstract void calculateSurfaceArea();

	double r = 20.25;
	double π = 3.14;
}

class Shpere extends Shape3D {
	double res = 4 / 3 * π * r * r * r;
	double shperearea = 4 * π * r * r;

	public void calculateVolume() {
		System.out.println("volume of shpere is 4/3 π r³" + res);
	}

	public void calculateSurfaceArea() {
		System.out.println("surfacearea of shpere is 4πr²" + shperearea);
	}
}

class Cube extends Shape3D {
	int side = 20;
	double volume = side * side * side;
	double surfacearea = 4 * side * side;

	public void calculateVolume() {
		System.out.println("volume of Cube is (Side)cube " + volume);
	}

	public void calculateSurfaceArea() {
		System.out.println("surfacearea of shpere is 4(side)square" + surfacearea);
	}
}

public class Abstraction6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shpere sp = new Shpere();
		Cube cb = new Cube();
		sp.calculateVolume();
		sp.calculateSurfaceArea();
		cb.calculateVolume();
		cb.calculateSurfaceArea();
	}
}
