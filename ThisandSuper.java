package practice1;

class Player
{ 
 private String pName; 
 private int pAge; 
 private String gameType; 

// Create a constructor and initialize the three parameters pName, pAge, and gameType. 
public Player(String pName, int pAge, String gameType)
{ 
 this.pName = pName; 
 this.pAge = pAge; 
 this.gameType = gameType;
}
public void display() {
	System.out.println("name of player " + pName);
	System.out.println("Age of player " + pAge);
	System.out.println("Which Game is playing " + gameType);
}
}
class Couch extends Player{

	public Couch(String pName, int pAge, String gameType) {
		super(pName, pAge, gameType);
		// TODO Auto-generated constructor stub
	}
	
}

public class ThisandSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Couch c1=new Couch("abdul", 23, "PubG");
		c1.display();
	}

}
