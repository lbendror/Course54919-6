package ProgramJava;

import java.util.Scanner;

public class Page15ex8_Input2NumAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create new scanner
		Scanner input = new Scanner(System.in);

		//Values of each digit
		//int hundreds = 0;
		int tens = 0;
		int ones = 0;

		//Prompt user to input 3 digit number           
		System.out.print("Enter a 2 digits numbers: ");
		int number = input.nextInt();

		if (number <= 0 && number >= 99)   // Checking condition for three digit number
		{
			//Displays hundreds place digit
			//hundreds = number / 100;
			//System.out.printf("Hundreds place digit: " + hundreds);

			//Displays tens digit
			tens = (number /10);  // compare with your code
			System.out.printf("\nTens place digit: " + tens);

			//Display ones digit
			ones = (number - (tens*10));   // compare with your code
			System.out.printf("\nOnes place digit: " + ones);   
		}
		//Error if number is less or more then three digits
		else                                                                    
		{      
			if (number >=100)
				System.out.println("\nError! Number above 100.");
			if (number <= 0)
				System.out.println("Error! Number is zero.");
		}
		input.close();
	}
}