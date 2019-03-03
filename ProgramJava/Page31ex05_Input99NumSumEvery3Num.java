package ProgramJava;

import java.util.Scanner;

public class Page31ex05_Input99NumSumEvery3Num {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i=1; i<=99; i++) {
			
			System.out.println("Next int:");
			int n = i; //scanner.nextInt();
			
			if (i % 3 == 0) {
				sum += n;
			}
		}
		
		System.out.println("Sum of every third number: " + sum);
		
		scanner.close();
	}
}
/*
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Next int:
Sum of every third number: 1683

*/