package ProgramJava;

import java.util.Random;

public class Page48ex02_Array50NumbersAndPrintLargeAVRNumbers_2 {

	public static Random random = new Random();
	
	public static void main(String[] args) {

		int arrSize = 20;
		int lowVal = 0;
		int highVal = 100;
		
		int evensCounter = 0;
		int sumOfEvens = 0;
		
		int[] arr = new int[arrSize];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = random(lowVal, highVal);
		}
		
		System.out.println(arrSize + " random values:");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("\n\nEven numbers:");
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] % 2 == 0) {
				evensCounter++;
				sumOfEvens += arr[i];
				System.out.print(arr[i] + ", ");
			}
		}

		int averageOfEvens = sumOfEvens / evensCounter;
		
		System.out.println("\n\nAverage of evens: " + averageOfEvens);
		
	}
	
	public static int random(int low, int high) {
		return random.nextInt(high - low + 1) + low;
	}
}
