package demo;

import calculator.Calculator;
import calculator.UseCalculator;
//import calculator.ImplementCalculator;   // default class we can not import

public class UseCalculatorFromJar {

	public static void main(String[] args) {
		Calculator calc = new UseCalculator();
		System.out.println(calc.addition(10, 10));

	}

}
