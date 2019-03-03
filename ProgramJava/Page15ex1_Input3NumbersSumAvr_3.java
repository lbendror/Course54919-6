package ProgramJava;

import java.util.Scanner;

public class Page15ex1_Input3NumbersSumAvr_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Please enter 1st Number:");
	int Num1 = scanner.nextInt();
	
	System.out.println("Please enter 2nd Number:");
	int Num2 = scanner.nextInt();
	
	System.out.println("Please enter 3rd Number:");
	int Num3 = scanner.nextInt();
	
	int Sum = Num1 + Num2 + Num3;
		System.out.println("The Sum is:" + Sum);
	int Average = Sum /3;
	 	System.out.println("The average is:" + Average);

	 	scanner.close();
	}
}
