package polymorphism;

public class ArithematicOperations {
	
	public int addition(int a, int b) {
		return a + b;
	}

	public int subtraction(int a, int b) {
		return a - b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public float division(float a, int b) {
		return a / b;
	}
	
	public static int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int addition(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	final public int addition(int a,int b,int c, int d, int e) {
		return a+b+c+d+e;
	} 
	
	final public static int addition(int a,int b,int c, int d, int e, int f) {
		return a+b+c+d+e;
	}
	
	public static void main(String[] args) {
		ArithematicOperations arOp = new ArithematicOperations();
		System.out.println(arOp.addition(10, 20));
		System.out.println(arOp.addition(10, 20,30));
		System.out.println(arOp.addition(10, 20,30,40));
		System.out.println(arOp.addition(10, 20,30,40,50));
		System.out.println(arOp.addition(10, 20,30,40,50,60));
//		System.out.println(arOp.addition(10, 20,30,40,50,60,70));
//		System.out.println(arOp.addition(10, 20,30,40,50,60,70,80));
	}
}
