package january;

import java.util.ArrayList;
import java.util.Arrays;

import utils.GetInputObject;

/**
 * 
 * @author dbuch
 *
 *         80. Remove Duplicates from Sorted Array II
 * 
 *         Given a sorted array nums, remove the duplicates in-place such that
 *         duplicates appeared at most twice and return the new length.
 * 
 *         Do not allocate extra space for another array, you must do this by
 *         modifying the input array in-place with O(1) extra memory.
 * 
 *         Example 1:
 * 
 *         Given nums = [1,1,1,2,2,3],
 * 
 *         Your function should return length = 5, with the first five elements
 *         of nums being 1, 1, 2, 2 and 3 respectively.
 * 
 *         It doesn't matter what you leave beyond the returned length. Example
 *         2:
 * 
 *         Given nums = [0,0,1,1,1,1,2,3,3],
 * 
 *         Your function should return length = 7, with the first seven elements
 *         of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.
 * 
 *         It doesn't matter what values are set beyond the returned length.
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		// ArrayList<Integer> arr = GetInputObject.getList();
		// System.out.println(arr);
		/*
		 * Integer[] array = GetInputObject.getArray("1,1,1,2,2,3"); arr = new
		 * int[array.length]; for(int i =0 ; i < array.length ; i++){
		 * arr[i]=array[i]; }
		 */

		int[] arr = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 7 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Count : " + removeDuplicates1(arr));
		// [1,1,1,2,2,3],
	}

	static int removeDuplicates1(int[] nums) {
		ArrayList<Integer> arr = new ArrayList<>();

		Integer prev = null;
		int index = 0;

		for (int i : nums) {
			if (prev == null) {
				prev = i;
				index = 1;
				arr.add(i);
			} else {
				if (i == prev) {
					if (index < 2) {
						arr.add(i);
						index++;
					} else {
						continue;
					}
				} else {
					arr.add(i);
					index = 1;
					prev = i;
				}
			}
		}

		for (int i = 0; i < arr.size(); i++) {
			nums[i] = arr.get(i);
		}

		return arr.size();
	}

	static int removeDuplicates(int[] nums) {
		int prev = nums[0];
		int index = 0;

		int count = nums.length;
		int i = 0;
		while (i < nums.length) {
			if (nums[i] == prev && index < 2) {
				index++;
				i++;
			} else if (nums[i] == prev && index == 2) {
				System.out.println("Duplicate num : " + nums[i] + " at index : " + i);
				bubbleUp(nums, i);
				count--;
			} else {
				index = 1;
				i++;
			}
			if (i == nums.length)
				break;

			if (prev != nums[i])
				index = 0;
			prev = nums[i];

		}
		return count;
	}

	private static void bubbleUp(int[] nums, int i) {
		while (i < nums.length - 1) {
			nums[i] = nums[i + 1];
			i++;
		}
	}
}
