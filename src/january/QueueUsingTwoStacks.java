package january;

import java.util.Arrays;

import utils.BinarySearch;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(searchRange( new int[]{1,4}, 4)));
		
		int[] arr = new int[] { 5, 7, 7, 8, 8, 10 };
		System.out.println(Arrays.toString(searchRange(arr, 8)));

		System.out.println(Arrays.toString(searchRange(arr, 6)));
		
		System.out.println(Arrays.toString(searchRange( new int[0], 0)));
		
		System.out.println(Arrays.toString(searchRange( new int[]{1}, 0)));
		
		System.out.println(Arrays.toString(searchRange( new int[]{1}, 1)));
		
		System.out.println(Arrays.toString(searchRange( new int[]{2,2}, 2)));
		
		System.out.println(Arrays.toString(searchRange( new int[]{1,3}, 1)));

		
	}

	static int[] searchRange(int[] nums, int target) {
		int index = BinarySearch.binarySearch(nums, target, 0, nums.length-1);

		int[] result = new int[2];
		if (index == -1) {
			return new int[]{ -1, -1 };
		}

		int i = index;
		while (i >= 0 && nums[i] == target) {
			i--;
		}
		int j = index+1;
		while (j < nums.length && nums[j] == target) {
			j++;
		}
		result[0] = i+1 ;
		result[1] = j-1;
		return result;

	}

}
