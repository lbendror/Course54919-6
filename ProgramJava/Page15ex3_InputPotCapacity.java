package ProgramJava;
import java.util.Scanner;

public class Page15ex3_InputPotCapacity {

	public static void main(String[] args) {
		// This program calculates pot's capacity
		final double pi = 3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter Pot's diameter");
		int potRadius = scanner.nextInt()/2;
		System.out.println("Please, enter Pot's depth");
		int potDepth = scanner.nextInt();
		double potCapacity = pi * potRadius * potRadius * potDepth; // V=pi*R^2*H
		System.out.println("Pot's capacity is: " + potCapacity);

		scanner.close();

	}

}
