package nimapLogical;

public class countLowercaseAnduppercase {
	public static void main(String[] args) {
		String input = "Hello world!";
		String lower;
		String upper;
		char ch;
		int uppercount = 0;
		int lowercount = 0;
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uppercount++;

			} else if (Character.isLowerCase(ch)) {
				lowercount++;
			}

		}
		System.out.println("Uppercase = " + uppercount + ", lowercase = " + lowercount);

	}
}
