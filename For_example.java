package practice1;

public class For_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"abdul","Ravi","gopi","Sai","azeem"};
		for(String name:names) {
			if(name.equalsIgnoreCase("gopi")) {
			System.out.println("the name you found is " + name);
		}
		int len=names.length;
		
		for(int i=0;i<4;i++) {
			System.out.println("the name is "+names[i]);
			System.out.println(names[i] +" will be");
		}
		}

	

}
