package inheritance;

public class NewCalculator extends Calculator{

	void modDivision(int a,int b) {
		System.out.println(a%b);
	}
	
	public static void main(String[] args) {
		NewCalculator newCalc = new NewCalculator();
		newCalc.addition(10, 20);
		newCalc.modDivision(10, 3);
	}
}
