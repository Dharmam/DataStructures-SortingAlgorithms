package february;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZigZagTraversal {

	public static void main(String args[]) throws Exception {
		System.out.println("Test");
		// Level 0
		TreeNode root = new TreeNode(1);
		root.height = 0;

		buildTree(root);
		System.out.println("In Order : ");
		inOrder(root);
		System.out.printf("%n");
		System.out.println("Level Order : ");
		levelOrder(root);

	}

	private static void levelOrder(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(" -> " + temp.val + "(" + temp.height + ")");

			if (temp.left != null) {
				temp.left.height = temp.height + 1;
				queue.offer(temp.left);
			}
			if (temp.right != null) {
				temp.right.height = temp.height + 1;
				queue.offer(temp.right);
			}
		}

	}

	private static void inOrder(TreeNode node) {
		if (node == null)
			return;
		inOrder(node.left);
		System.out.print(" -> " + node.val);
		inOrder(node.right);
	}

	private static TreeNode buildTree(TreeNode root) {

		// Level 1
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		// Level 2
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		// Level 3
		root.left.left.left = new TreeNode(8);
		root.left.left.right = new TreeNode(9);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(11);
		root.right.left.left = new TreeNode(12);
		root.right.left.right = new TreeNode(13);
		root.right.right.left = new TreeNode(14);
		root.right.right.right = new TreeNode(15);

		return root;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	int height;

	TreeNode(int i) {
		this.val = i;
	}
}

/*
 * 
 * import java.io.*; import java.util.*; import java.text.*; import java.math.*;
 * import java.util.regex.*;
 * 
 * /* Given some input string, determine the minimum number of mutations
 * required to make that string a palindrome. Mutation operations include adding
 * a letter, removing a letter, or modifying a single letter. Any operation can
 * be performed at any point in the string. An empty string is considered to be
 * a palindrome already.
 

public class Solution {
	public static void main(String args[]) throws Exception {
		findCost("aba");
		findCost("aaaaa");
		findCost("abc");
		findCost("abcd");
		findCost("abad");

	}

	static int findCost( String str, i , j , cost){
        int len = str.length();
        
        int res = 0 ;
        
        for(int i = 0, j = len-1 ; i <= j ; i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                res += Math.min()
            }
        } 
        System.out.println("Min cost : " + res);
        return res ;
    }
}

}

// i 0 1
// j 2 1
/* Enter your code here. Read input from STDIN. Print output to STDOUT */
// abcbd
// a d - 1
// bcb
//and bcd
// a bcb

// abcd

// l+1, h-1
// l , h-1 // abcb
// L+1, h //bcb

// 2 aabb or 2 and 1 aabcc
// aa