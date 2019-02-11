package february;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import utils.TreeNode;

public class BSTLeetCode {
	static Integer maxCount = 0;
	static Integer modeValue = 0;
	static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(5);
		System.out.println(Arrays.toString(findMode(root)));
	}

	static int[] findMode(TreeNode root) {
		inOrder(root);
		int[] result = new int[modeValue];
		int j = 0;
		for (int i : map.keySet()) {
			if (map.get(i) == maxCount) {
				result[j] = i;
				j++;
			}
		}
		return result;
	}

	static void inOrder(TreeNode node) {
		if (node == null)
			return;
		else {
			inOrder(node.left);
			Integer count = map.get(node.val);
			if (count == null) {
				map.put(node.val, 1);
				count = 1;
			} else {
				count++;
				map.put(node.val, count);
			}
			if (maxCount < count) {
				maxCount = count;
				modeValue = 1;
			} else if (maxCount == count) {
				modeValue++;
			}
			inOrder(node.right);
		}
	}

}
