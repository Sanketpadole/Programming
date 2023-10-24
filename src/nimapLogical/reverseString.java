package nimapLogical;

public class reverseString {
	public static void main(String[] args) {
		String str = "Saas";
		str = str.toLowerCase();
		char ch;
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;

		}
		if (rev.equals(str)) {
			System.out.println("reverse");
		} else {
			System.out.println("Notreverse");
		}

	}

}
