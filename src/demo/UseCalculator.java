package demo;

import access.modifiers.Calculator;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(10, 20);  //public we can access in any package
//		calc.subtraction(10, 5); // protected  we cannot access outside the package but we can access if we extend the usage class
//		calc.multiplication(10, 3); // default we cannot access outside the package 
//		calc.division(10,20);   // private method  we can access inside the same package and same class
	}
}
