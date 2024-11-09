package abstraction;

class ImplementAbstractCLass extends AbstractClassExample {

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}

	@Override
	public void division(int a, int b) {
		 System.out.println(a/b);
	}

//	public static void main(String[] args) {
//		ImplementAbstractCLass implAbsCls = new ImplementAbstractCLass();
//		
//		implAbsCls.addition(10, 20);
//		implAbsCls.subtraction(20, 5);
//		implAbsCls.multiplication(10, 5);
//		implAbsCls.division(10, 3);
//		
//		
//		AbstractClassExample absClass = new ImplementAbstractCLass();
//		
//		absClass.addition(10, 20);
//		absClass.subtraction(20, 5);
//		absClass.multiplication(10, 5);
//		absClass.division(10, 3);
//		
//		
//	}

}
