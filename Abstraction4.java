/*4.Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
 * Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and 
 * sleep() methods differently based on their specific behavior.
 */
package practice1;

abstract class Animal1 {
	abstract void eat();

	abstract void sleep();

}

class Lion1 extends Animal1 {
	public void eat() {
		System.out.println("Lion Eat sheeps deers and meat");
	}

	public void sleep() {
		System.out.println("Lion sleeps 6 hours a day ");
	}
}

class Tiger1 extends Animal1 {
	public void eat() {
		System.out.println("Tiger also eats deers and zebras ");
	}

	public void sleep() {
		System.out.println("Lion sleeps 7 hours a day ");
	}
}

class Deer extends Animal1 {
	public void eat() {
		System.out.println("Deer eats grass and leafs");
	}

	public void sleep() {
		System.out.println("Deer sleeps 8 hours a day ");
	}
}

public class Abstraction4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion1 l = new Lion1();
		Tiger1 t = new Tiger1();
		Deer d = new Deer();
		l.eat();
		l.sleep();
		t.eat();
		t.sleep();
		d.eat();
		d.sleep();
	}

}
