package ProgramJava;

import java.util.Scanner;

public class Page43ex04_SalaryToPay_2 {

	static int numberOfPoints = 0;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your Basic salary: ");
		int Salary = scanner.nextInt();
		
		float newSalary = Salary;
		
		System.out.println("Years of work: ");
		int WorkYears = scanner.nextInt();

		System.out.println("How many childrens you have: ");
		int numOfChildren = scanner.nextInt();

		System.out.println("How many Hours do you work: ");
		int workHours = scanner.nextInt();

		newSalary += Experience(Salary, WorkYears);
		newSalary += ManyChildren(numOfChildren);
		newSalary += WorkHours(workHours);

		System.out.println("Total Salary of payment: " + newSalary);

		scanner.close();
	}

	public static float Experience(int Salary, int WorkYears) {

		float answerPublic = 0;

		if (WorkYears > 10) {
			answerPublic = Salary * 0.1f;
		}

		return answerPublic;
	}

	public static int ManyChildren(int numOfChildren) {

		int answerPublic = 0;

		if (numOfChildren >= 4) {

			for (int i=4; i<=numOfChildren; i++) {

				if (i >= 4 && i <= 6) {
					answerPublic += 400;
				}
				else if (i >= 7) {
					answerPublic += 700;
				}
			}
		}

		return answerPublic;
	}

	public static float WorkHours(int workHours) {

		float answerPublic = 0;

		if (workHours > 160) {

			for (int i=161; i<=workHours; i++) {

				if (i <= (160+16)) { // 176 Hours per month
					answerPublic += 80;
				}
				else {
					answerPublic += 120; // more then >=177 Hours per month
				}
			}
		}

		return (float) answerPublic;
	}
}
