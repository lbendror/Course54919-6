package ProgramJava;

import java.util.Scanner;

public class Page25ex09_Input100NumbersOutBigToSmall {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int counter = 1;
		System.out.println("Next int?");
		int currentNumber = scanner.nextInt();
		
		int max = currentNumber;
		int maxIndex = counter;
		
		while (counter < 10) {
			
			counter++;
			
			System.out.println("Next int?");
			currentNumber = scanner.nextInt();
			
			if (currentNumber > max) {
				max = currentNumber;
				maxIndex = counter;
			}
		}
		
		System.out.println("The maximum value was: " + max + ", at index: " + maxIndex);
		
		scanner.close();
	}
}
