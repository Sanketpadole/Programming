package nimapLogical;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str = "Listen";
		String str1 = "silent";
		char ch = 0;
		char ch1 = 0;
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		char[] charArray1 = str.toCharArray();
		System.err.println("anagramsdf" + charArray1);
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
