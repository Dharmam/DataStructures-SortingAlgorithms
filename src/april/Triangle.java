package april;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author dbuch 120. Triangle
 * 
 *         Given a triangle, find the minimum path sum from top to bottom. Each
 *         step you may move to adjacent numbers on the row below.
 * 
 *         For example, given the following triangle
 * 
 *         [ [2], [3,4], [6,5,7], [4,1,8,3] ] The minimum path sum from top to
 *         bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * 
 *         Note:
 * 
 *         Bonus point if you are able to do this using only O(n) extra space,
 *         where n is the total number of rows in the triangle.
 */
public class Triangle {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(2);
		triangle.add(list);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		triangle.add(list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(5);
		list3.add(7);
		triangle.add(list3);
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(4);
		list4.add(1);
		list4.add(8);
		list4.add(3);
		triangle.add(list4);
		
		System.out.println(minimumTotal(triangle));
	}

	public static int minimumTotal(List<List<Integer>> triangle) {
		int result = 0;
		int last = 0;
		int[] arr = new int[triangle.size()];
		for (List<Integer> list : triangle) {
			int i = lastMin(list, last);
			result += list.get(i);
			System.out.println("Index : "+i + " Value : "+list.get(i));
			last = i;
		}
		
		return result;
	}

	public  static int lastMin(List<Integer> list, int last) {
		int prev = last - 1;
		int next = last + 1;
		int[] temp = new int[2];
		if (prev >= 0 && list.size() > prev) {
			temp[0] = list.get(prev);
		} else {
			prev = last;
			temp[0] = list.get(prev);
		}
		if (next < list.size()) {
			temp[1] = list.get(next);
		} else {
			next = last;
			temp[1] = list.get(next);
		}
		return temp[0] <= temp[1] ? (list.get(last) <= temp[0] ? last : prev) 
				: (list.get(last) > temp[1] ? next : last);
	}

}
