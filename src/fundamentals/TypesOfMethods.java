package fundamentals;

public class TypesOfMethods {

	public static void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " :" + (a + b));
	}

	public static int addition2(int a, int b) {
		return (a + b);
	}

	public static void addition3() {
		int a = 100, b = 200;
		System.out.println("Addition of " + a + " and " + b + " :" + (a + b));
	}

	public static int addition4() {
		int a = 100, b = 200;
		return (a + b);
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		addition(5, 10);
		addition(10, 20);
		addition(100, 200);
		addition(1000, 2000);

		System.out.println(addition2(50, 40));

		int result = addition2(500, 400);

		System.out.println(result);

		addition3();

		System.out.println(addition4());
		int result2 = addition4();
		System.out.println(result2);
		
		
		int result3 = division(1000, 200);
		System.out.println(result3);
	}

}
