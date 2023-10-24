package nimapLogical;

public class anagram1 {
	public static void main(String[] args) {
//		String str = "Listen";
//		String str1 = "silent";
//		str = str.toLowerCase();
//		str1 = str1.toLowerCase();
//		char[] charArray1 = str.toCharArray();
//		char[] charArray2 = str1.toCharArray();
//		if (charArray1.equals(charArray2)) {
//			System.out.println("anagram");
//
//		} else {
//			System.out.println("non_anagram");
//		}
//
//	}
//}

		String str = "Listen";
		String str1 = "silent";
		char ch = 0;
		char ch1 = 0;
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		char[] charArray1 = str.toCharArray();
		System.err.println("anagramsdf" + charArray1);
		char[] charArray2 = str1.toCharArray();
		if (charArray1.equals(charArray2)) {
			System.out.println("anagram");
		} else {
			System.out.println("non_anagram");
		}

	}
}
