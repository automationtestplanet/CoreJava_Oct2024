package polymorphism;

public class CompiletimePolymorphismOrOverloading {

	void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	void addition(String a, String b) {
		System.out.println(a + b);
	}

	void addition(char a, char b) {
		System.out.println(a + b);
	}

	void addition(int a, float b) {
		System.out.println(a + b);
	}

	void addition(int a, long b) {
		System.out.println(a + b);
	}

	void addition(float a, double b) {
		System.out.println(a + b);
	}

	void addition(double a, long b) {
		System.out.println(a + b);
	}

	void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		CompiletimePolymorphismOrOverloading cp = new CompiletimePolymorphismOrOverloading();
		cp.addition(10, 20);
		cp.addition(10, 20, 30);

	}

}
