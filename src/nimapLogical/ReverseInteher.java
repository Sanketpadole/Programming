package nimapLogical;

public class ReverseInteher {
	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;
		int rem;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		if (num == rev) {
			System.out.println("Not_ISreverse");
		} else {
			System.out.println("ISreverse");

		}

	}

}
