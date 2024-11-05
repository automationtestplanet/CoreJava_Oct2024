package fundamentals;

public class NewCalculator extends Calculator {

	public void division(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		NewCalculator newCalc = new NewCalculator();
		newCalc.addition(10, 20);
		newCalc.subtraction(10, 5);
		newCalc.multiplication(10, 5);
		newCalc.division(10, 3);
	}
}
