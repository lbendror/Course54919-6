package ProgramJava;
import java.util.Scanner;
public class Page18ex04_InputFullNumOut1To9999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number between 1 to 9,999: ");
		int number = input.nextInt();
		
		if (number < 10) {
			System.out.println(number+ " consists of 1 digit");	
		}
		else {
			if (number < 100) {
				System.out.println(number+ " consists of 2 digits");
			}
			else {
				if (number < 1000) {
					System.out.println(number+ " consists of 3 digits");
				}
				else {
					System.out.println(number+ " consists of 4 digits");
				}
			}
		}
			input.close();
		}
	}