package fundamentals;

public class NewCalculator2 extends NewCalculator {

	public void modDiision(int a, int b) {
		System.out.println(a%b);
	}
	
	public void addition(int a, int b) {
		System.out.println(a+b+5);
	}
	
	public static void main(String[] args) {
		NewCalculator2 newCalc2 = new NewCalculator2();
		newCalc2.addition(10, 20);
		newCalc2.division(10, 3);
		newCalc2.modDiision(10, 3);
		
	}
}
