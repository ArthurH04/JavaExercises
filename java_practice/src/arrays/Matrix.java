package arrays;

import java.util.Scanner;

public class Matrix {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
		
		System.out.println("Enter the number of columns");
		int columns = input.nextInt();
		
		int matrix[][] = new int [rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.printf("Enter the matrix data in the position [%d][%d]", i, j);
				matrix[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		

	}
	
}
