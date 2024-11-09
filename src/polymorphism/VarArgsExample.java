package polymorphism;

public class VarArgsExample {

	
	public void addition(int ...a) {   // var-args
		int sum = 0;
		for(int eachNum : a)
			sum+=eachNum;
		
		System.out.println(sum); 
	}
	
	
	public static void main(String[] args) {
		VarArgsExample varArgsEx = new VarArgsExample();
		
		varArgsEx.addition(10);
		varArgsEx.addition(10,20);
		varArgsEx.addition(10,20,30);
		varArgsEx.addition(10,20,30,40);
		varArgsEx.addition(10,20,30,40,50);
		varArgsEx.addition(10,20,30,40,50,60);
		varArgsEx.addition(10,20,30,40,50,60,70);
		varArgsEx.addition(10,20,30,40,50,60,70,80);
		varArgsEx.addition(10,20,30,40,50,60,70,80,90);
		varArgsEx.addition(10,20,30,40,50,60,70,80,90,100);
		
	}

}
