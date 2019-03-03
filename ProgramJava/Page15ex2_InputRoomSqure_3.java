package ProgramJava;

import java.util.Scanner;

public class Page15ex2_InputRoomSqure_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// היקף של מלבן הוא כפולה בשתיים של סכום שתי צלעות סמוכות.
		int width, height, area, scope; // היקף, שטח, גובה, רוחב
		
		System.out.println("Please enter Width: ");
		width = scan.nextInt();
		System.out.println("Please enter Height: ");
		height = scan.nextInt();
		
		area = width * height; // שטח = רוחב * אורך
		System.out.println("The area width * height is: " + area);
		
		scope = 2 * (width + height); // היקף = (רוחב + אורך) * 2
		System.out.println("The scope 2 * (width + height) is: " + scope);
		
		scan.close();
	}

}
