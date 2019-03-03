package ProgramJava;

import java.util.Random;

public class Page49ex03_MatrixMaxSumRowAtIndexLineSum {

	public static Random random = new Random();
	
	public static void main(String[] args) {

		int rows = 10;
		int cols = 10;
		
		int low = 0;
		int high = 99;
		
		int[][] mat = new int[rows][cols];
		
		for (int i=0; i<mat.length; i++) {
			
			for (int j=0; j<mat[0].length; j++) {
				
				mat[i][j] = random(low, high);
			}
		}
		
		printMatrix(mat);
		
		int maxRowIndex = 0;
		int maxRowSum = 0;
		
		for (int i=0; i<rows; i++) {
			
			int currentRowSum = 0;
			
			for (int j=0; j<cols; j++) {
				currentRowSum += mat[i][j];
			}
			
			if (i == 0) {
				maxRowIndex = i;
				maxRowSum = currentRowSum;
			}
			else {
				if (currentRowSum > maxRowSum) {
					maxRowSum = currentRowSum;
					maxRowIndex = i;
				}
			}
		}
		
		System.out.println("\n\nMax sum: row at index " + maxRowIndex + ", sum: " + maxRowSum);
	}
	
	public static void printMatrix(int[][] mat) {
		
		for (int i=0; i<mat.length; i++) {
			
			for (int j=0; j<mat[0].length; j++) {
				
				if (mat[i][j] < 10) {
					System.out.print(" " + mat[i][j] + " ");	
				}
				else {
					System.out.print(mat[i][j] + " ");
				}
			}
			
			System.out.println("");
		}
	}
	
	public static int random(int low, int high) {
		return random.nextInt(high - low + 1) + low;
	}
}
/*
 7 40 66 29 81 95 37 53 32 23 
94 75 89 47 52 14  1 96 44 36 
16 89 39 86 32 22 42 60 14  9 
89 50 89 43 99 12  7 44 78  1 
48 82 34 12 12 40 45 76  1 64 
91 53 59 13 31 76 57  7 94 83 
82  0 94 71 56  1 80 23 68 56 
73 58 71 25 27  2 92 32  4 48 
48 56 39 28 36 74  2 16 18 70 
80 69 91 47 61  3 52 66 12 31 

Max sum: row at index 5, sum: 564
*/