package fundamentals;

public class TypesOfClassMembers {
	
	public static int a = 1000;   // static variables
	public static int b = 2000;  // static variables
	
	public int c = 3000;  // instance variable
	
	public static void addition() {		
		int a = 10;  // local variables
		int b = 20; // local variables
		
		System.out.println(a+b);		
	}
	
	
	public static void subtraction() {  // static method
		System.out.println(a+b);    // local variables of other method cannot be accessible in another method
	}
	
	public static void multiplication(int a, int b) {    // static method
		System.out.println(a+b);   // method parameters also local variables
	}
	
	public static void division() {   //static method
		System.out.println(a);  // static variable
		System.out.println(b);  // static variable
//		System.out.println(c);  // eventhough we have global data, if it is non static, we can not access.
		
//		modDivision();   // instance method can not access static method directly.
	}
	
	public void modDivision() {  //  instance method
		System.out.println(a);  // static variable
		System.out.println(b);  // static variable
		System.out.println(c);  // local variable
		
		division();    // static method can be accessed in to instance methods
	}
	
	public void display() {  // instance method
		modDivision();   // instance method can be access into instance method directly
	}

	public static void main(String[] args) {
		int a = 100;
		int b= 200;
		
		System.out.println(a+b);
//		System.out.println(c); // instance variable
		
		addition();
		subtraction();
		multiplication(a, b);
		division();
//		modDivision();  // instance method can not access static method directly.
//		display();   // instance method can not access static method directly.
	}

}
