package nimapLogical;

public class Missingarray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 8, 10 };

		for (int i = 0; i < 10; i++) {
			boolean found = false;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					found = true;
				}
			}
			if (!found) {
				System.out.println(i);
			}

		}

	}

}
