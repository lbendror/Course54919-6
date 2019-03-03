package ProgramJava;

import java.util.Scanner;

public class Page37ex05_Input_N_AndPrintFrom1To_Nminus_minus {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			
			for (int j=1; j<=n-i; j++) {
				
				System.out.print(j + " ");
			}
			
			System.out.println("");
		}
		
		scanner.close();
	}
}
/*
Enter a number: 4
1 2 3 4 
1 2 3 
1 2 
1 
*/