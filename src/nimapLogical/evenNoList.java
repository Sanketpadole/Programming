package nimapLogical;

import java.util.ArrayList;

public class evenNoList {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 8, 10 };
		ArrayList list = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				list.add(arr[i]);
				System.out.println("even" + arr[i]);
			} else if (arr[i] % 2 != 0) {

				list.add(arr[i]);
				System.out.println("odd" + arr[i]);

			}
		}

	}

}
