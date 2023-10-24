package ALLPrograms;

public class BiggestNoARray {
	public static void main(String[] args) {
		int arr[] = { 9, 12, 3, 4, 5, 6 };
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		System.out.println(arr[0]);
	}

}
