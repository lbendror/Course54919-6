package ProgramJava;

import java.util.Scanner;

public class Page41ex02_Input4Digits_printNegativeDigits {

	static int negativesCounter = 0;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 4 integers:");
		
		for (int i=0; i<4; i++) {
			int num = scanner.nextInt();
			countNegatives(num);
		}
		
		System.out.println("Number of negatives: " + negativesCounter);
		
		scanner.close();
	}
	
	public static void countNegatives(int number) {
		
		if (number < 0) {
			negativesCounter++;
		}
	}
}
