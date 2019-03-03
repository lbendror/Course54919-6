package ProgramJava;

import java.util.Scanner;

public class FunctionExampleLeapYear {

	public static void main(String[] args) {

		//Scanner input = new Scanner(System.in);
		
		for (int year =1990; year <=2018; year++) {
			boolean leapYear = isLeapYear(year);
			if (leapYear) {
				System.out.println(year+ " is a leap year");
			}
			else {
				System.out.println(year+ " is NOT a leap year");
			}
		}
		//input.close();		
		}
	
	public static boolean isLeapYear (int year) {  // The function name isLeapYear check Leap Year 
		if (year % 4 !=0 || year % 100 ==0 && year % 400 !=0) {
			return true;
		}
		else {
			return false;
		}
	}
	}
