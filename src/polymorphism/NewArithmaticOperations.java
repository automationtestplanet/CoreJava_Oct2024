package polymorphism;

public class NewArithmaticOperations extends ArithematicOperations {

	public int modDivision(int a, int b) {
		return a%b;
	}
	
	public int addition(int a, int b) {
		return a + b+10;
	}
	
	
	public static void main(String[] args) {
		NewArithmaticOperations newArOp = new NewArithmaticOperations();
		System.out.println(newArOp.addition(10, 20));
		System.out.println(newArOp.modDivision(10, 3));
		
		byte b = 100;
		int int1 = b; // implicit conversion
		
		byte b2 = (byte) int1; // Explicit conversion
		
		ArithematicOperations arOp = newArOp;  // Up-Casting   // Implicit Conversion
		arOp.addition(10, 20);
		arOp.subtraction(20, 10);
		arOp.multiplication(10, 3);
		arOp.division(10, 3);
		
//		arOp.modDivision(10, 3);   // Child class methods we can not access with parent class reference
		
		NewArithmaticOperations newArOp1 = (NewArithmaticOperations)arOp;   // Down-casting  // Explicit Conversion
		System.out.println(newArOp1.addition(10, 20));
		System.out.println(newArOp1.modDivision(10, 3));
		
		
		
	}

}
