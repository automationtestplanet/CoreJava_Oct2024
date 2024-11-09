package demo;

import abstraction.Calculator;
import abstraction.UseCalculator;

public class AccessCalculator {
	
	public static void main(String[] args) {
		Calculator calc = new UseCalculator();
		System.out.println(calc.addition(10, 10));
	}

}
