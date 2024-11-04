package fundamentals;

public class ConstructorExample {

	
	public ConstructorExample() {
		
	}
	
	int a = 100;
	
	static int b = 200;
	
	void display() {
		System.out.println("this is instance method");
	}
	
	void addition(int a, int b) {
		int c = 100;
		int d = 200;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	void subtraction() {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}
	
	static void multiplication() {
//		System.out.println(consEx.a);   // consEx is local variable we can not access out side the method
//		consEx.display();   // consEx is local variable we can not access out side the method
		
		
	//one more copy of data will be created
		ConstructorExample consEx = new ConstructorExample();  // local variable		
		System.out.println(consEx.a);
		consEx.display();
	}
	
	public static void main(String[] args) {
		
		ConstructorExample consEx = new ConstructorExample();  // local variable		
		System.out.println(consEx.a);
		consEx.display();
		
		
		ConstructorExample consEx2 = new ConstructorExample();  // local variable		
		System.out.println(consEx2.a);
		consEx2.display();
		
		ConstructorExample consEx3 = new ConstructorExample();  // local variable		
		System.out.println(consEx3.a);
		consEx3.display();
		
	}

}
