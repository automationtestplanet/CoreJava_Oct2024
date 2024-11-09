package polymorphism;

public class RuntimePolymorphismOrOverriding extends Calculator{
	
	@Override
	public void addition(int a, int b) {
//		System.out.println(a + b+5);
		System.out.println(a+b+5);
	}
	

	void modDivision(int a,int b) {
		System.out.println(a%b);
	}
	
	
	public static void main(String[] args) {
		RuntimePolymorphismOrOverriding rp = new RuntimePolymorphismOrOverriding();
		rp.addition(10, 20);
		
		byte b1 = 100;
		
		int a = b1;  // implicit conversion
		
		Calculator calc = new RuntimePolymorphismOrOverriding(); // with the parent class we can access only parent class methods
		calc.addition(10, 20);  // overriding
//		calc.modDivision(10,20);   // can not access child class methods
	}
}
