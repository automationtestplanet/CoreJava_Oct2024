package inner.classes;

public interface InterfaceWithAnonymousClass {

	public void addition(int a, int b);

	public void subtraction(int a, int b);

	public static void main(String[] args) {
//		InterfaceWithAnonymousClass inf = new InterfaceWithAnonymousClass();  // we can not create Object of interface

		InterfaceWithAnonymousClass inf = new InterfaceWithAnonymousClass() {
			@Override
			public void addition(int a, int b) {
				System.out.println(a + b);
			}

			@Override
			public void subtraction(int a, int b) {
				System.out.println(a - b);
			}
		};
		
		inf.addition(100, 200);
		inf.subtraction(300, 200);
	}
}
