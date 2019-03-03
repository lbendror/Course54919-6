package ProgramJava;

public class Page49ex02_MatrixOfZeroButAlachsonWith2 {

	public static void main(String[] args) {

		int rows = 11;
		int cols = 11;
		
		int[][] mat = new int[rows][cols];
		
		for (int i=0; i<mat.length; i++) {
			
			for (int j=0; j<mat[0].length; j++) {
				
				if (i == j || mat.length-1-j == i) {
					mat[i][j] = 1;
				}
				else {
					mat[i][j] = 0;
				}
			}
		}
		
		printMatrix(mat);
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
}
/*
 1  0  0  0  0  0  0  0  0  0  1 
 0  1  0  0  0  0  0  0  0  1  0 
 0  0  1  0  0  0  0  0  1  0  0 
 0  0  0  1  0  0  0  1  0  0  0 
 0  0  0  0  1  0  1  0  0  0  0 
 0  0  0  0  0  1  0  0  0  0  0 
 0  0  0  0  1  0  1  0  0  0  0 
 0  0  0  1  0  0  0  1  0  0  0 
 0  0  1  0  0  0  0  0  1  0  0 
 0  1  0  0  0  0  0  0  0  1  0 
 1  0  0  0  0  0  0  0  0  0  1 
*/