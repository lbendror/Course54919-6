package JavaProgrammingForTestingLabGuide;

public class Module_5_JavaArrays_Ex_07_04 {

	public static void main(String[] args) {
		
		int[] numArr = new int[] {1,2,5,1,6,1,5,4,8};
		
		int[] reversedArr = new int[numArr.length];
		
		int length = numArr.length;
		
		for (int i=0; i<length; i++) {
			reversedArr[length-1-i] = numArr[i];
		}
		
		for (int i=0; i<length; i++) {
			System.out.print(numArr[i] + ", ");
		}
		
		System.out.println("\n-------------------------");
		
		for (int i=0; i<length; i++) {
			System.out.print(reversedArr[i] + ", ");
		}
	}
}
/*
1, 2, 5, 1, 6, 1, 5, 4, 8, 
-------------------------
8, 4, 5, 1, 6, 1, 5, 2, 1, 
*/