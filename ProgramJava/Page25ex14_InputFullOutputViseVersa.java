package ProgramJava;

import java.util.Scanner;

public class Page25ex14_InputFullOutputViseVersa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter an integer number:");
		int number = scanner.nextInt();
		
		while (number > 9) {
			int rightMostDigit = number % 10;
			number /= 10;
			System.out.print(rightMostDigit);
		}
		
		System.out.print(number);
		
		scanner.close();
	}
}
