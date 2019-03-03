package ProgramJava;

import java.util.Scanner;

public class Page17ex06_InputSalary10PercentOf6000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("First Number?");
		int First = scanner.nextInt();

		System.out.println("Second Number?");
		int Second = scanner.nextInt();

		if (First > Second) {
		System.out.println("The bigger Number is: " +First+ " And the smallest is: " +Second+ "." );
		}
		else if (Second > First) {
		System.out.println("The bigger Number is: " +Second+ " And the smallest is: " +First+ ".");
		}
		else { // First == Second && Second > First 
		System.out.println("Both numbers are Equal " +First+ "==" +Second+ ".");
		}
		scanner.close();
	}
}
