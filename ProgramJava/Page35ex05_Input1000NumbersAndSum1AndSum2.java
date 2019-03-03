package ProgramJava;

import java.util.Scanner;

public class Page35ex05_Input1000NumbersAndSum1AndSum2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 10 numbers");

		int number = 0;
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i=1; i<=10; i++) {

			number = scanner.nextInt();
			
			if (number < 1000) {
				sum1 += number;
				continue;
			}
			
			if (number < 2000) {
				sum2 += number;
			}
			else {
				sum3 += number;
			}
		}

		
		System.out.println("SUM1 = " + sum1);
		System.out.println("SUM2 = " + sum2);
		System.out.println("SUM3 = " + sum3);
		
		scanner.close();
	}
}
