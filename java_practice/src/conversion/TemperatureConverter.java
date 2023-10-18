package conversion;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConverter {
	
	public static void main(String[] args) {

		double c, f;
		String controller;

		DecimalFormat format = new DecimalFormat("#0.0");
		Scanner input = new Scanner(System.in);

		do {

			System.out.println("Which temperature conversion would you like to do?");
			System.out.println("Celcius to Fahrenheit -> Press 'F' \n" 
			+ "Fahrenheit to Celcius -> Press 'C' ");

			char choice = input.next().toUpperCase().charAt(0);

			switch (choice) {
			case 'F':
				
				System.out.println("Type the temperature in Celsius: ");
				c = input.nextDouble();
				f = (c * 9 / 5) + 32;
				System.out.println(c + "° in Fahrenheit it's: " + format.format(f));
				break;
				
			case 'C':
				System.out.println("Type the temperature in Fahrenheit");
				f = input.nextDouble();
				c = (f - 32) * 5 / 9;
				System.out.println(f + "° in Celsius it's: " + format.format(c));
				break;
				
			default:
				System.out.println("Invalid choice.");
				controller = "C";
				continue;
			}
			
			System.out.println("\nWould you like to (C)onvert again or (Q)uit?");
			controller = input.next().toUpperCase();
			
		} while (!controller.equals("Q"));
		
		input.close();

	}
	
}
