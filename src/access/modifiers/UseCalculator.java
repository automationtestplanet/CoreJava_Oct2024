package access.modifiers;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.addition(10, 20);  //public
		calc.subtraction(10, 5); // protected
		calc.multiplication(10, 3); // default
//		calc.division(10,20);   // private method  we can access inside the same class
	}

}
