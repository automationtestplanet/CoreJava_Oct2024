package abstraction;

abstract public class AbstractClassExample {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	/**
	 * Description: This method performs multiplication operation on two integer
	 * variables data and prints that result
	 * 
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 */
	abstract public void multiplication(int a, int b);

	/**
	 * Description: This method performs Division operation on two integer
	 * variables data and prints that result
	 * @param a
	 * @param b
	 */
	abstract public void division(int a, int b);

//	public static void main(String[] args) {
//		AbstractClassExample absCls = new AbstractClassExample();   // we can not create object for Abstract Class
//	}

}
