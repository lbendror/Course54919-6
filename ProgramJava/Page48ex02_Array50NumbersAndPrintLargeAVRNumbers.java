package ProgramJava;

import java.util.Random;

public class Page48ex02_Array50NumbersAndPrintLargeAVRNumbers {

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
		
		if (average %2 ==0) {
			System.out.println("\n\nArray average: " + average);	
		}
		
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
/*
20 random values:
51, 17, 20, 49, 18, 25, 70, 39, 100, 1, 92, 53, 86, 27, 60, 83, 18, 32, 9, 74, 

Array average: 46

Values greater than average:
51, 49, 70, 100, 92, 53, 86, 60, 83, 74, 
*/