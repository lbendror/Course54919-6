package ProgramJava;

import java.util.Scanner;

public class Page15ex3_InputPotCapacity_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pot diameter?");
		
		int diameter = scanner.nextInt();
		
		System.out.println("Pot depth?");
		
		int height = scanner.nextInt();
		
		float radius = (float) diameter / 2;
		
		float baseArea = 3.14f * radius * radius; 
		
		float volume = baseArea * height;
		
		System.out.println("The pot volume is: " + volume);
		
		scanner.close();
	}
}
