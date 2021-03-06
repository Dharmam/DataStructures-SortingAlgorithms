package december;

import java.util.Arrays;

/**
 * 414. Third Maximum Number
 * 
 * @author dbuch Given a non-empty array of integers, return the third maximum
 *         number in this array. If it does not exist, return the maximum
 *         number. The time complexity must be in O(n).
 * 
 *         Example 1: Input: [3, 2, 1]
 * 
 *         Output: 1
 * 
 *         Explanation: The third maximum is 1. Example 2: Input: [1, 2]
 * 
 *         Output: 2
 * 
 *         Explanation: The third maximum does not exist, so the maximum (2) is
 *         returned instead. Example 3: Input: [2, 2, 3, 1]
 * 
 *         Output: 1
 * 
 *         Explanation: Note that the third maximum here means the third maximum
 *         distinct number. Both numbers with value 2 are both considered as
 *         second maximum.
 */
public class ThirdMaximumNumber {

	public static void main(String[] args) {
		System.out.println(thirdMax(new int[] { 3, 2, 1 }));
		System.out.println(thirdMax(new int[] { 2, 1 }));
		System.out.println(thirdMax(new int[] { 2, 2, 3, 1 }));
		System.out.println(thirdMax(new int[] { 1, 1, 2 }));
		System.out.println(thirdMax(new int[] { 5, 2, 2 }));
		System.out.println(thirdMax(new int[] { 500, 102, 2, 789, 65, 999, 111, 7, 9, 13 }));
		System.out.println(thirdMax(new int[] { 1, 2, -2147483648 }));

	}

	static int thirdMax(int[] nums) {
		boolean foundMax = false;
		int max = Integer.MIN_VALUE;
		for (int i : nums) {
			if (i >= max) {
				max = i;
				foundMax = true;
			}
		}
		boolean secondFoundMax = false;
		int secondMax = Integer.MIN_VALUE;
		for (int i : nums) {
			if (i >= secondMax && i != max) {
				secondMax = i;
				secondFoundMax = true;
			}
		}

		boolean thirdFoundMax = false;
		int thirdMax = Integer.MIN_VALUE;
		for (int i : nums) {
			if (i >= thirdMax && i != max && i != secondMax) {
				thirdMax = i;
				thirdFoundMax = true;
			}
		}

		System.out.println("First max : " + max);
		System.out.println("Second max : " + secondMax);
		System.out.println("Third max : " + thirdMax);
		if (foundMax && secondFoundMax && thirdFoundMax)
			return thirdMax;
		else return thirdMax == Integer.MIN_VALUE ? max : thirdMax;

	}

	static int thirdMax1(int[] nums) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		if (nums.length < 3)
			return nums[nums.length - 1];
		int last = 0;
		int i = nums.length - 1, count = 0;
		while (i >= 0 && count < 3) {
			if (last != nums[i])
				count++;
			last = nums[i];
			i--;
		}
		return count == 3 ? last : nums[nums.length - 1];
	}
}
