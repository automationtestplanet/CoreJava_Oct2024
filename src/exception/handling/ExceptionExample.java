package exception.handling;

public class ExceptionExample {

	public static void main(String[] args) throws Exception {
		int a = 100;
//		int = b 100;  // syntax error -> compilation error
		int b = 100;

		int c = 0;

		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		System.out.println("Execution Started");

		try {
			System.out.println(a / c); // execution error
		} catch (Exception e) {

		}

		System.out.println("Execution Completed");
	}

}
