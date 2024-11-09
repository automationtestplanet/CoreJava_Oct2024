package abstraction;

public interface Interface1 {
	
	int A=100;  // by default all global variable sin the in the interface are public static final
	
	void addition(int a, int b);
	
	static void substraction(int a,int b) {
		System.out.println(a-b);
	}
	
	default void multiplication(int a, int b) {
		System.out.println(a*b);
	}
}
