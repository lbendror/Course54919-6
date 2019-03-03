package ProgramJava;

import java.util.Scanner;

public class Page25ex01_Input1ToTopNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Top Number: ");
		
		int top = scanner.nextInt();
		int number =1;
		
		while (number <= top) {
			System.out.println(number);
			number++; // number = number+1
		}
		scanner.close();
	}

}

/*
 	System.out.println("Enter Top Number: ");
 	int top = scanner.nextInt();
 	
 	for (int i=1; i<=top; i++) {
 		System.out.println(i);
 	}
 */