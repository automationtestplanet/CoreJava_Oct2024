package functional.interfaces;

public class LambdaExpressions {

	public static void main(String[] args) {

		FunctionalInterface1 funInf1 = new FunctionalInterface1() {
			@Override
			public void addition() {
				System.out.println(100);
			}
		};
		funInf1.addition();
		
		FunctionalInterface1 funInf1_1 = () -> System.out.println(1000);
		funInf1_1.addition();
		
		System.out.println("---------------------------------------------------");

		FunctionalInterface2 funInf2 = new FunctionalInterface2() {
			@Override
			public void addition(int a) {
				System.out.println(a);
			}
		};
		funInf2.addition(200);
		
		FunctionalInterface2 funInf2_2 = (a) -> System.out.println(a);
		funInf2_2.addition(2000);
		
		FunctionalInterface2 funInf2_3 = a -> System.out.println(a);
		funInf2_3.addition(20000);
		
		
		System.out.println("---------------------------------------------------");

		FunctionalInterface3 funInf3 = new FunctionalInterface3() {
			@Override
			public int addition() {
				return 300;
			}
		};
		System.out.println(funInf3.addition());
		
		FunctionalInterface3 funInf3_2 = () -> {return 3000;};
		System.out.println(funInf3_2.addition());
		
		FunctionalInterface3 funInf3_3 = () -> 30000;
		System.out.println(funInf3_3.addition());
		
		
		System.out.println("---------------------------------------------------");

		FunctionalInterface4 funInf4 = new FunctionalInterface4() {
			@Override
			public int addition(int a) {
				return a;
			}
		};
		System.out.println(funInf4.addition(400));
		
		FunctionalInterface4 funInf4_2 = a -> a;
		System.out.println(funInf4_2.addition(4000));
		
		System.out.println("---------------------------------------------------");

		FunctionalInterface5 funInf5 = new FunctionalInterface5() {
			@Override
			public void addition(int a, int b) {
				System.out.println(a + b);
			}
		};
		funInf5.addition(200, 300);
		
		FunctionalInterface5 funInf5_2 = (a,b)-> System.out.println(a+b);
		funInf5_2.addition(2000, 3000);
		
		System.out.println("---------------------------------------------------");

		FunctionalInterface6 funInf6 = new FunctionalInterface6() {
			@Override
			public int addition(int a, int b) {
				return a + b;
			}
		};
		System.out.println(funInf6.addition(300, 300));
		FunctionalInterface6 funInf6_2 = (a,b)-> a+b;
		System.out.println(funInf6_2.addition(3000,3000));
	}

}
