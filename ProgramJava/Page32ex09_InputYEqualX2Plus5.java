package ProgramJava;

import java.util.Scanner;

public class Page32ex09_InputYEqualX2Plus5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Initial value of X?");
		int initialX = scanner.nextInt();
		
		System.out.println("Final value of X?");
		int finalX = scanner.nextInt();
		
		System.out.println("Step size?");
		int step = scanner.nextInt();
		
		System.out.println("Calculating according to equation: Y = X^2 + 5");
		
		for (int x=initialX; x<=finalX; x+=step) { // Not Hard Coded
			
			int y = x * x + 5;
			System.out.println("X = " + x + " --> Y = " + y);
		}
		
		scanner.close();
	}
}
