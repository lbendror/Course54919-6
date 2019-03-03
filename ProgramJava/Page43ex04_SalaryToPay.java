package ProgramJava;

import java.util.Scanner;

public class Page43ex04_SalaryToPay {

	//static int numberOfPoints = 0;
	
	public static float factorExperience(int baseSalary, int yearsOfWork) {
		
		float addition = 0;
		
		if (yearsOfWork > 10) {
			addition = baseSalary * 0.1f;
		}

		return addition;
	}
	
	public static int factorChildren(int numOfChildren) {
		
		int addition = 0;
		
		if (numOfChildren >= 4) {
			
			for (int i=4; i<=numOfChildren; i++) {
				
				if (i >= 4 && i <= 6) {
					addition += 400;
				}
				else if (i >= 7) {
					addition += 700;
				}
			}
		}
		
		return addition;
	}
	
	public static int factorWorkHours(int workHours) {
		
		int addition = 0;
		
		if (workHours > 160) {
			
			for (int i=161; i<=workHours; i++) {
				
				if (i <= (160+16)) { // 176 Hours per month
					addition += 80;
				}
				else {
					addition += 120; // more then 177 Hours per month
				}
			}
		}
		
		return addition;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Base salary? ");
		int baseSalary = scanner.nextInt();
		
		System.out.println("Years of work? ");
		int yearsOfWork = scanner.nextInt();
		
		System.out.println("Number of childrens? ");
		int numOfChildren = scanner.nextInt();
		
		System.out.println("Work hours? ");
		int workHours = scanner.nextInt();
		
		float newSalary = baseSalary;
		
		newSalary += factorExperience(baseSalary, yearsOfWork);
		newSalary += factorChildren(numOfChildren);
		newSalary += factorWorkHours(workHours);
		
		System.out.println("Salary to pay: " + newSalary);
		
		scanner.close();
	}
}
