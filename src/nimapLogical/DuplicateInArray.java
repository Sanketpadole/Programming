package nimapLogical;

public class DuplicateInArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 8, 7, 2, 10 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}

		}

	}

}
