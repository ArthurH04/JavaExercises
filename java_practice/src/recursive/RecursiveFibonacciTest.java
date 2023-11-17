package recursive;

import java.util.Scanner;

public class RecursiveFibonacciTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print(RecursiveFibonacci.fibonacci(i) + " ");
		}	
		
		input.close();
				
	}

}
