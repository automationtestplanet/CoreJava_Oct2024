package fundamentals;

public class Operators {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println("-------------------Arithematic Operators------------------------");
		System.out.println("Addition of "+a+" and "+b+ " :"+(a+b));
		System.out.println("Subtraction of "+a+" and "+b+ " :"+(a-b));
		System.out.println("Multiplication of "+a+" and "+b+ " :"+(a*b));
		System.out.println("Division of "+a+" and "+b+ " :"+(a/b)); // prints quotient
		System.out.println("Modular Division of "+a+" and "+b+ " :"+(a%b));  // prints remainder
		
		
		System.out.println("-------------------Incremental Operators------------------------");
		int c = 10;
		c+=5;  // c = c+5;
		System.out.println(c);
		c-=5; //c=c-5;
		System.out.println(c);
		c*=5; //c=c*5;
		System.out.println(c);
		c/=5; //c=c/5;
		System.out.println(c);
		c%=5; //c=c%5;
		System.out.println(c);
		
		System.out.println(++c);
		System.out.println(c++);  // in the same line the value will not increase
		System.out.println(c);
		
		System.out.println(--c);
		System.out.println(c--);  // in the same line the value will not decrease
		System.out.println(c);
		
		System.out.println("-------------------Comparision Operators------------------------");
		int x = 5; int y = 10;
		
		boolean result= x<y;
		System.out.println(result);
		
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);  // x<y or x==y -> one condition is true , result will be true 
		System.out.println(x>=y); // x>y, x==y
		System.out.println(x==y);
		System.out.println(x!=y);
		
		System.out.println("-------------------Logical Operators------------------------");
		int e = 10; int d = 20; int f = 30;
		
		System.out.println(e<d || e<f); // T || T -> T   // if one condition is true, result will be true
		System.out.println(e<d && e<f);  // T && T -> T  //if one condition is false, result will be false
		System.out.println(!(e<d && e<f));		
		System.out.println(e<d || e<f && d > f || f < e); // T || F -> T || F -> T		
		System.out.println(e<d || e<f && d > f);  // T || F -> T
		
		System.out.println("-------------------Ternary Operators------------------------");
		int p = 10; int q= 20;
		
		System.out.println((p<q)?true:false);
		System.out.println((p<q)?p:q);
		System.out.println((p<q)?"P is lesser than Q: "+p:"P is greater than Q: "+q);
		System.out.println((p>q)?"P is lesser than Q: "+p:"P is greater than Q: "+q);
	}

}

