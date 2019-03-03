package ProgramJava;
import java.util.Scanner;

public class Page15ex1_Input3NumbersSumAvr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter three numbers");
		int numberOne = scanner.nextInt();
		int numberTwo = scanner.nextInt();
		int numberThree = scanner.nextInt();
		double average = (numberOne + numberTwo + numberThree) / 3;
		System.out.println("Three numbers Average is " + average);
		scanner.close();
	}
}
