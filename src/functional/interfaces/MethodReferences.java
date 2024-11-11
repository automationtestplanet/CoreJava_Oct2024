package functional.interfaces;

public class MethodReferences {

	public void subraction() {
		System.out.println(2000);
	}

	public static void multiplication() {
		System.out.println(5000);
	}

	public static void main(String[] args) {
//		FunctionalInterface1 funInf1 = () -> System.out.println(100);

		// Method references are two types, 1- Instance Reference for instance methods,
		// static reference for static methods

		MethodReferences methodRef = new MethodReferences();

		FunctionalInterface1 funInf1 = methodRef::subraction;
		funInf1.addition();

		FunctionalInterface1 funInf2 = MethodReferences::multiplication;
		funInf2.addition();

	}

}
