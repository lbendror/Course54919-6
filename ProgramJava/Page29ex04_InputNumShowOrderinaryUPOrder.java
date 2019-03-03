package ProgramJava;

import java.util.Scanner;

public class Page29ex04_InputNumShowOrderinaryUPOrder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive integer can type more then one digit: ");
		int number = scanner.nextInt();

		int currentDigit = 0;

		while (currentDigit <= 9) { // roll over a number till Nine 123456789 number

			int numberCopy = number;

			while (numberCopy > 9) {

				int rightMostDigit = numberCopy % 10;

				if (rightMostDigit == currentDigit) {
					System.out.print(currentDigit);
				}

				numberCopy = numberCopy / 10;
			}

			if (numberCopy == currentDigit) {
				System.out.print(currentDigit);

			}

			currentDigit++;
		}

		scanner.close();
	}
}
