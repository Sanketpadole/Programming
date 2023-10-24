package nimapLogical;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "saasw";
		char ch;
		String nstr = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;

		}
		if (str.equals(nstr)) {
			System.out.println("palindrome string");
		} else
			System.out.println("non palindrome string");

	}

}
