package ProgramJava;

import java.util.Scanner;

public class Page20ex04_LeapYear {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.println("Please Enter Year: ");
		year = input.nextInt();
		
		if (year % 4 !=0 || year % 100 ==0 && year % 400 !=0)
			System.out.println("It's not a leap year");
		else
			System.out.println("It's a leap year");
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
		
		input.close();		
		}
	}
