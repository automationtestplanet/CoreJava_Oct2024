
package assignments.raju;

public class Assignment1 {
	// write a program to extract numbers from the string and perform the sum
	// 0- 48, 1-49, 2-50 ----- 8-56
	
	public static void extractNumbersAndPerfromSum(String str) {
		int sum = 0;
		for(char eachChar : str.replaceAll("[^0-9]", "").toCharArray()) {
			sum+=(eachChar-'0');					
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		extractNumbersAndPerfromSum("aAbBCDcd123$%^%&EefFGgHh56748!@#");
	}

}