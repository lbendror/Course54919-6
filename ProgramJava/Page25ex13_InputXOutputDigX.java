package ProgramJava;

import java.util.Scanner;

public class Page25ex13_InputXOutputDigX {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an integer number:");
		int number = scanner.nextInt();
		
		System.out.println("Please enter a digit");
		int digit = scanner.nextInt();
		
		if (number < 0) {
			number *= -1; // same as: number = number * -1;
		}
		
		int digitCounter = 0;
		
		while (number > 9) {
			int rightMostDigit = number % 10;
			
			if (rightMostDigit == digit) {
				digitCounter++;
			}
			
			number /= 10;
		}
		
		if (number == digit) {
			digitCounter++;
		}
		
		System.out.println("The digit " + digit + " appears " + digitCounter + " time(s) in your number");
		
		scanner.close();
	}
}
