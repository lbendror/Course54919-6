package ProgramJava;

import java.util.Scanner;

public class Page20ex02_ThreeNumSmallToBig {
// Page20Targil 2
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Student grade from 0 to 100?");
		int grade = scanner.nextInt();
		
		if (grade >= 0 && grade < 55) {
			System.out.println("Insufficient");
		}
		else if (grade >= 55 && grade <= 64) {
			System.out.println("Sufficient");
		}
		else if (grade >= 65 && grade <= 74) {
			System.out.println("Almost Good");
		}
		else if (grade >= 75 && grade <= 84) {
			System.out.println("Good");
		}
		else if (grade >= 85 && grade <= 94) {
			System.out.println("Very Good");
		}
		else if (grade >= 95) {
			System.out.println("Excellent");
		}
		
		scanner.close();
	}
}
