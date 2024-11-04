package fundamentals;

public class TypeConversion {

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		long result1 = addition(123456, 123456); // Implicit Conversion // long has more memory than int, it can store
													// that value directly.
		System.out.println(result1);

		byte result2 = (byte) division(1000, 200); // Explicit Conversion // byte has less memory than int, it cant
													// store the value directly
		System.out.println(result2);

		result2 = (byte) division(1000, 5); // 200
		System.out.println(result2); // -56 loss of data -128 to + 127 // 200-127 = 73 = -128-73 = -56

		int a = 100;
		System.out.println(a);
		float b = a;
		System.out.println(b);

		float c = 100.5F; // 4 bytes
		int d = (int) c; // bytes

		System.out.println(c);
		System.out.println(d); // loss off data 0.5

		byte b1 = (byte) 130;

		System.out.println(b1);

		long long1 = 10000934664L;
		double double1 = long1;

		long1 = (long) double1;

		// Wrapper classes

		int int1 = 100; // Primitive

		Integer integer1 = 200; // non-primitive

		integer1 = int1; // primitive -> non-Primitive

		int1 = integer1; // non-Primitive-primitve

		String str = "10";

		System.out.println(str);

//		int int1 = (int) str;  // String non-primitive, int - primitive type

		int int2 = Integer.parseInt(str); // String to primitive

		int a1 = 10;
//		str = (String)a1;    // int primitive, String - non-primitive

		str = String.valueOf(a1); // primitive to String

		String str2 = "10.5";
		float float1 = Float.parseFloat(str2);

		String str3 = "true";
		boolean boolean3 = Boolean.parseBoolean(str3);

		String str4 = "Hello";

//		int int3 = Integer.parseInt(str4);   // NumberFormatException

		boolean boolean2 = Boolean.parseBoolean(str4); // false
		System.out.println(boolean2);
		
		
		Object obj1 = true;
		Object obj2 = 10;
		Object obj3 = 1000;
		Object obj4 = 'A';
		Object obj5 = 100000;
		Object obj6 = 100000000000000L;
		Object obj7 = 100.5F;
		Object obj8 = 100.465E34D;;
		Object obj9 = "Hello";
		Object obj10 = new TypeConversion();
		
		
		var var1 = true;   // varient
		var var2 = 10;
		var var3 = 1000;
		var var4 = 'A';
		var var5 = 100000;
		var var6 = 100000000000000L;
		var var7 = 100.5F;
		var var8 = 100.465E34D;;
		var var9 = "Hello";
		var var10 = new TypeConversion();
		

	}

}
