package ProgramJava;

import java.util.Scanner;

public class Page25ex11_InputNumOutputNumDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an integer number:");
		int number = scanner.nextInt();
		
		if (number < 0) {
			number *= -1; // same as: number = number * -1;
		}
		
		int numberOfDigits = 1;
		
		while (number > 9) {
			number /= 10; // same as: number = number / 10;
			numberOfDigits++;
		}
		
		System.out.println("Number of digits: " + numberOfDigits);
		
		scanner.close();
	}
}
