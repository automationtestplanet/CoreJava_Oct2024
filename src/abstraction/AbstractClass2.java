package abstraction;

abstract public class AbstractClass2 {

	int a;
	String str;

	public AbstractClass2() {

	}

	public AbstractClass2(int a, String str) {
		this.a = a;
		this.str = str;
	}
	
	public void display() {
		System.out.println(a);
		System.out.println(str);
	}
	
	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {

//		AbstractClass2 absCls2 = new AbstractClass2();   // can not create Object of abstract class
	}

}
