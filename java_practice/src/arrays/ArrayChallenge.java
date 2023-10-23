package arrays;

import java.util.Scanner;

public class ArrayChallenge {

	public static void main(String[] args) {

		/*
		 * Ask the user how many grades do you want to report?
		 * 
		 * First for - store grades 
		 * Second forEach - sum grades and calculate the
		 * average
		 * 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("How many grades would you like to type?");
		int gradesNum = input.nextInt();

		double grades[] = new double[gradesNum];

		for (int i = 0; i < gradesNum; i++) {
			System.out.print("Type the " + (i + 1) + "° grade: ");
			grades[i] = input.nextDouble();
		}

//		System.out.println(Arrays.toString(grades));

		double total = 0;
		for (double grade : grades) {
			total += grade;
		}

//		System.out.println(total);
		
		double average = total / grades.length;
		
		System.out.println("The average grade is: " + average);

		input.close();

	}

}
