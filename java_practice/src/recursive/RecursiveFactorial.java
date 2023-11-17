package recursive;

public class RecursiveFactorial {

//	public static int factorial(int n) {
//		System.out.print(n + "! = ");
//		return recursiveFactorial(n);
//	}
	
	static boolean isFirstCall = true;
	
	public static int recursiveFactorial(int n) {
		
		int result;
	
		if (isFirstCall) {
			System.out.print(n + "! ");
			isFirstCall = false;
		}	
		if (n == 0) {
			return 1;
			
		} else {
			if (n > 1) {
				System.out.print(n + " x ");
			}else {
				System.out.print(n + " = ");
			}
			result = recursiveFactorial(n - 1) * n;
			return result;
		}
	}

}
