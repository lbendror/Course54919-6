package ProgramJava;

import java.util.Scanner;

public class Page31ex03_InputNumberAteret {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number Atzeret: ");
		int n = scanner.nextInt();
		int factorial =1;
		
		for (int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		System.out.println(n + " != " + factorial);
			scanner.close();
		}
	}