package ProgramJava;

import java.util.Scanner;

public class Page35ex03_Input365Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 10 numbers (legal values are between -5 to 40");
		
		int currentNum = 0;
		boolean validInput = true;
		
		for (int i=0; i<10; i++) {
			currentNum = scanner.nextInt();
			
			if (currentNum <-5 || currentNum > 40) {
				validInput = false;
				break;
			}
		}
		
		if (validInput) {
			System.out.println("Valid input!");
		}
		else {
			System.out.println("InValid input!");
		}
		scanner.close();
	}
}
/*
Please enter 10 numbers (legal values are between -5 to 40
 -4
-3
-2
0
2
4
6
8
9
11
Valid input!
*/