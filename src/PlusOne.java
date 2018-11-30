import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author dbuch
 *
 *
 *         66. Plus One
 *
 * 
 *         Given a non-empty array of digits representing a non-negative
 *         integer, plus one to the integer.
 * 
 *         The digits are stored such that the most significant digit is at the
 *         head of the list, and each element in the array contain a single
 *         digit.
 * 
 *         You may assume the integer does not contain any leading zero, except
 *         the number 0 itself.
 * 
 *         Example 1:
 * 
 *         Input: [1,2,3] Output: [1,2,4] Explanation: The array represents the
 *         integer 123. Example 2:
 * 
 *         Input: [4,3,2,1] Output: [4,3,2,2] Explanation: The array represents
 *         the integer 4321.
 */
public class PlusOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add values to list, enter AN NEGATIVE INTEGER to finish.");
		ArrayList<Integer> list = new ArrayList<>();
		int n = sc.nextInt();
		while (true) {
			if (n >= 0) {
				list.add(n);
				System.out.println("Enter again: ");
				n = sc.nextInt();
			} else {
				System.out.println("Number is negative! System Shutdown!");
				break;
			}
			
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}

		int[] result = plusOne(arr);
		System.out.println("Output :: " + Arrays.toString(result));

	}

	static int[] plusOne(int[] digits) {
		System.out.println("Input :: " + Arrays.toString(digits));
		int acc = 1 ;
		for(int i = digits.length-1 ; i >=0 ; i--) {
			if(acc == 0 && digits[i] <= 8) break;
			int sum = digits[i]+acc ;
			digits[i] = sum%10 ;
			acc = sum/10 ;
		}
		if(acc != 0) {
			int[] result = new int[digits.length + 1];
			result[0] = acc ;
			for (int i = 0; i < digits.length; i++) {
				result[i+1] = digits[i];
			}
			return result;
		}
		return digits;
	}
}
