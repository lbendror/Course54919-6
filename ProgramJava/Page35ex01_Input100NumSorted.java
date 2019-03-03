package ProgramJava;

import java.util.Scanner;

public class Page35ex01_Input100NumSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a sequence: ");
		
		int prevNum = scanner.nextInt();
		int currentNum = 0;
		
		boolean sorted = true;
		
		for (int i=0; i<9; i++) {
			
			currentNum = scanner.nextInt();
			
			if (currentNum < prevNum) {
				sorted = false;
				break;
			}
			else {
				prevNum = currentNum;
			}
		}
		
		scanner.close();
		if (sorted) {
			System.out.println("Sorted!");
		}
		else {
			System.out.println("Not Sorted!");
		}
	}
}
