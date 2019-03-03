package ProgramJava;

import java.util.Scanner;

public class Page32ex06_InputNumber2Hezka0 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Top power?");
		int topPower = scanner.nextInt();
		
		int sum = 0;
		
		for (int i=0; i<=topPower; i++) {
			sum += Math.pow(2, i);
		}
		
		System.out.println("Sum of all powers of 2 until 2^" + topPower + " is: " + sum);
		
		scanner.close();
	}
}
/*
Top power?
7
Sum of all powers of 2 until 2^7 is: 255
*/