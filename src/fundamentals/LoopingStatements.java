package fundamentals;

public class LoopingStatements {

	public static void main(String[] args) {
		 
		String name= "Raj";
		
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
		
		for(int i=1; i<=10; i++) {
			System.out.println(name);
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------");
		for(int i=1; i<=10; i++) {
			if(i==4)
				continue;
			System.out.println("10 X "+i+" : "+ (i*10));
			if(i==8)
				break;
		}
		
		System.out.println("---------------------------------");
		
		int a = 1;
		while(a<=10) {
			if(a==3) {
				a++;
				continue;
			}
			System.out.println("11 X "+a+" : "+ (a*11));
			if(a==5)
				break;
			a++;
		}
		System.out.println("---------------------------------");
		int x = 11;
		while(x==10) {			
			System.out.println(x);
			break;
		}
		
		
		do {			
			System.out.println(x);			
		}while(x==10);
	}

}
