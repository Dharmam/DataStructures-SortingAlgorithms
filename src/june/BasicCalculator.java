package june;

/**
 * 
 * @author dbuch
 *
 *         224. Basic Calculator Implement a basic calculator to evaluate a
 *         simple expression string.
 * 
 *         The expression string may contain open ( and closing parentheses ),
 *         the plus + or minus sign -, non-negative integers and empty spaces .
 * 
 *         Example 1:
 * 
 *         Input: "1 + 1" Output: 2 Example 2:
 * 
 *         Input: " 2-1 + 2 " Output: 3 Example 3:
 * 
 *         Input: "(1+(4+5+2)-3)+(6+8)" Output: 23 Note: You may assume that the
 *         given expression is always valid. Do not use the eval built-in
 *         library function.
 */
public class BasicCalculator {

	public static void main(String[] args) {
		calculate("(1+(4+5+2)-3)+(6+8)");
		calculate(" 2-1 + 2 ");
		calculate("1 + 1");
	}

	static int calculate(String s) {
		int result = 0;
		boolean isAdd = true;
		for (char c : s.toCharArray()) {
			//System.out.println("value = " + c);

			if (c == '(' || c == ')' || c == ' ') {
				continue;
			} else {
				switch (c) {
				case '+': {
					isAdd = true;
					break;
				}
				case '-': {
					isAdd = false;
					break;
				}
				default: {
					System.out.println("digit = " + c);

					if (isAdd) {
						result = result + (c - '0');
					} else {
						result = result - (c - '0');
					}
					break;
				}
				}
			}
		}

		System.out.println(result);
		return result;
	}
}
