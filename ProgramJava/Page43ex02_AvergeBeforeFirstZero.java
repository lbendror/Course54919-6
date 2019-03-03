package ProgramJava;

import java.util.Scanner;

public class Page43ex02_AvergeBeforeFirstZero {

	static int numberOfPoints = 0;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 4 numbers");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		float avg = calculateAverage(a, b, c, d);
		
		System.out.println("Averge before first zero: " + avg);
		
		scanner.close();
	}
	
	public static float calculateAverage(int a, int b, int c, int d) {
		
		int counter = 0;
		int sum = 0;
		
		if (a != 0) {
			counter++;
			sum += a;
			
			if (b != 0) {
				counter++;
				sum += b;
				
				if (c != 0) {
					counter++;
					sum += c;
					
					if (d != 0) {
						counter++;
						sum += d;
					}
				}
			}
		}
		
		float avg = (float) sum / counter;
		return avg;
	}
}
