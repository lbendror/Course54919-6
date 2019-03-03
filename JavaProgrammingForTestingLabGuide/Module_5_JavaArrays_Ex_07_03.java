package JavaProgrammingForTestingLabGuide;

public class Module_5_JavaArrays_Ex_07_03 {

	public static void main(String[] args) {
		
		int[] numArr = new int[] {1,2,5,1,6,1,5,4,8};
		
		boolean[] existingNumbersArr = new boolean[11];

		for (int num : numArr) {
			existingNumbersArr[num] = true;
		}
		
		int differentNumbersCounter = 0;
		
		for (int i=0; i<existingNumbersArr.length; i++) {
			if (existingNumbersArr[i] == true) {
				differentNumbersCounter++;
			}
		}
		
		int[] uniqueNumArr = new int[differentNumbersCounter];
		
		int nextIndex = 0;
		
		for (int i=0; i<existingNumbersArr.length; i++) {
			
			if (existingNumbersArr[i] == true) {
				uniqueNumArr[nextIndex] = i;
				nextIndex++;
			}
		}
		
		System.out.println("Original numbers array:");
		
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + ", ");
		}
		
		System.out.println("\n\nUnique numbers:");
		
		for (int i=0; i<uniqueNumArr.length; i++) {
			System.out.print(uniqueNumArr[i] + ", ");
		}
	}
}
/*
Original numbers array:
1, 2, 5, 1, 6, 1, 5, 4, 8, 

Unique numbers:
1, 2, 4, 5, 6, 8, 
*/