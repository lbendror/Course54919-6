package ProgramJava;

import java.util.Scanner;

public class Page25ex02_InputTwoNumOutputUpOrder_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Bottom number: ");
		int bottom = scanner.nextInt();
		
		System.out.println("Enter Top number: ");
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
