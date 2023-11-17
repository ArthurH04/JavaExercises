package recursive;

public class RecursiveFibonacci {

	public static int fibonacci(int n) {

		int result;

		if (n == 0 || n == 1) {
			return n;
		} else {	
			result = fibonacci(n - 1) + fibonacci(n - 2);
			return result;
		}

	}

}
