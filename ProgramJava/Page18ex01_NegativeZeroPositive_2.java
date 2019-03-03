package ProgramJava;
import java.util.Scanner;
public class Page18ex01_NegativeZeroPositive_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		float val = scanner.nextFloat();
		if (val <0) {
			System.out.println("Negative");
		}
		else if (val >0) {
			System.out.println("Positive");	
		}
		else if (val ==0) {
			System.out.println("Zero");
		}
		scanner.close();
	}
}
