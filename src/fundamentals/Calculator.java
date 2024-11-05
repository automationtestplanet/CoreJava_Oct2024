package fundamentals;

public class Calculator implements CalculatorInterface {

	@Override
	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void addition(String a, String b) {
		System.out.println(a + b);
	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	@Override
	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void division(int a, int b) {

	}

	@Override
	public void modDivision(int a, int b) {

	}

}
