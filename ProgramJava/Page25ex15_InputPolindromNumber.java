package ProgramJava;

import java.util.Scanner;

public class Page25ex15_InputPolindromNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an integer number:");

		int number = scanner.nextInt();
		int numberCopy = number;
		int reverseNumber = 0;
		
		while (number > 9) {
			int rightMostDigit = number % 10;
			reverseNumber = reverseNumber * 10 + rightMostDigit;
			number /= 10;
		}
		
		reverseNumber = reverseNumber * 10 + number;
		
		if (reverseNumber == numberCopy) {
			System.out.print("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		scanner.close();
	}
}
