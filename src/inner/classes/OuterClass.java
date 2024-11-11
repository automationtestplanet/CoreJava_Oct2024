package inner.classes;

public class OuterClass {

	class InnerInstanceClass {
		public void method1() {
			System.out.println("This is Instnace Inner calss method1()");
		}
	}

	static class InnerStaticClass {
		public void method2() {
			System.out.println("This is Static Inner calss method2()");
		}
	}

	// Anonymous class
	{
//		int a = 100;;
//		int b = 200;		
//		System.out.println(a+b);
		System.out.println("Thhis is Anonymous class");
	}

	// static block  -> always executes first before the main method
	static {
		System.out.println("Thhis is static block");
	}
	
	public static void main(String[] args) {
		OuterClass oCls = new OuterClass();
		OuterClass.InnerInstanceClass innerInsCls = oCls.new InnerInstanceClass();
		innerInsCls.method1();
		OuterClass.InnerStaticClass innerStaticCls= new InnerStaticClass();
		innerStaticCls.method2();
	}

}
