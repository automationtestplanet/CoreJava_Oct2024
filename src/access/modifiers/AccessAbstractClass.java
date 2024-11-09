package access.modifiers;

import abstraction.AbstractClassExample;
import abstraction.UseAbstractClass;

public class AccessAbstractClass {

	public static void main(String[] args) {
//		AbstractClassExample absCls = new AbstractClassExample();   // we can not create object of Abstract class
//		ImplementAbstractCLass implAbsCls = new ImplementAbstractCLass();  // we can not access as it a default class not public.
//		UseAbstractClass useabsCls = new UseAbstractClass();
		
		AbstractClassExample absCls = new UseAbstractClass();
		absCls.multiplication(10, 3);
		absCls.division(10, 3);
	}

}
