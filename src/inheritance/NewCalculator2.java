package inheritance;

public class NewCalculator2 extends NewCalculator{
	void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		NewCalculator2 calc2 = new NewCalculator2();
		calc2.addition(10, 20);
		calc2.modDivision(10, 3);
		calc2.addition(10, 20, 30);
		
	}
}
