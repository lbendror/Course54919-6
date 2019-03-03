package ProgramJava;
import java.util.Scanner;
public class Page20ex02_ThreeNumSmallToBig_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int number = scanner.nextInt();

		if (number < 55) {
			System.out.println("less then 55");
		}
		else if (number >=55 && number <=64) {
			System.out.println("the grade is 55 to 64");
		}
		else if (number >=65 && number <=74) {
			System.out.println("the grade is 64 to 74");
		}
		else if (number >=75 && number <=84) {
			System.out.println("the grade is 75 to 84");
		}
		else if (number >=85 && number <=94) {
			System.out.println("the grade is 85 to 94");
		}
		else if (number >= 95){
			System.out.println("Exalante");
		}
		scanner.close();
	}

}
