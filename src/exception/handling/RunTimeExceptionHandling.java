package exception.handling;

public class RunTimeExceptionHandling {

	public static void division(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		System.out.println("Program execution started");

		String str = null;

//		try {
//			division(100, 0);
////			throw new ArithmeticException();
//		} catch (ArithmeticException are) {
//
//		}
//
//		try {
//			System.out.println(str.toUpperCase());
//		} catch (NullPointerException ne) {
//
//		}

//		try {
//			division(100, 1);
//			System.out.println(str.toUpperCase());
//		} catch (ArithmeticException are) {
//
//		} catch (NullPointerException ne) {
//
//		}

//		try {
//			division(100, 0);
//			System.out.println(str.toUpperCase());
//		} catch (ArithmeticException | NullPointerException are) {
//
//		} 

//		try {		
//			division(100,1);
////			throw new ArithmeticException();
//			System.out.println(str.toUpperCase());
//		}catch(Exception are) {
//			
//		}
//		

		try {
			System.out.println("Open Database");
			System.out.println("Performed Database Query");
			division(100, 1);
		} catch (Exception are) {

		} finally {
			System.out.println("Close Database");
		}

		System.out.println("Program execution ended");
	}

}
