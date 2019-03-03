package ProgramJava;

import java.util.Random;

public class Page48ex04_OriginalArray20RandomValues {

	public static Random random = new Random();
	
	public static void main(String[] args) {

		int arrSize = 20;
		int low = 1;
		int high = 50;
		
		int[] arr = randomIntArr(arrSize, low, high);
		
		System.out.println("Original array (" + arrSize + " random values):");
		
		printArray(arr);
		
		int[] newArr = swapPositions(arr);
		
		System.out.println("\n\nArray after swap:");
		
		printArray(newArr);
	}
	
	public static int[] swapPositions(int[] arr) {
		
		int[] newArr = cloneArr(arr); // same can be done with: Arrays.copyOf(...)
		
		int halfArrSize = arr.length / 2;
		
		for (int i=0; i<halfArrSize; i++) {
			int temp = newArr[i];
			newArr[i] = newArr[i + halfArrSize];
			newArr[i + halfArrSize] = temp;
		}
		
		return newArr;
	}
	
	public static int[] cloneArr(int[] arr) {
		
		int[] newArr = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
	
	public static int[] randomIntArr(int arrSize, int low, int high) {
		
		int[] arr = new int[arrSize];
		
		for (int i=0; i<arrSize; i++) {
			arr[i] = random(low, high);
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static int random(int low, int high) {
		return random.nextInt(high - low + 1) + low;
	}
}
/*
Original array (20 random values):
37, 26, 19, 13, 32, 47, 9, 9, 24, 17, 27, 11, 4, 9, 48, 14, 24, 27, 35, 15, 

Array after swap:
27, 11, 4, 9, 48, 14, 24, 27, 35, 15, 37, 26, 19, 13, 32, 47, 9, 9, 24, 17, 
*/