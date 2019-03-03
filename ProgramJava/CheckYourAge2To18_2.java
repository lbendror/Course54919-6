package ProgramJava;
import java.util.Scanner;

public class CheckYourAge2To18_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		int age = scanner.nextInt();
		
		if (age == 1) {
			System.out.println("You are 1 year old!");
		}
		else if (age <=2) {
			System.out.println("You are a baby");
		}
		else if (age >=2 && age <10) {
			System.out.println("You are a Child");
		}
		else if (age >=10 && age <18) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are OLD!!!");
		}
		scanner.close();
	}

}
