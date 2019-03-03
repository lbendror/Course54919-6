package ProgramJava;

import java.util.Scanner;

public class Page25ex03_InputnNumberZeroToN {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int n = scanner.nextInt();
		
		int number = 0;
		
		while (number <= n) {
			
			if (number % 2 == 0) {
				System.out.println(number);
			}
			
			number++;
		}
		
		scanner.close();
	}
}
