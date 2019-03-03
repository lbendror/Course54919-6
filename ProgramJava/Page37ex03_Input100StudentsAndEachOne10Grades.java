package ProgramJava;

import java.util.Scanner;

public class Page37ex03_Input100StudentsAndEachOne10Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numOfStudent = 100;
		int numOfGradesPerStudent = 10;
		int allStudentSum = 0;
		
		for (int i=1; i<=numOfStudent; i++) { //loop over students
			
			int currentStudentSum = 0;
			
			for (int j=1; j<=numOfGradesPerStudent; j++) { // loop over grades
				System.out.println("Student " +i+ " - grade" +j+ "?");
				int grade = scanner.nextInt();
				currentStudentSum += grade;
				allStudentSum += grade;
			}
			System.out.println("Student No. " +i+ " average: " +(currentStudentSum / numOfGradesPerStudent));
		}
		System.out.println("All students average: " +(allStudentSum / (numOfStudent * numOfGradesPerStudent)));
		
		scanner.close();
	}
}
