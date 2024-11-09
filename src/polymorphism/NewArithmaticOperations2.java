package polymorphism;

public class NewArithmaticOperations2 extends ArithematicOperations {

	public int modDivision(int a, int b) {
		return a % b;
	}

	@Override
	public int addition(int a, int b) {
		return super.addition(a, b) + 10; // here it calls Addition from parent class,
											// super keyword and this keyword we can use in instance methods only
	}

	public static int addition(int a, int b, int c) {
		return ArithematicOperations.addition(a, b, c) + 10;
	}

//	final public int addition(int a, int b, int c, int d, int e) { // final methods we can not override
//		return a + b + c + d + e;
//	}
//
//	final public static int addition(int a, int b, int c, int d, int e, int f) { // final methods we can not override
//		return a + b + c + d + e;
//	}

	public static void main(String[] args) {
		NewArithmaticOperations2 newArOp2 = new NewArithmaticOperations2();

		System.out.println(newArOp2.addition(10, 20));
		System.out.println(newArOp2.subtraction(10, 20));

		ArithematicOperations arOp = newArOp2;
		System.out.println(arOp.addition(10, 20)); // Overriding

		System.out.println(NewArithmaticOperations2.addition(10, 20, 30));
		System.out.println(ArithematicOperations.addition(10, 20, 30)); // static methods we can not override

		System.out.println(NewArithmaticOperations2.addition(10, 20, 30, 40));

		ArithematicOperations arOp2 = new NewArithmaticOperations2(); // Up-casting

		System.out.println(arOp2.addition(10, 20));
//		System.out.println(arOp2.modDivision(10, 20));

		NewArithmaticOperations2 newArOp3 = (NewArithmaticOperations2) arOp2; // Down-Casting
		System.out.println(newArOp3.modDivision(10, 20));

	}

}
