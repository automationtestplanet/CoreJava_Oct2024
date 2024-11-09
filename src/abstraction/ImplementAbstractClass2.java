package abstraction;

public class ImplementAbstractClass2 extends AbstractClass2{

	public ImplementAbstractClass2(int a, String str) {
		super(a,str);
	}
	
	public static void main(String[] args) {
		AbstractClass2 absCls2 = new ImplementAbstractClass2(100, "Java");
		absCls2.display();
	}
}
