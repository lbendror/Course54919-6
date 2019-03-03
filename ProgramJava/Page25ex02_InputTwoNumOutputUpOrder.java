package ProgramJava;

import java.util.Scanner;

public class Page25ex02_InputTwoNumOutputUpOrder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bottom number?");
		int bottom = scanner.nextInt();
		
		System.out.println("Top number?");
		int top = scanner.nextInt();
		
		if (top < bottom) {
			int temp = bottom;
			bottom = top;
			top = temp;
		}
		
		int number = bottom;
		
		while (number <= top) {
			System.out.println(number);
			number++;
		}
		
		scanner.close();
	}
}
