package ProgramJava;

import java.util.Scanner;

public class Page29ex03_InputFullNumOutSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a positive number or a negative number to stop: ");
		int number = scanner.nextInt();
		
		while (number > 0) {
			
			int sumOfDigits = 0;
			
			while (number > 9) {
				int rightMostDigit = number % 10; // rightMostDigit = The ones digit
				sumOfDigits += rightMostDigit;
				number /= 10; // number = number / 10
			}
			
			sumOfDigits += number;
			
			System.out.println("Sum of digits: " + sumOfDigits);
			
			System.out.println("----------------");
			
			System.out.println("Enter a positive number or a negative number to stop: ");			
			number = scanner.nextInt();
		}
		
		scanner.close();
	}
}
/*
Enter a positive number or a negative number to stop: 345
Sum of digits: 12
 */