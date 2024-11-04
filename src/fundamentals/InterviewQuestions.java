package fundamentals;

public class InterviewQuestions {

	// write a program to print non-repeating characters from the String
	public static void printNonRepeatingCharsFromString(String str) {
		for (char eachChar : str.toCharArray()) {
			if (str.indexOf(eachChar) == str.lastIndexOf(eachChar)) {
				System.out.print(eachChar + " ");
			}
		}
		System.out.println();
	}

	// write a program to print repeating characters from the String
	public static void printRepeatingCharsFromString(String str) {
		for (char eachChar : str.toCharArray()) {
			if (str.indexOf(eachChar) != str.lastIndexOf(eachChar)) {
				System.out.print(eachChar + " ");
			}
		}
		System.out.println();
	}

	// write a program to print unique characters from the String
	public static void printUniqueCharsFromString(String str) {
		while (str.length() > 0) {
			System.out.print(str.charAt(0));
			str = str.replaceAll(String.valueOf(str.charAt(0)), "");
		}
		System.out.println();
	}

//	write a program to sort array elements (it can be number array, char array, str array)
	public static void sortNumberArrayInAscendingOrder(int[] intArr) {
//		{20,50,10,40,30};  -> {10,20,30,40,50}		
		// 10,50,20,40,30 -> 10,20,40,30,50 -> 10,20,30,40,50

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					int tempNum = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = tempNum;
				}
			}
		}

		for (int eachNum : intArr) {
			System.out.print(eachNum + " ");
		}

		System.out.println();

	}

	public static void sortNumberArrayInDescendingOrder(int[] intArr) {
//		{20,50,10,40,30};  -> {10,20,30,40,50}		
		// 10,50,20,40,30 -> 10,20,40,30,50 -> 10,20,30,40,50

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					int tempNum = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = tempNum;
				}
			}
		}

		for (int eachNum : intArr) {
			System.out.print(eachNum + " ");
		}

		System.out.println();

	}

	public static void sortCharArray(char[] charArr) {

		for (int i = 0; i < charArr.length; i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if ((int) charArr[i] > (int) charArr[j]) {
					char tempChar = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = tempChar;
				}
			}
		}

		for (char eachNum : charArr) {
			System.out.print(eachNum + " ");
		}

		System.out.println();

	}

	public static void sortStringArray(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if ((int) strArr[i].charAt(0) > (int) strArr[j].charAt(0)) {
					String tempStr = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = tempStr;
				}
			}
		}

		for (String eachStr : strArr) {
			System.out.print(eachStr + " ");
		}

		System.out.println();
	}

//	Write a program to reverse a string
	public static void reverseString(String str) {
		String revStr = "";

		for (char eachChar : str.toCharArray()) {
			revStr = eachChar + revStr; // s -> ts -> rts -> irts -> nirts -> gnirts
		}
		System.out.println(revStr);

	}

//	write a program to reverse each word in a sentence without changing their position
	// Hello Java -> olleH avaJ

	public static void reverSentenceWithoutChaingWordsPosition(String setense) {

		String revSetense = "";
		for (String eachString : setense.split(" ")) {
			String revStr = "";
			for (char eachChar : eachString.toCharArray()) {
				revStr = eachChar + revStr;
			}
			revSetense = revSetense + revStr + " ";
		}

		System.out.println(revSetense);
	}

//	write a program to reverse a string without changing special characters position
	// Str = "H$el#l&o" -> o$ll#e&H

	public static void reverseStringWithoutChangingSpecialCharaters(String str) {
		char[] charArr = new char[str.length()];

		int j = str.length() - 1; // 7 6 5 4 // -> o $ l l # e & H

		for (int i = 0; i <= j;) {
			if (!Character.isAlphabetic(str.charAt(i))) {
				charArr[i] = str.charAt(i);
				i++;
			} else if (!Character.isAlphabetic(str.charAt(j))) {
				charArr[j] = str.charAt(j);
				j--;
			} else {
				charArr[j] = str.charAt(i);
				charArr[i] = str.charAt(j);
				j--;
				i++;
			}
		}

		System.out.println(new String(charArr));

	}

//	write a program to check whether the two strings are anagrams

	public static void checkAnagrams(String str1, String str2) {

		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		sortCharArray(charArr1);
		sortCharArray(charArr2);

		if (new String(charArr1).equals(new String(charArr2))) {
			System.out.println(str1 + " and  " + str2 + " are Anagrams");
		} else {
			System.out.println(str1 + " and  " + str2 + " are not Anagrams");
		}

	}

//	Write a program to reverse a number
	public static void reverseNumber(int num) {
		int revNum = 0; // 123
		while (num > 0) {
			int remainder = num % 10; // 3 2 1
			revNum = (revNum * 10) + remainder; // 3 32 321
			num = num / 10; // 12 1 0
		}

		System.out.println(revNum);

	}

//	Write a program to check whether the string palindorme or not
	// malayalam -> malayalam
	public static void checkStringPalindrome(String str) {
		String revStr = "";

		for (char eachChar : str.toCharArray()) {
			revStr = eachChar + revStr; // s -> ts -> rts -> irts -> nirts -> gnirts
		}

		if (str.equals(revStr)) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

//	Write a program to check whether the number palindorme or not	
	public static void checkNumberPalindrome(int num) {
		int revNum = 0; // 123
		int tempNum = num;
		while (tempNum > 0) {
			int remainder = tempNum % 10; // 3 2 1
			revNum = (revNum * 10) + remainder; // 3 32 321
			tempNum = tempNum / 10; // 12 1 0
		}

		if (num == revNum) {
			System.out.println(num + " is a Palindrome");
		} else {
			System.out.println(num + " is not a Palindrome");
		}
	}

//	write a program to check whether the number is Armstrong number or not
	// 153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27 = 153
	public static void chekArmstrongNumber(int num) {
		int revNum = 0; // 123
		int tempNum = num;
		while (tempNum > 0) {
			int remainder = tempNum % 10; // 3 2 1
			revNum = revNum + (remainder * remainder * remainder); // 3 32 321
			tempNum = tempNum / 10; // 12 1 0
		}

		if (num == revNum) {
			System.out.println(num + " is a Armstrong");
		} else {
			System.out.println(num + " is not a Armstrong");
		}
	}

//	write a program to print fibonacci series
//	write a program to check whether the number is prime or not
//	write program to extract numbers from Alphanumeric string and sum each digit
//	Printing patterns
//	Other Interview question

	public static void main(String[] args) {

		// Print non-repeating characters from String
		printNonRepeatingCharsFromString("Hello");
		printNonRepeatingCharsFromString("Java");

		// Print repeating characters from String
		printRepeatingCharsFromString("Hello");
		printRepeatingCharsFromString("Java");

		// Print unique characters from String
		printUniqueCharsFromString("Hello");
		printUniqueCharsFromString("Java");

		// Sort Number array In ascending order
		int[] arr = { 4, 1, 5, 2, 3 };
		int[] arr2 = { 40, 10, 50, 20, 30 };
		sortNumberArrayInAscendingOrder(arr);
		sortNumberArrayInAscendingOrder(arr2);
		sortNumberArrayInDescendingOrder(arr);
		sortNumberArrayInDescendingOrder(arr2);
		char[] charArr = { 'd', 'b', 'a', 'c', 'e' };
		sortCharArray(charArr);
		String[] strArr = { "Banana", "Cherry", "Apple" };
		sortStringArray(strArr);

		// Reverse a string
		reverseString("Java");
		reverseString("Hello");
		reverseString("Hello Java");

		// Reverse sentense without chaiging words position
		reverSentenceWithoutChaingWordsPosition("Hello Java");
		reverSentenceWithoutChaingWordsPosition("Hello This is Java");

		// Reverse stringwithout changing special characters position
		reverseStringWithoutChangingSpecialCharaters("H$el#l&o");

		// check Anagrams
		checkAnagrams("rock", "cork");
		checkAnagrams("hello", "java");
		checkAnagrams("lamp", "palm");

		// Print reverseNumber
		reverseNumber(123);
		reverseNumber(1234);

		// check String palindrome
		checkStringPalindrome("Hello");
		checkStringPalindrome("malayalam");

		// check number palindrome
		checkNumberPalindrome(123);
		checkNumberPalindrome(404);
		checkNumberPalindrome(505);

		// check number armstrong
		chekArmstrongNumber(121);
		chekArmstrongNumber(153);

	}

}
