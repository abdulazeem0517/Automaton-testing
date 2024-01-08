package practice1;


class Record1 {
	private int x;
	private int y;
	

	Record1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

class Record2 {
	private int a;
	private int b;
	

	Record2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

		
		

public class GetSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record1 r1=new Record1(18, 45);
		int a1=r1.getX();
		int b1=r1.getY();
		System.out.println("additon of data in record1 is :" + (a1+b1));
		System.out.println("substraction of data in record1 is :" + (b1-a1));
		
		Record2 r2=new Record2(7, 57);
		int a2=r1.getA();
		int b2=r1.getB();
		System.out.println("additon of data in record1 is :" + (a2+b2));
		System.out.println("substraction of data in record1 is :" + (b2-a2));
	

	}

}
