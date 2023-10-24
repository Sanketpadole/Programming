package nimapLogical;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 9;
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

}

//public static void main(String[] args) {
//	int number = 9; // Replace 17 with any positive integer you want to check
//	boolean isPrime = true;
//
//	for (int i = 2; i <= number / 2; i++) {
//		if (number % i == 0) {
//			isPrime = false;
//			break;
//		}
//	}
//
//	if (isPrime) {
//		System.out.println(number + " is a prime number");
//	} else {
//		System.out.println(number + " is not a prime number");
//	}
//
//}
