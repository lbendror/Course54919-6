package ProgramJava;

import java.util.Scanner;

public class Page15ex9_Input61Out16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
/*
 בתור הקלט שלם בין 10 לבין 99
 הפוך את סדר הספרות והצג את המספר החדש.
 לדוגמא: קלט – 61 , פלט – 16
 */		
		int num; //קלט שלם בין 10 ל- 99
		int d1; // מספר אחדות
		int d10; // מספר עשרות 
		int newNum; // המספר החדש
		
		System.out.println("Enter number between 10 to 99: ");
		num = input.nextInt();
		d1 = num % 10; // בודד את האחדות
		System.out.println("d1=בודד את האחדות"+d1);
		d10 = num /10; // בודד את העשרות
		System.out.println("d10=בודד את העשרות"+d10);
		newNum = 10 * d1 + d10; // בנה את המספר החדש 
		System.out.println(" בנה את המספר החדש" + newNum);
		
		input.close();
	}

}
