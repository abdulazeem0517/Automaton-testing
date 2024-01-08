package practice1;

/*class singer{					//single Inheritance
	void concert() {
		System.out.println("singing");
	}
}
class honeysing extends singer{
	void dj() {
		System.out.println("singing blue eyes");
	}
}*/


/*class singer{						//multilevel Inheritence
	void concert() {
		System.out.println("singing");
	}
}
class honeysing extends singer{
	void dj() {
		System.out.println("singing blue eyes");
	}
}

class mcstan extends honeysing{
	void openmic() {
		System.out.println("singing ek din pyar");
	}
}*/

class singer{						//Hierachial Inheritance
	void concert() {
		System.out.println("singing");
		float a=10.52;
	}
}
class honeysing extends singer{
	void dj() {
		System.out.println("singing blue eyes");
	}
}

class mcstan extends singer{
	void openmic() {
		System.out.println("singing ek din pyar");
	}
	
class arijit extends singer{
	void melody() {
		System.out.println("singing heeriye");
	}
}






public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honeysing hs=new honeysing();
		hs.dj();
		hs.concert();
		
		mcstan mc=new mcstan();
		mc.openmic();
		mc.concert();
		
		arijit ar=new arijit();
		ar.concert();
		ar.concert();
		
	}

}
}
