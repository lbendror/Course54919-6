package ProgramJava;

import java.util.Scanner;

public class Page15ex7_Input3Numbers_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create new scanner
		Scanner input = new Scanner(System.in);

		//Values of each digit
		int hundreds;
		int tens;
		int ones;

		//Prompt user to input 3 digit number           
		System.out.print("Enter a 3 digit number: ");
		int number = input.nextInt();

		//Displays hundreds place digit
		hundreds = number / 100;
		System.out.println("Hundreds place digit: " +hundreds);

		//Displays tens digit
		tens = (number %100) / 10;
		System.out.println("Tens place digit: " +tens);

		//Display ones digit
		ones = number %10;
		System.out.println("Ones place digit: " +ones);  

		//Error if number is less or more then three digits
		if (number > 999); 
		System.out.println("\nError! Number more then 3 digits.");
		if (number < 100);
		System.out.println("Error! Number less then 3 digits.");	

		input.close();
	}
}