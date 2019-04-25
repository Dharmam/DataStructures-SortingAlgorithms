package february;

import java.util.Arrays;

/**
 * 
 * @author dbuch
 *
 *         977. Squares of a Sorted Array Given an array of integers A sorted in
 *         non-decreasing order, return an array of the squares of each number,
 *         also in sorted non-decreasing order.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: [-4,-1,0,3,10] Output: [0,1,9,16,100] Example 2:
 * 
 *         Input: [-7,-3,2,3,11] Output: [4,9,9,49,121]
 */
public class SquaresSorted {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedSquares(new int[] { -4, -1, 0, 3, 10 })));
		System.out.println(Arrays.toString(sortedSquares(new int[] { -7, -3, 2, 3, 11 })));
	}

	static int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				bubbleSort(i, A);
			}
			A[i] = (int) Math.pow(A[i], 2);
		}
		return A;
	}

	private static void bubbleSort(int i, int[] A) {
		for (int j = i; j < A.length; j++) {
			if (A[j] < (A[i] * (-1))) {
				int temp = A[j];
				A[j] = A[i];
				A[i] = temp;
			}
		}
	}

	static int[] sortedSquares1(int[] A) {
		Integer[] result = new Integer[A.length];
		for (int i = 0; i < A.length; i++) {
			result[i] = (int) Math.pow(A[i], 2);
		}
		Arrays.sort(result);
		for (int i = 0; i < A.length; i++) {
			A[i] = result[i];
		}
		return A;
	}
}
