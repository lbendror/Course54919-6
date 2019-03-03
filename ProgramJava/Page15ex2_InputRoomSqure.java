package ProgramJava;

import java.util.Scanner;

public class Page15ex2_InputRoomSqure {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Room width?");
		int roomWidth = scanner.nextInt();
		
		System.out.println("Room length?");
		int roomLength = scanner.nextInt();

		int roomArea = roomWidth * roomLength;
		int roomPerimeter = (roomWidth * 2) + (roomLength * 2);
		
		System.out.println("Room area = " + roomArea);
		System.out.println("Room perimiter = " + roomPerimeter);
		
		scanner.close();
	}
}
