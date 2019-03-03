package ProgramJava;

import java.util.Scanner;

public class Page38ex08_InputLinesAndColumnAndPrintAsStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter Lines: ");
		int lines = scanner.nextInt();
		
		System.out.println("Please enter Columns: ");
		int columns = scanner.nextInt();
		
		for (int i=0; i<lines; i++) {
			//System.out.println(+i+"*");
			
			for (int j=0; j<columns; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scanner.close();
	}
}
/*
Please enter Lines: 
10
Please enter Columns: 
7
*******
*******
*******
*******
*******
*******
*******
*******
*******
*******

*/