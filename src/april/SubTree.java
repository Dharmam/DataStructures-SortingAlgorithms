package april;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import utils.TreeNode;

public class SubTree {

	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(2);
		node.right = new TreeNode(-3);

		int[] result = findFrequentTreeSum(node);
		System.out.println(Arrays.toString(result));

		TreeNode node1 = new TreeNode(5);
		node1.left = new TreeNode(2);
		node1.right = new TreeNode(-5);

		result = findFrequentTreeSum(node1);
		System.out.println(Arrays.toString(result));

	}

	static int[] findFrequentTreeSum(TreeNode root) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Integer hValue = null;
		traverse(map, root);

		ArrayList<Integer> array = new ArrayList<>();

		for (Integer i : map.keySet()) {
			if (hValue == null) {
				hValue = map.get(i);
				array.add(i);
			} else {
				if (hValue == map.get(i))
					array.add(0, i);
				else if (hValue < map.get(i)) {
					hValue = map.get(i);
					array.clear();
					array.add(i);
				}
			}
		}

		int[] arr = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			arr[i] = array.get(i);
		}

		return arr;
	}

	static int traverse(HashMap<Integer, Integer> map, TreeNode node) {
		int sum = 0;
		if (node != null) {
			sum = node.val + traverse(map, node.left) + traverse(map, node.right);

			int result = 0;
			if (map.get(sum) == null)
				result = 1;
			else
				result = map.get(sum) + 1;

			map.put(sum, result);
		}
		return sum;
	}
}
