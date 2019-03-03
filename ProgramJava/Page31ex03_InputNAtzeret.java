package ProgramJava;

import java.util.Scanner;

public class Page31ex03_InputNAtzeret {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int n = scanner.nextInt();
		
		int factorial = 1;
		
		for (int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println(n + "! = " + factorial);
		
		scanner.close();
	}
}
