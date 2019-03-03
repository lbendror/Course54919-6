package ProgramJava;

import java.util.Scanner;

public class Page37ex04_Input_N_AndPrintFrom1To_N {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			for (int j=i; j<=n; j++) {
				
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
2 3 4 
3 4 
4 
*/