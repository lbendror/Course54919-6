package ProgramJava;

import java.util.Scanner;

public class Page25ex07_InputWhileNUmberIsNegativeStop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int CurrentNumber = scanner.nextInt();
		int max=0;

		do {
			System.out.println("Enter Next Int? 0 or -Negative Number to stop");
			CurrentNumber = scanner.nextInt();
			
			if (CurrentNumber > max) {
				max = CurrentNumber;
			}
		}
		
		while (CurrentNumber>0);
			System.out.println("The max is " +max);
			scanner.close();
		}
	}