package abstraction;

public class UseInterface1 implements Interface1{

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		Interface1 inf1 = new UseInterface1();
		inf1.addition(10, 20);
		Interface1.substraction(10, 5);
		
//		Interface1.multiplication(10,3);  // default method we can not access with the Interface name
		inf1.multiplication(10, 3);
		
		System.out.println(inf1.A);
		System.out.println(Interface1.A);
//		A = 200;  // final variable an not change the value
	}

	

}
