package fundamentals;

final public class FinalKeywordExamples {

	
	static final String str = "Hello Java";
	
	static final void displayValue(final int a) {
		
//		a = 200;  // final parameter can not be changed
		final int b = 100;
//		b = 300;   // final local variable can not be changed
		System.out.println(FinalKeywordExamples.str);
	}
	
	public static void main(String[] args) {
		FinalKeywordExamples finalCls = new FinalKeywordExamples();
		
		System.out.println(FinalKeywordExamples.str);
		FinalKeywordExamples.displayValue(10);
		
//		finalCls.str = "HelloWorld"; // final global variable can not be changed
		

	}

}
