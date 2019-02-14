package february;

import utils.TreeNode;

public class BuildTree {

	public static void main(String[] args) {
		int[] inOrder = new int[] { 9, 3, 15, 20, 7 };
		int[] postOrder = new int[] { 9, 15, 7, 20, 3 };

		TreeNode root = null;

		root = buildTree(inOrder, postOrder);

		TreeNode.printInOrder(root);
		System.out.println("IN");

		TreeNode.printPostOrder(root);
		System.out.println("POST");

		TreeNode.printPreOrder(root);
		System.out.println("PRE");

	}

	private static TreeNode buildTree(int[] inOrder, int[] postOrder) {
		return buildUtil(inOrder, postOrder, 0, inOrder.length - 1, 0, postOrder.length - 1);
	}

	private static TreeNode buildUtil(int[] inOrder, int[] postOrder, int start, int end, int postStart, int postEnd) {
		if (end < start)
			return null;

		TreeNode node = new TreeNode(postOrder[postEnd]);

		if (end == start)
			return node;

		int currentRootIndex = search(inOrder, start, end, node.val);

		node.right = buildUtil(inOrder, postOrder, currentRootIndex + 1, end, postStart + currentRootIndex - start,
				postEnd - 1);
		node.left = buildUtil(inOrder, postOrder, start, currentRootIndex - 1, postStart,
				postStart + currentRootIndex - (start + 1));

		return node;
	}

	private static int search(int[] inOrder, int start, int end, int val) {
		int i = start;
		for (; i < end; i++) {
			if (inOrder[i] == val)
				break;

		}
		return i;
	}

}
