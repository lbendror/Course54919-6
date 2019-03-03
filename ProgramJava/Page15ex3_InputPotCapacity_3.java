package ProgramJava;
import java.util.Scanner;

public class Page15ex3_InputPotCapacity_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pot diameter? ");
		
		int diameter = scanner.nextInt();
		
		System.out.println("Pot depth? ");
		
		int height = scanner.nextInt();
		
		float radius = (float) diameter /2;
		
		float BaseArea = 3.14f * radius * radius;
		
		float volume = BaseArea * height;
		
		System.out.println("The Pot Volume is: " + volume);
		
		scanner.close();
		}
		
	}
