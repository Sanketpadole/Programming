package nimapLogical;

public class PalindromNumber {
	public static void main(String[] args) {
		int num = 3554;
		int rev = 0;
		int rem;
		int Original;
		Original = num;
		while (num != 0) {
			rem = num % 10;
			rev = rem + rev * 10;
			num = num / 10;

		}
		if (Original == rev) {
			System.out.println("PalindromNumber");
		} else {
			System.out.println("Non palindrome");
		}
	}

}
