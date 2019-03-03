package ProgramJava;
import java.util.Scanner;
public class Page17ex04_IfFirstNumDevideSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int a = input.nextInt();
		
		System.out.print("Input the second number: ");
		int b = input.nextInt();
		
		if (a % b ==0) {
			System.out.println(a+ "is divisible by" +b);
		}
		else {
			System.out.println(a+ "is not divisible by" +b);
		}
		if (b % a ==0) {
			System.out.println(b+ "is divisible by" +a);
		}
		else {
			System.out.println(b+ "is not divisible by" +a);
		}
		
		int d = (a/b);
		System.out.println("The division of a and b is:" +d);
		
		input.close();
	}
}