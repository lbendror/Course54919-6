package ProgramJava;

import java.util.Scanner;

public class Page15ex10_InputNumPutZugNumber {
// input>4.1 .... output>6
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number with a floating point: ");
		float number = input.nextFloat();

		int numberRoundedDown = (int) number;
		int nextInt = numberRoundedDown +1;

		if (nextInt %2 ==1) {
			nextInt++;
		}
		System.out.println("The next even integer is: " +nextInt);
		input.close();
	}

}
