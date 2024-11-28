package exception.handling;

public class TransactionError extends Exception {
	public TransactionError(String message) {
		System.out.println(message);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
