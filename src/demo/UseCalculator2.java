package demo;

import access.modifiers.Calculator;

public class UseCalculator2 extends Calculator{

	public static void main(String[] args) {
		UseCalculator2 calc = new UseCalculator2();
		calc.addition(10, 20);  //public we can access in any package
		calc.subtraction(10, 5); // protected we can access if we extend the Usage class
//		calc.multiplication(10, 3); // default we cannot access outside the package 
//		calc.division(10,20);   // private method  we can access inside the same package and same class

	}

}
