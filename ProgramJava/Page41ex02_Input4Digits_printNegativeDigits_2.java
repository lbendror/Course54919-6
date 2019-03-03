package ProgramJava;

import java.util.Scanner;

public class Page41ex02_Input4Digits_printNegativeDigits_2 {

	static int negativesCounter = 0;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 4 integers:");
		
		for (int i=0; i<=4; i++) {
			int num = scanner.nextInt();
			negativesCounter = countNegatives(num, negativesCounter);
		}
		
		System.out.println("Number of negatives: " + negativesCounter);
		
		scanner.close();
	}
	
	public static int countNegatives(int negativeNumber, int howManyNegatives) {
		
		if (negativeNumber < 0) { // when enter negative number counter++
			howManyNegatives++;
		}
		return howManyNegatives;
	}
}
/*
Please enter 4 integers:
4
-5
6
-3
5
Number of negatives: 2

*/