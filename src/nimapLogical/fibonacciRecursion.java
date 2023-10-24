package nimapLogical;

public class fibonacciRecursion {

	private int a = 0;
	private int b = 1;
	int c;

	void fib(int n) {
		while (n < 0) {
			return;
		}

//		System.out.println(a);
//		System.out.println(b);
		c = a + b;
		System.out.println(a);
		a = b;
		b = c;
		fib(n - 1);

	}

	public static void main(String[] args) {
		fibonacciRecursion ff = new fibonacciRecursion();
		ff.fib(10);
	}
}

//	int a = 0;
//	int b = 1;
//	int c;
//	int n = 10;
//
//	void fib(int n) {
//		if (n < 0) {
//			return;
//		}
//		c = a + b;
//		System.out.println(a);
//		a = b;
//		b = c;
//		fib(n - 1);
//
//	}
//
//	public static void main(String[] args) {
//		fibonacciRecursion ff = new fibonacciRecursion();
//		ff.fib(10);
//
//	}
//}
