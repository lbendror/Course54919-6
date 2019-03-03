package ProgramJava;

import java.util.Scanner;

public class Page25ex05_NegativeNumberZeroto99 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scanner.nextInt();
		int sum=0;

		while (number != -99) {
			System.out.println("Please enter next positive number or -99 to stop: ");
			number = scanner.nextInt();

			if (number !=-99) {	
				sum +=number;  
			}
			System.out.println("The sum of number is: " +sum);
			scanner.close();
		}
	}
}
