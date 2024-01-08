/* Write a Java program to create an abstract class Animal with an abstract method called sound().
 * Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method 
 * to make a specific sound for each animal.
 */
package practice1;

abstract class Animal {
	abstract void sound();
}

class Lion extends Animal {
	public void sound() {
		System.out.println("Lion roar and it is king ");
	}
}

class Tiger extends Animal {
	public void sound() {
		System.out.println("Tiger is fastest animal");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		Tiger t = new Tiger();
		l.sound();
		t.sound();
	}

}
