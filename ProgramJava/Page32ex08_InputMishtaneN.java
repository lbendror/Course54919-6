package ProgramJava;

import java.util.Scanner;

public class Page32ex08_InputMishtaneN {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		
		int sum = 0;
		
		for (int i=0; i<=n; i++) {
			if (i % 4 == 0 || i % 7 == 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum of all numbers from 1 to " + n + " that are divisible by 4 or 7: " + sum);
		
		scanner.close();
	}
}
