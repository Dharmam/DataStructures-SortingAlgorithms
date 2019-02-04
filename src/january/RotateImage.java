package january;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
		rotate(matrix);
		
		matrix = new int[][] { { 5, 1, 9 }, { 2, 4, 8 }, { 13, 3, 6 } };
		rotate(matrix);
	}

	static void rotate(int[][] matrix) {
		int i = 0;
		int j = matrix.length;

		System.out.println("Originial :- ");

		for (int j2 = 0; j2 < matrix.length; j2++) {
			System.out.println(Arrays.toString(matrix[j2]));
		}
		
		
		while(i<j){
			int[] rowTop = new int[j-i];
			for(int x=0 ; x < j-i ; x++){
				rowTop[x] = matrix[i][matrix.length-j+x];
			}

			int[] colRight = new int[rowTop.length];
			for (int x = 0; x < j-i ; x++) {
				colRight[x] = matrix[i+x][j-1];
			}

			int[] rowBottom = new int[rowTop.length];
			for (int x = j-i-1; x >= 0; x--) {
				rowBottom[x] = matrix[matrix.length-i-1][j-x-1];
			}


			int[] colLeft = new int[rowTop.length];
			for (int x = j-i-1; x >= 0; x--) {
				colLeft[x] = matrix[j-x-1][matrix.length-j];
			}
			
			int[] temp = rowTop;
			
			for(int x=0 ; x < j-i ; x++){
				 matrix[i][matrix.length-j+x] = colLeft[x] ;
			}
			
			for (int x = j-i-1; x >= 0; x--) {
				 matrix[j-x-1][matrix.length-j] = rowBottom[x];
			}
			
			for (int x = j-i-1; x >= 0; x--) {
				 matrix[matrix.length-i-1][j-x-1] = colRight[x] ;
			}
			
			for (int x = 0; x < j-i ; x++) {
				 matrix[i+x][j-1] = temp[x] ;
			}

			i++;
			j--;
			
		}
		
		System.out.println("Rotated :- ");

		for (int j2 = 0; j2 < matrix.length; j2++) {
			System.out.println(Arrays.toString(matrix[j2]));
		}
	}

}
