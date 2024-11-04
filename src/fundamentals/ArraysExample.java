package fundamentals;

public class ArraysExample {

	public static void main(String[] args) {

		int a = 10;

		int[] intArr = { 10, 20, 30, 40, 50 };

//		System.out.println(intArr[-1]);		// Runtime-Exception ArrayIndexOutOfBoundsException
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
//		System.out.println(intArr[5]);  // Runtime-Exception ArrayIndexOutOfBoundsException

		System.out.println(intArr.length);

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		int b;
		b = 100;

		int[] intArr2 = new int[5];

		intArr2[0] = 100;
		intArr2[1] = 200;
		intArr2[2] = 300;
		intArr2[3] = 400;
		intArr2[4] = 500;

		for (int i = 0; i < intArr2.length; i++) {
			System.out.println(intArr2[i]);
		}

		for (int eachValue : intArr2) {
			System.out.println(eachValue);
		}

		int[][] int2DArr = { { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 }, { 1000, 2000, 3000, 4000, 5000 } };
		
		for(int i=0; i<int2DArr.length; i++) {
			for(int j=0; j<int2DArr[i].length;j++) {
				System.out.println( int2DArr[i][j]);
			}
		}
		
		for(int[] eachArray:int2DArr) {
			for(int eachValue:eachArray) {
				System.out.println(eachValue);
			}
		}
		
		
		int[][] int2DArr2 = new int[2][3];
		
		int2DArr2[0][0] = 11;
		int2DArr2[0][1] = 21;
		int2DArr2[0][2] = 31;
		int2DArr2[1][0] = 111;
		int2DArr2[1][1] = 211;
		int2DArr2[1][2] = 311;
		

		for(int[] eachArray:int2DArr2) {
			for(int eachValue:eachArray) {
				System.out.println(eachValue);
			}
		}
	}

}
