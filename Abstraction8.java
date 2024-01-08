/*8. Write a Java program to create an abstract class Person with abstract methods eat() 
 * and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class 
 * and implement the respective methods to describe how each person eats and exercises.*/

package practice1;

abstract class Person {
	abstract void eat();

	abstract void exercise();
}

class Athlete extends Person {
	public void eat() {
		System.out.println("Athlete diet is eggs ,milk and protein");
	}

	public void exercise() {
		System.out.println("Athlete exercise 2 hours on every morning");
	}
}

class LazyPerson extends Person {
	public void eat() {
		System.out.println("Lazyperson eats all junk food without limit");
	}

	public void exercise() {
		System.out.println("Lazy person don't do exercise he'll laid down on the bed everytime");
	}
}

public class Abstraction8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Athlete atlt = new Athlete();
		LazyPerson lper = new LazyPerson();
		atlt.eat();
		atlt.exercise();
		lper.eat();
		lper.exercise();
	}

}
