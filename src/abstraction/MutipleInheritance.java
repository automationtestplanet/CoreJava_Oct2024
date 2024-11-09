package abstraction;

public class MutipleInheritance extends AbstractClass2 implements Interface1, Interface2, Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modDivision(int a, int b) {
		System.out.println(a%b);
		
	}

	@Override
	public void division(int a, int b) {
		System.out.println(a/b);
		
	}

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
		
	}

}
