package JavaProgrammingForTestingLabGuide;

public class Page09ex04_InputArrayResultUPDown {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int [] {6,8,4,2,7,5};
		int[] arrRev = reverseArry (arr);
		
		for (int i=0; i<arrRev.length; i++) {
			System.out.print(+ arrRev[i] + ",");
			
		}
	}

	private static int[] reverseArry(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] newArr = new int [arr.length];
		
		for (int i=0; i<arr.length; i++) {
			newArr[i] = arr[arr.length-1-i];
		}
		return newArr;
	}
}
/*
 Create a class that reverse a given array order. For example, for the input {6,8,4,2,7,5} the result should be {5,7,2,4,8,6}.
create an array[10] of numbers with random values between 0-10 to be used as an input
print the array before and after reversing

5,7,2,4,8,6,
*/