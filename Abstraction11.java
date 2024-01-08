/*Write a Java program to create an abstract class Bird with abstract methods fly()
 * and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class 
 implement the respective methods to describe how each bird flies and makes a sound.*/
package practice1;

abstract class Bird1 {
	abstract void fly();

	abstract void makesound();
}

class Eagle extends Bird1 {
	public void fly() {
		System.out.println("Eagle is bird which fly highest height");
	}

	public void makesound() {
		System.out.println("Eagle make soude like peek call and chatter call");
	}
}

class Hawk extends Bird1 {

	public void fly() {
		System.out.println("hawk fly average height");
	}

	public void makesound() {
		System.out.println("Hawk make sound like kee-aah");
	}
}

public class Abstraction11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eg = new Eagle();
		Hawk hw = new Hawk();
		eg.fly();
		eg.makesound();
		hw.fly();
		hw.makesound();

	}

}
