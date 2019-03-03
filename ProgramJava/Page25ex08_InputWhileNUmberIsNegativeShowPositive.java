package ProgramJava;

import java.util.Scanner;

public class Page25ex08_InputWhileNUmberIsNegativeShowPositive {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Next Int? 0 or -Negative Number to stop");
		int CurrentNumber = scanner.nextInt();
		int min = CurrentNumber;

		while (CurrentNumber > 0) {
			
			if (CurrentNumber < min) {
				min = CurrentNumber;
			}
			
			System.out.println("Enter Next Int? 0 or -Negative Number to stop");
			CurrentNumber = scanner.nextInt();

		}

		System.out.println("The minimum value was: " +min);
		scanner.close();
	}
}