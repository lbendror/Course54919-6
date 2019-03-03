package ProgramJava;

import java.util.Scanner;

public class Page31ex02_EnterBottomIntShowTopInt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter bottom integer:");
		int bottom = scanner.nextInt();
		
		System.out.println("Enter top integer:");
		int top = scanner.nextInt();
		
		System.out.println("-----");
		
		for (int i=bottom; i<=top; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
