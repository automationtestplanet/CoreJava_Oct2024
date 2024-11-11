package inner.classes;

abstract public class AbstractClassWithAnonymousClass {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	abstract public void subtraction(int a, int b);

	public static void main(String[] args) {
//		AbstractClassWithAnonymousClass absCls = new AbstractClassWithAnonymousClass();  // We can not create object of Abstract class
		
		AbstractClassWithAnonymousClass absCls = new AbstractClassWithAnonymousClass() {
			@Override
			public void subtraction(int a, int b) {
				System.out.println(a-b);
			}
		};
		
		absCls.addition(10,20);
		absCls.subtraction(10, 5);   // it will be called from Anonymous class objet
	}

}
