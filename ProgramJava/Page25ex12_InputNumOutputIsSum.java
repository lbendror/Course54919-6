package ProgramJava;

import java.util.Scanner;

public class Page25ex12_InputNumOutputIsSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an integer number:");
		int number = scanner.nextInt();
		
		if (number < 0) {
			number *= -1; // same as: number = number * -1;
		}
		
		int sumOfDigits = 0;
		
		while (number > 9) {
			int rightMostDigit = number % 10;
			sumOfDigits += rightMostDigit;
			number /= 10;
		}
		
		sumOfDigits += number;
		
		System.out.println("Sum of digits: " + sumOfDigits);
		
		scanner.close();
	}
}
