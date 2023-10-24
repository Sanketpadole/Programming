package nimapLogical;

public class fibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int i = 0;
//		System.out.println(a);
//		System.out.println(b);
		while (i < 10) {
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;
			i++;

		}

	}

}

//0,1,1,2,3,5,8
