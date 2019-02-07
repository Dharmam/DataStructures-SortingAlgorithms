package january;

import java.util.LinkedList;
import java.util.Queue;

import utils.TreeNode;

/**
 * 
 * @author dbuch
 *
 *         222. Count Complete Tree Nodes
 * 
 * 
 *         Given a complete binary tree, count the number of nodes.
 * 
 *         Note:
 * 
 *         Definition of a complete binary tree from Wikipedia: In a complete
 *         binary tree every level, except possibly the last, is completely
 *         filled, and all nodes in the last level are as far left as possible.
 *         It can have between 1 and 2h nodes inclusive at the last level h.
 * 
 * 
 */
public class CountNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countNodes(TreeNode root) {
		Queue<TreeNode> pq = new LinkedList<>();
		pq.offer(root);
		int count = 0;
		while (!pq.isEmpty()) {
			TreeNode node = pq.poll();
			if (node != null) {
				count++;
				if (node.left != null)
					pq.offer(node.left);
				if (node.right != null)
					pq.offer(node.right);
			}
		}
		return count;
	}

}
