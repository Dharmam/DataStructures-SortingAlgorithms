package january;

import java.util.Stack;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(validPalindrome("abca"));
		System.out.println(validPalindrome("tebbem"));
		System.out.println(validPalindrome("aba"));
		System.out.println(validPalindrome("a"));
		System.out.println(validPalindrome(""));

	}

	static boolean validPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < s.toCharArray().length && i<j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
                int i1 = i, j1 = j - 1, i2 = i + 1, j2 = j;
				while (i1 < j1 && s.charAt(i1) == s.charAt(j1)) {i1++; j1--;};
                while (i2 < j2 && s.charAt(i2) == s.charAt(j2)) {i2++; j2--;};
                return i1 >= j1 || i2 >= j2;			}
		}
		return true;
	}

	static boolean isPalindrome(String s) {
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		int mid = s.length() / 2;

		for (int i = 0; i < mid; i++) {
			left.push(s.charAt(i));
		}

		for (int i = mid; i < s.length(); i++) {
			right.push(s.charAt(i));
		}
		if (s.length() % 2 != 0)
			right.pop();

		int count = 0;
		while (!left.isEmpty() && !right.isEmpty()) {
			if (left.pop() != right.pop())
				return false;
		}
		return true;
	}

}
