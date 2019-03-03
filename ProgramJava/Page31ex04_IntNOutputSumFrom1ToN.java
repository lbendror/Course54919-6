package ProgramJava;

import java.util.Scanner;

public class Page31ex04_IntNOutputSumFrom1ToN {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int n = scanner.nextInt();
		
		int sumOfMultiplesOfThree = 0;
		
		for (int i=1; i<=n; i++) {
			
			if (i % 3 == 0) {
				sumOfMultiplesOfThree += i;
			}
		}
		
		System.out.println("Sum of multiples of 3, of all numbers under " + n + ": " + sumOfMultiplesOfThree);
		
		scanner.close();
	}
}
/*
Enter an integer:
7
Sum of multiples of 3, of all numbers under 7: 9

*/