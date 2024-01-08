package practice1;
class Players
{ 
 private String pName; 
 private int pAge; 
 private String gameType;
 
 Players(String pName,int pAge,String gameType){
	 
	 
 }
 
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getpAge() {
	return pAge;
}
public void setpAge(int pAge) {
	this.pAge = pAge;
}
public String getGameType() {
	return gameType;
}
public void setGameType(String gameType) {
	this.gameType = gameType;
}
}
class Couches extends Players{

	Couches(String pName, int pAge, String gameType) {
		super(pName, pAge, gameType);
		// TODO Auto-generated constructor stub
	}
	
}

public class GetterandSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Couches p1=new Couches("Abdul", 23, "GTA");
		System.out.println("Name of the player " + p1.getpName());
		System.out.println("age of the player " + p1.getpAge());
		System.out.println("game played bt player " +p1.getGameType());
		

	}

}
