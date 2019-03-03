package ProgramJava;
import java.util.Scanner;
public class Page18ex02_FirstIncreasingSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a 3 numbers : ");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float number3 = input.nextFloat();

		if (number2 > number1 && number3 > number2) {
			System.out.println(+number2+ " Is Increasing from " +number1+ " And " +number3+ " Is Increasing from " +number1);
		}
		else {
			if (number1 == number2)
				System.out.println(+number1+" Equal to " +number2);
			if (number3 > number1) {
				System.out.println("The 3rd number " +number3+ "is Increasing Then " +number1);
			}
		}
		input.close();
	}
}