package JavaProgrammingForTestingLabGuide;

public class Page09ex04_LabGuide_P9ex04 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int [] {2, 4, 6, 7, 8, 12, 0, 3, -4, 1};
		int[] arr2 = reverseArry (arr1);
		
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + ", ");
			
		}
	}

	private static int[] reverseArry(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] newArr = new int [arr.length];
		
		for (int i=0; i<arr.length; i++) {
			newArr[i] = arr[arr.length-1-i];
		}
		for (int i=arr.length-1; i>0; i--) {
			System.out.print(arr[i]);
		}
		return newArr;
	}
	
	/*
	 private static int[] reverseArry(int[] arr) {
		// TODO Auto-generated method stub
		
		int[] newArr = new int [arr.length];
		
		for (int i=0; i<arr.length; i++) {
			newArr[i] = arr[arr.length-1-i];
		}
		return newArr;
	} 
	 */
}
/*
1,-4,3,0,12,8,7,6,4,2,

1-4301287641, -4, 3, 0, 12, 8, 7, 6, 4, 2, 
*/