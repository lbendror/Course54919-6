package ProgramJava;
import java.util.Scanner;
public class Page17ex01_FirstGrowingSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();

		if (number1 > number2) {
			System.out.println("is Growing from" +number2);
		}
		else {
			if (number1 == number2)
				System.out.println("is the same" +number1);
			else {
				System.out.println(+number1);
			}
		}
		input.close();
	}
}
