package nimapLogical;

public class PrimeNumb {
	public static void main(String[] args) {
		int number = 9; // Replace 17 with any positive integer you want to check
		boolean isPrime = true;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}

}
