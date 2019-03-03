package ProgramJava;

import java.util.Scanner;

public class Page15ex8_Input2NumAndSum_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("First number?");
		int a = input.nextInt();
		
		System.out.println("Second number?");
		int b = input.nextInt();
		
		//System.out.println("Third number?");
		//int c = input.nextInt();
		
		int sum = a + b ;
		//int average = sum / 3;
		
		System.out.println("Sum = " + sum);
		//System.out.println("Average = " + average);
		
		input.close();
	}
}
