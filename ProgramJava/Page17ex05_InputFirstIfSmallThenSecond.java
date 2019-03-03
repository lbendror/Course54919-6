package ProgramJava;

import java.util.Scanner;

public class Page17ex05_InputFirstIfSmallThenSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Employee Name? ");
		String name = scanner.nextLine();

		System.out.println("Current Salary?");
		int salary = scanner.nextInt();

		if (salary * 1.1 > 6000) {
			salary = (int) (salary * 1.05); // show the salary in integer
		}
		else {
			salary = (int) (salary * 1.1);
		}
		System.out.println("Please update " +name+ "'s salary to " +salary);
		scanner.close();
	}
	
}