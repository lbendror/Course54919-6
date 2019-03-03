package ProgramJava;

import java.util.Scanner;

public class Page17ex01_FirstGrowingSecond_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First number?");
		int a = scanner.nextInt();
		
		System.out.println("Second number?");
		int b = scanner.nextInt();
		
		if (a < b) {
			System.out.println("Growing...");
		}
		
		scanner.close();
	}
}
