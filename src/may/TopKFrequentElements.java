package may;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * @author dbuch
 * Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

 */
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
	}

	static List<Integer> topKFrequent(int[] nums, int k) {
		PriorityQueue<Frequency> pq = new PriorityQueue<>(new Comparator<Frequency>() {

			@Override
			public int compare(Frequency o1, Frequency o2) {
				if (o1.count > o2.count)
					return -1;
				else if (o1.count < o2.count)
					return 1;
				return 0;
			}
		});
		
		HashMap<Integer, Integer> set = new HashMap<>();

		for (int i : nums) {
			if (null != set.get(i)) {
				set.put(i, set.get(i)+1);
			}
			else set.put(i, 1);;
		}
		
		for (Integer i : set.keySet()) {
			pq.offer(new Frequency(i, set.get(i)));
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			System.out.println(pq.peek());
			list.add(pq.poll().val);
		}

		return list;
	}

	static class Frequency {
		int val;
		int count;

		Frequency(int val, int count) {
			this.val = val;
			this.count = count;
		}
	}

}
