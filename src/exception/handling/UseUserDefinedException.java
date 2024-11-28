package exception.handling;

public class UseUserDefinedException {
	
	public static void displayNumber(int number) throws UserDefinedException {
		
		if(number >100)		
			System.out.println(number);
		else
			throw new UserDefinedException();
	}

	public static void main(String[] args) throws UserDefinedException {

		displayNumber(101);
	}
}
