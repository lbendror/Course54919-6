package ProgramJava;
import java.util.Scanner;

public class Page15ex2_InputRoomSqure_2 {

	public static void main(String[] args) {
		// This program calculates room's square
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter room's length");
		int roomLength = scanner.nextInt();
		
		System.out.println("Please, enter room's width");
		
		int roomWidth = scanner.nextInt();
		int roomSquare = roomLength * roomWidth;
		
		System.out.println("Room's Square is: " + roomSquare);


		scanner.close();
	}

}
