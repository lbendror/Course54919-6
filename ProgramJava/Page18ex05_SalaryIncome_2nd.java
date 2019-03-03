package ProgramJava;
import java.util.Scanner;
public class Page18ex05_SalaryIncome_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter taxable income
        System.out.print("Enter the amount of taxable income for the year 2019: ");
        double income = input.nextDouble();

        /*Income tax brackets for single-filers
        up to $23000          10% 
        $23000 - $46000       20% 
        $36901 - $89350       30% 
        $89351 - $186350      40% 
        $186351 - $405100     50% */
        
        // Compute tax
        double tax = 0;

        if (income <= 23000)
            tax = income * 0.10;
        else if (income <= 23000)
            tax = 23000 * 0.10 + (income - 46000) * 0.20;
        else if (income <= 46000)
            tax = 23000 * 0.10 + (23000 - 46000) * 0.20 + (income - 74000) * 0.30;
        else if (income <= 74000)
            tax = 23000 * 0.10 + (23000 - 46000) * 0.20 + (46000 - 74000) * 0.30 + (income - 100000) + 0.40;
        else if (income <= 100000)
            tax = 23000 * 0.10 + (23000 - 46000) * 0.20 + (46000 - 74000) * 0.30 + (74000 - 100000) + 0.30 + (income - 900000) + 0.50;

        if (income <=  23000)
            System.out.println("You have entered the 10% bracket. " +tax);
        else if (income <= 23000)
            System.out.println("You have entered the 15% bracket. " +tax);
        else if (income <= 46000)
            System.out.println("You have entered the 25% bracket. " +tax);
        else if (income <= 74000)
            System.out.println("You have entered the 28% bracket. " +tax);
        else if (income <= 100000)
            System.out.println("You have entered the 33% bracket. " +tax);
		
			input.close();
		}
	}