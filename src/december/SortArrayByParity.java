package december;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author dbuch 905. Sort Array By Parity Given an array A of non-negative
 *         integers, return an array consisting of all the even elements of A,
 *         followed by all the odd elements of A.
 * 
 *         You may return any answer array that satisfies this condition.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: [3,1,2,4] Output: [2,4,3,1] The outputs [4,2,3,1], [2,4,1,3],
 *         and [4,2,1,3] would also be accepted.
 * 
 * 
 *         Note:
 * 
 *         1 <= A.length <= 5000 0 <= A[i] <= 5000
 */

public class SortArrayByParity {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrayByParity(new int[] { 3, 1, 2, 4 })));
	}

	// Modified pivot sort - Beats 99%
	static int[] sortArrayByParity(int[] A) {
		int pivot = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				int temp = A[pivot];
				A[pivot] = A[i];
				A[i] = temp;
				pivot++;
			}
		}
		return A;
	}

	private static void swap(int[] a, int i, int i2) {
		int temp = a[i];
		a[i] = a[i2];
		a[i2] = temp;
	}

	// Simple way - Brute force. Beats 36% run times.
	static int[] sortArrayByParity2(int[] A) {
		ArrayList<Integer> arr = new ArrayList<>();
		int lastEvenIndex = 0;
		for (int a : A) {
			if (a % 2 == 0) {
				arr.add(lastEvenIndex, a);
				lastEvenIndex++;
			} else {
				arr.add(a);
			}
		}
		int[] result = new int[A.length];
		int i = 0;

		for (int e : arr) {
			result[i] = e;
			i++;
		}

		return result;
	}

	// Simple way - Brute force. Beats 56% run times.
	static int[] sortArrayByParity1(int[] A) {
		ArrayList<Integer> arrOdd = new ArrayList<>();
		ArrayList<Integer> arrEven = new ArrayList<>();
		for (int a : A) {
			if (a % 2 == 0)
				arrEven.add(a);
			else
				arrOdd.add(a);
		}
		int[] result = new int[A.length];
		int i = 0;

		for (int e : arrEven) {
			result[i] = e;
			i++;
		}
		for (int o : arrOdd) {
			result[i] = o;
			i++;
		}

		return result;
	}

}
