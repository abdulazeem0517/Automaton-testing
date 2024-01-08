package practice1;
class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int h, int c) {
        return a + h + c;
    }

    public int add1(int a, int h) {
        return a + h;
    }
}

public class Overloading_debug {
	public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        System.out.println("Sum of two integers: " + mathOps.add(22,77));
        System.out.println("Sum of three integers: " + mathOps.add(22,44,78));
        System.out.println("Concatenation of two strings: " + mathOps.add(15,24));
		// TODO Auto-generated method stub

	}

}
