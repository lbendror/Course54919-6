package ProgramJava;
import java.util.Scanner;
public class Page18ex03_ThreeNumTheBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a 3 numbers : ");
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float number3 = input.nextFloat();

		if (number3 > number2 && number2 > number1) {
			System.out.println(+number3+ " Is the the biggest.");
		}
		else if (number3 > number2 && number2 > number1 && number3 > number1) {
			System.out.println(+number3+ "Is the biggest.");
		}
		else if (number2 > number3 && number1 > number3) {
			System.out.println("Number " +number3+ " Is the lowest.");
		}
		//else if (number3 == number2 && number2 == number1) {
		//		System.out.println("All numbers are Equals: " +number3+","+number2+","+number1);
		//}
		else {
			System.out.println("All numbers are Equals: " +number3+","+number2+","+number1);
		}
			input.close();
		}
	}