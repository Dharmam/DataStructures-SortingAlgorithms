package february;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import utils.TreeNode;

/**
 * 
 * @author dbuch Given a binary tree, return the preorder traversal of its
 *         nodes' values.
 * 
 *         Follow up: Recursive solution is trivial, could you do it
 *         iteratively?
 * 
 * 
 */
public class BinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		System.out.println(preorderTraversal(root));
	}

	static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		// preOrder(list, root);
		if (root == null)
			return list;
		else {
			Stack<TreeNode> queue = new Stack<>();
			queue.push(root);
			while (!queue.isEmpty()) {
				TreeNode node = queue.pop();
				list.add(node.val);
				if (node.left != null)
					queue.push(node.left);
				if (node.right != null)
					queue.push(node.right);
			}
		}
		return list;
	}

	// Recursive
	static void preOrder(List<Integer> list, TreeNode node) {
		if (node == null)
			return;
		else {
			list.add(node.val);
			preOrder(list, node.left);
			preOrder(list, node.right);
		}
	}
}
