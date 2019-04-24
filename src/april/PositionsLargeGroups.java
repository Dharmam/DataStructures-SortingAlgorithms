package april;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author dbuch
 *
 *         830. Positions of Large Groups
 * 
 *         n a string S of lowercase letters, these letters form consecutive
 *         groups of the same character.
 * 
 *         For example, a string like S = "abbxxxxzyy" has the groups "a", "bb",
 *         "xxxx", "z" and "yy".
 * 
 *         Call a group large if it has 3 or more characters. We would like the
 *         starting and ending positions of every large group.
 * 
 *         The final answer should be in lexicographic order.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: "abbxxxxzzy" Output: [[3,6]] Explanation: "xxxx" is the single
 *         large group with starting 3 and ending positions 6. Example 2:
 * 
 *         Input: "abc" Output: [] Explanation: We have "a","b" and "c" but no
 *         large group. Example 3:
 * 
 *         Input: "abcdddeeeeaabbbcd" Output: [[3,5],[6,9],[12,14]]
 * 
 */
public class PositionsLargeGroups {

	public static void main(String[] args) {
		List<List<Integer>> result = null;
		result = largeGroupPositions("aaa");
		printList(result);
		
		result = largeGroupPositions("abc");
		printList(result);

		result = largeGroupPositions("abcdddeeeeaabbbcd");
		printList(result);

		result = largeGroupPositions("abbxxxxzzy");
		printList(result);
	}

	private static void printList(List<List<Integer>> result) {
		System.out.print("[");
		for (List<Integer> l : result) {
			if (!l.isEmpty()) {
				System.out.print("[" + l.get(0) + "," + l.get(1) + "]");
			}
		}
		System.out.print("]");
	}

	static List<List<Integer>> largeGroupPositions(String S) {
		int count = 0;
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		Stack<Character> stack = new Stack<>();
		int i = 0 ;
		while ( i < S.length()) {
			if(stack.isEmpty()){
				stack.push(S.charAt(i));
				list.add(i);
				count++;
				i++;
			}else{
				if(S.charAt(i)==stack.peek()){
					count++;
					i++;
				}else{
					if(count >= 3){
						list.add(i-1);
						result.add(list);
					}
					stack.clear();
					list = new ArrayList<>();
					count = 0 ;
				}
			}
		}
		if(S.charAt(i-1)==stack.peek() && count >= 3){
			list.add(i-1);
			result.add(list);
		}
		return result;
	}

}
