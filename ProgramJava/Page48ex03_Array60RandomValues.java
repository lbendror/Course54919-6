package ProgramJava;

import java.util.Random;

public class Page48ex03_Array60RandomValues {
// 
	public static Random random = new Random();
	
	public static void main(String[] args) {

		int arrSize = 60;
		int low = 0;
		int high = 10000;
		
		int[] arr = randomIntArr(arrSize, low, high);
		
		System.out.println(arrSize + " random values:");
		
		printArray(arr);
		
		boolean foundVal = false;
		int specialValIndex = -1;
		
		for (int i=0; i<arr.length; i++) {
			
			int currentValue = arr[i];
			int sumOfOthers = 0;
			
			for (int j=0; j<arr.length; j++) {
				if (j != i) {
					sumOfOthers += arr[j];
				}
			}
			
			if (currentValue == sumOfOthers) {
				specialValIndex = i;
				foundVal = true;
				break;
			}
		}
		
		if (foundVal) {
			System.out.println("The value " + arr[specialValIndex] + " at index " + specialValIndex + " equals the sum of all other array items");
		}
		else {
			System.out.println("\n\nDidn't find a value which equals the sum of all other array items");
		}
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
60 random values:
5959, 9079, 7265, 6290, 5597, 5044, 8563, 2074, 9472, 845, 5095, 4463, 3994, 6613, 2681, 7578, 6758, 7551, 638, 8342, 2037, 2650, 8906, 4123, 4404, 5286, 4033, 562, 2223, 185, 2087, 4602, 3832, 2412, 6867, 9572, 9041, 3957, 556, 3221, 4673, 3022, 4482, 9743, 3134, 5842, 6701, 8207, 5114, 4359, 8522, 7628, 1902, 4482, 9602, 966, 8815, 5273, 9632, 7051, 

Didn't find a value which equals the sum of all other array items

*/