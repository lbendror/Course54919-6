package ProgramJava;

import java.util.Scanner;

public class Page29ex05_InputRishoniNumberShowSumShalem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean foundPrimeNumber = false;
		
		int numberOfNonPrimes = 0;
		
		while (!foundPrimeNumber) {
			
			System.out.println("Enter next number:");
			int number = scanner.nextInt();
			
			int denominator = number - 1; // the divide number
			boolean foundDivider = false; 
			
			while (denominator > 1 && !foundDivider) {
				
				if (number % denominator == 0) {
					foundDivider = true;
				}
				
				denominator--;
			}
			
			if (!foundDivider) {
				foundPrimeNumber = true;
				System.out.println(number + " is prime! Read " + numberOfNonPrimes + " non-primes");
			}
			else {
				numberOfNonPrimes++;
			}
		}
		scanner.close();
	}
}
/*
Enter next number:
9
Enter next number:
6
Enter next number:
4
Enter next number:
1
1 is prime! Read 3 non-primes
*/