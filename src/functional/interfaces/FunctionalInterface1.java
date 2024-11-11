package functional.interfaces;

@FunctionalInterface
public interface FunctionalInterface1 {
	public void addition();
	
	public static void main(String[] args) {
		FunctionalInterface1 funInf1 = new FunctionalInterface1() {
			@Override
			public void addition() {
				System.out.println(100);				
			}
			
		};
		
		funInf1.addition();
	}
}
