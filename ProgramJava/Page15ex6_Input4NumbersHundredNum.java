package ProgramJava;

import java.util.Scanner;

public class Page15ex6_Input4NumbersHundredNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int num, d1; 

		System.out.println("Enter number between 1000 to 9999: ");
		num = input.nextInt();

		if (num <=999) {
			System.out.println("The number you entered is below 1000");
		}
		else if (num >=1000) { 
			System.out.println("The number you entered is: " + num);
			d1 = num % 100;
			int ones = d1 %10;
			int hundred = d1/10;
			//int hundred = (d1/10) % 10;
			System.out.println("The Ones digit :" +ones);
			System.out.println("The hundred digit :"+hundred);
			
			input.close();
		}
	}
}
