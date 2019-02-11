package february;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import utils.Node;

/**
 * 
 * @author dbuch 589. N-ary Tree Preorder Traversal Given an n-ary tree, return
 *         the preorder traversal of its nodes' values.
 * 
 * 
 */
public class NaryPreorderTraversal {

	public static void main(String[] args) {
		Node root = new Node(1);
		Node l11 = new Node(3);
		Node l12 = new Node(2);
		Node l13 = new Node(4);

		Node l21 = new Node(5);
		Node l22 = new Node(6);

		l11.children.add(l21);
		l11.children.add(l22);

		root.children.add(l11);
		root.children.add(l12);
		root.children.add(l13);
		
		System.out.println(preorder(root));
	}

	static List<Integer> preorder(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null) return result;
		else{
			Stack<Node> stack = new Stack<>();
			stack.push(root);
			
			while(!stack.isEmpty()){
				Node node = stack.pop();
				result.add(node.val);
				for(int i = node.children.size()-1 ; i >= 0; i--){
					stack.push(node.children.get(i));
				}
			}
			return result;
		}
	}
}
