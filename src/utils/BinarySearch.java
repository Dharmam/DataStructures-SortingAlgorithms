package utils;

import java.util.List;

public class BinarySearch {
	public static int binarySearch(List<Integer> a, int b, int low, int high) {
		if (low >= high)
			return a.get(low) == b ? low : -1;
		int mid = low + (high - low) / 2;
		if (a.get(mid) > b) {
			return binarySearch(a, b, low, mid - 1);
		} else if (a.get(mid) < b) {
			return binarySearch(a, b, mid + 1, high);
		} else {
			return mid;
		}
	}

	public static int binarySearch1(int[] a, int b, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == b)
				return mid;
			if (a[mid] > b)
				return binarySearch(a, b, low, mid - 1);
			else
				return binarySearch(a, b, mid + 1, high);
		}
		return a[low] == b ? low : -1;
	}
	
	public static int binarySearch(int[] a, int b, int low, int high) {
		if(high>=low){
			int mid = low + (high - low) / 2;
			if (a[mid] == b)
				return mid;
			else if (a[mid] > b)
				return binarySearch(a, b, low, mid - 1);
			else
				return binarySearch(a, b, mid + 1, high);
		}
		 return -1;
	}
}
