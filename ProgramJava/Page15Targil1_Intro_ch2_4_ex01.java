package ProgramJava;

import java.util.Scanner;

public class Page15Targil1_Intro_ch2_4_ex01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First number?");
		int a = scanner.nextInt();
		
		System.out.println("Second number?");
		int b = scanner.nextInt();
		
		System.out.println("Third number?");
		int c = scanner.nextInt();
		
		int sum = a + b + c;
		int average = sum / 3;
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		
		scanner.close();
	}
}
