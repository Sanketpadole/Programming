package nimapLogical;

public class PrimeNoOrNot {
	public static void main(String[] args) {
		int num = 9;
		boolean isPrime = true;

		for (int j = 2; j < num / 2; j++) {
			if (num % j == 0) {
				isPrime = false;

				break;
			}

		}
		if (isPrime) {
			System.out.println("prime");
		} else {
			System.out.println(" is not a prime number");
		}

	}

}
