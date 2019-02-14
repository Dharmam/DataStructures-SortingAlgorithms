package utils;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
	
	public static void printInOrder(TreeNode node){
		if(node == null) return ;
		printInOrder(node.left);
		System.out.print("-> "+node.val);
		printInOrder(node.right);
	}
	
	public static void printPostOrder(TreeNode node){
		if(node == null) return ;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print("-> "+node.val);
	}
	
	public static void printPreOrder(TreeNode node){
		if(node == null) return ;
		System.out.print("-> "+node.val);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
}
