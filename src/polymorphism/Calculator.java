package polymorphism;

public class Calculator {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public void division(int a, int b) {
		System.out.println(a / b);
	}
	
	

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(10, 20);
		calc.subtraction(10, 20);
		calc.multiplication(10, 20);
		calc.division(10, 20);
		
//		calc.modDivision();

	}

}
