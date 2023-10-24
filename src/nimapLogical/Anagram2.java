package nimapLogical;

import java.util.Arrays;

class Anagram2 {
	public static void main(String[] args) {
		String str = "Silent";
		String str1 = "listend";
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		char[] charArray1 = str.toCharArray();
		char[] charArray2 = str1.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("anagram");
		} else {
			System.out.println("non_anagram");
		}

	}

}
