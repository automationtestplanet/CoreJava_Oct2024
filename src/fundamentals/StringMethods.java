package fundamentals;

public class StringMethods {

	public static void main(String[] args) {

		String str = "This is Java";

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		System.out.println(str.contains("Java"));
		System.out.println(str.contains("java"));

		System.out.println(str.equals("This is Java"));
		System.out.println(str.equals("this is java"));
		System.out.println(str.equalsIgnoreCase("this is java"));

		System.out.println(str.substring(8));
		System.out.println(str.substring(0, 4));

		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('i'));
		System.out.println(str.lastIndexOf('i'));
		
		int a = 100;		
		System.out.println(String.valueOf(a));
		
		System.out.println(str.replace("i", "I"));
		System.out.println(str.replace("Java", "World"));
		System.out.println(str.replace("java", "World"));
		System.out.println(str.replaceAll("Java", "Raj"));
		System.out.println(str.replace("a", "H"));
		System.out.println(str.replaceFirst("a", "H"));
		
		String str2 = "aAbBCDcd123$%^%&EefFGgHh56748!@#";
		
		System.out.println(str2.replaceAll("[^0-9]",""));
		System.out.println(str2.replaceAll("[^a-z]",""));
		System.out.println(str2.replaceAll("[^A-Z]",""));
		System.out.println(str2.replaceAll("[^a-zA-Z]",""));
		System.out.println(str2.replaceAll("[a-zA-Z0-9]",""));
		
		char[] charArr = str.toCharArray();
		
		for( char eachChar : charArr)
			System.out.print(eachChar+" ");
		

		System.out.println();
		String[] strArr  = str.split(" ");
		for(String eachStr:strArr)
			System.out.println(eachStr);
		
		String str3 = "123*$.";
		System.out.println(str3.replaceAll("\\$", ""));
		System.out.println(str3.replaceAll("\\*", ""));
		System.out.println(str3.replaceAll("\\.", ""));		
		System.out.println("\"\"");
		
		String str4 = str.concat(" World");
		System.out.println(str4);
		System.out.println(str);  // String immutable -> once we create the string, that string can not change
		str = str.concat(" World");
		System.out.println(str);
		System.out.println(str);  // we can reassign the new string in to str reference
		
		String string1 = "Java";
		String string2 = new String("Java");
		String string3 = "Java";
		System.out.println(string1 == string2); // compares with memory
		System.out.println(string1 == string2.intern());  // Temporally moving String2 value to String constant pool
		System.out.println(string1 == string3);
		
		System.out.println(string1.equals(string2)); // It compares only values
		System.out.println(string1.equals(string3));
		
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		System.out.println(string3.hashCode());
		
	}

}
