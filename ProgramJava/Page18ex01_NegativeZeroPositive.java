package ProgramJava;

import java.util.Scanner;

public class Page18ex01_NegativeZeroPositive { //Page18ex01

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println("Negative");
		}
		else {
			if (number == 0) {
				System.out.println("Zero");
			}
			else {
					System.out.println("Positive");
				}
			}
		scanner.close();
		}
	}
