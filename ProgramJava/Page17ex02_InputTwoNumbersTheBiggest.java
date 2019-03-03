package ProgramJava;

import java.util.Scanner;

public class Page17ex02_InputTwoNumbersTheBiggest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First number?");
		int a = scanner.nextInt();
		
		System.out.println("Second number?");
		int b = scanner.nextInt();
		
		if (a > b) {
			System.out.println("The bigger number is: " + a);
		}
		else if (b > a) {
			System.out.println("The bigger number is: " + b);
		}
		else { // a == b
			System.out.println("Both numbers are equal");
		}
		
		scanner.close();
	}
}
