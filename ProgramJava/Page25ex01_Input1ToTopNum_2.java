package ProgramJava;

import java.util.Scanner;

public class Page25ex01_Input1ToTopNum_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Top number? ");
		int top = scanner.nextInt();
		
		/*
		int number = 1;
		while (number <= top) {
			System.out.println(number);
			number++; // number = number + 1
		}
		*/
		
		for (int i=1; i<=top; i++) {
			System.out.println("\rThe number is= " +i);
		}
		
		scanner.close();
	}
}
