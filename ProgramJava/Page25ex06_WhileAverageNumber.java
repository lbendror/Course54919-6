package ProgramJava;

import java.util.Scanner;

public class Page25ex06_WhileAverageNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int CurrentNumber = scanner.nextInt();
		int counter=0;
		int sum=0;

		while (CurrentNumber != 0) {
			System.out.println("Please enter next positive number or 0 to stop: ");
			CurrentNumber = scanner.nextInt();
			if ( CurrentNumber !=0) {
				counter++;
				sum += CurrentNumber;
			}

			System.out.println("The average is:" + (sum/counter));

			scanner.close();
		}
	}
}