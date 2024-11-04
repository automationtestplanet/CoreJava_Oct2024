package fundamentals;

public class Methods {

	public static void addition() {
		int a = 100, b = 200;
		System.out.println("Addition of " + a + " and " + b + " :" + (a + b));
	}

	public static void subtraction() {
		int a = 100, b = 200;
		System.out.println("Subtraction of " + a + " and " + b + " :" + (a - b));
	}

	public static void multiplication() {
		int a = 100, b = 200;
		System.out.println("Multiplication of " + a + " and " + b + " :" + (a * b));
	}

	public static void division() {
		int a = 100, b = 200;
		System.out.println("Division of " + a + " and " + b + " :" + (a / b)); // prints quotient
	}

	public static void modDivision() {
		int a = 100, b = 200;
		System.out.println("Modular Division of " + a + " and " + b + " :" + (a % b)); // prints remainder
	}

	public static void main(String[] args) {
		
		addition();
		
	}

}
