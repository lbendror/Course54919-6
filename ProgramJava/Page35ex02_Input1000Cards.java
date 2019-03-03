package ProgramJava;

import java.util.Scanner;

public class Page35ex02_Input1000Cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int currentNum=0;
		int sum =0;
		boolean found = false;
		
		for (int i=1; i<=10; i++) { // i<=1000;
			currentNum = scanner.nextInt();
			if (currentNum == sum) {
				found = true;
				break;	
		}
			else {
				sum +=currentNum;
			}
		}
		if (found) {
			System.out.println("The number " + currentNum+ " is equal to the sum of all previous numbers");
		}
		else {
			System.out.println("Wasn't found");
		}
		
		scanner.close();
	}
}
