package ProgramJava;

import java.util.Random;

public class Page48ex01_Array50NumbersAndPrintLargeAVRNumbers {

	public static Random random = new Random();
	
	public static void main(String[] args) {

		int arrSize = 20;
		int lowVal = 0;
		int highVal = 100;
		
		int sum = 0;
		
		int[] arr = new int[arrSize];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = random(lowVal, highVal);
		}
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(arrSize + " random values:");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		int average = sum / arr.length;
		
		System.out.println("\n\nArray average: " + average);
		
		System.out.println("\nValues greater than average:");
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > average) {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	public static int random(int low, int high) {
		return random.nextInt(high - low + 1) + low;
	}
}
