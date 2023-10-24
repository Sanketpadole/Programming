package nimapLogical;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] array = { 2, 3, 7, 8, 10 };
		int smallest;
		int largest;

		smallest = Arrays.stream(array).min().getAsInt();
		largest = Arrays.stream(array).max().getAsInt();
//		System.out.println(largest);

		for (int i = smallest; i < largest; i++) {
			boolean found = false;

			for (int j = 0; j < array.length; j++) {
				if (array[j] == i) {
					found = true;
					break;
				}

			}
			if (!found) {
				System.out.println(i);

			}
		}

	}

}
