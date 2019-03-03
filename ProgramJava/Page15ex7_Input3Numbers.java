package ProgramJava;

import java.util.Scanner;

public class Page15ex7_Input3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create new scanner
		Scanner input = new Scanner(System.in);

		//Values of each digit
		int hundreds = 0;
		int tens = 0;
		int ones = 0;

		//Prompt user to input 3 digit number           
		System.out.print("Enter a 3 digit number: ");
		int number = input.nextInt();

		if (number <= 999 && number > 99)   // Checking condition for three digit number
		{
			//Displays hundreds place digit
			hundreds = number / 100;
			System.out.printf("Hundreds place digit: " + hundreds);

			//Displays tens digit
			tens = (number - (hundreds*100)) / 10;  // compare with your code
			System.out.printf("\nTens place digit: " + tens);

			//Display ones digit
			ones = (number - (tens*10) - (hundreds*100));   // compare with your code
			System.out.printf("\nOnes place digit: " + ones);   
		}
		//Error if number is less or more then three digits
		else                                                                    
		{      
			if (number > 999)
				System.out.println("\nError! Number more then 3 digits.");
			if (number < 100)
				System.out.println("Error! Number less then 3 digits.");
		}
		input.close();
	}
}