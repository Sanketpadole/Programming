package ALLPrograms;

public class MaxInARray {
	public static void main(String[] args) {
		int temp;
		int arr[] = { 1, 33, 4, 5, 66, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				System.out.println(arr[5]);

			}

		}

	}

}
