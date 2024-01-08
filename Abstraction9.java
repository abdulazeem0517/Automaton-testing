/*9. Write a Java program to create an abstract class Instrument with abstract methods
 * play() and tune(). Create subclasses for Glockenspiel and Violin that extend the 
 * Instrument class and implement the respective methods to play and tune each instrument.*/

package practice1;

abstract class Instrument {
	abstract void play();

	abstract void tune();
}

class Glockenspiel extends Instrument {
	public void play() {
		System.out.println("Glockenspiel can be played by sticks");
	}

	public void tune() {
		System.out.println("most famous tune of Glockenspiel is Twinkle twinkle");
	}
}

class Violine extends Instrument {
	public void play() {
		System.out.println("violine can be played by using Bow");
	}

	public void tune() {
		System.out.println("Violine famous tune is kehte hy khuda ney");
	}
}

public class Abstraction9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Glockenspiel gsp = new Glockenspiel();
		Violine vln = new Violine();
		gsp.play();
		gsp.tune();
		vln.play();
		vln.tune();

	}

}
