package ProgramJava;

import java.util.Scanner;

public class Page15ex5_Input4NumbersRightNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int num, digit; 

		System.out.println("Enter number between 1000 to 9999: ");
		num = scan.nextInt();

		if (num <=999) {
			System.out.println("The number you entered is below 1000");
		}
		else if (num >=1000) { 
			System.out.println("The number you entered is: " + num);
			digit = num % 10;
			System.out.println("The 4th number is: "+digit);
		}
		scan.close();
	}
}