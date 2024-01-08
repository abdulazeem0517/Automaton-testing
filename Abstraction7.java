/*7.Write a Java program to create an abstract class Vehicle with abstract methods 
 * startEngine() and stopEngine(). Create subclasses Car and Motorcycle that 
 * extend the Vehicle class and implement the respective methods to start and stop 
 * the engines for each vehicle type */
package practice1;

abstract class Vehicle {
	abstract void startEngine();

	abstract void stopEngine();
}

class Car extends Vehicle {
	public void startEngine() {
		System.out.println("car uses digital key to unlock and push botton to start");
	}

	public void stopEngine() {
		System.out.println("car uses push botton to stop");
	}
}

class Bike extends Vehicle {
	public void startEngine() {
		System.out.println("bike used to start with kick rod or self motor");
	}

	public void stopEngine() {
		System.out.println("bike used to stop with switch odd the key");
	}
}

public class Abstraction7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		Bike b = new Bike();
		c.startEngine();
		c.stopEngine();
		b.startEngine();
		b.stopEngine();

	}

}
