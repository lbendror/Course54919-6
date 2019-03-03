package ProgramJava;

import java.util.Scanner;

public class Page37ex02_N_AtezertPelet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=10; i++) {
			System.out.println("Next Num? ");
			int num = scanner.nextInt();
			int factorial = 1;
			
			for (int j=1; j<=num; j++) {
				factorial = factorial * j;
			}
			System.out.println(num+ "! = " + factorial);
		}
		
		scanner.close();
	}
}
