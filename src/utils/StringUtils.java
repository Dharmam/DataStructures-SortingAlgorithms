package utils;

public class StringUtils {
	public static boolean isSubSequence(String string, String sub) {
		if (sub.length() == 0 || string.length() == 0)
			return false;
		int i = 0;
		int j = 0;
		while (i < string.length()) {
			if (string.charAt(i) == sub.charAt(j)) {
				j++;
				if (j >= sub.length())
					return true;
			}
			i++;
		}
		return false;
	}

	public static boolean isSubstring(String string, String sub) {
		if (sub.length() == 0 || string.length() == 0)
			return false;
		int i = 0;
		int j = 0;
		while (i < string.length()) {
			if (string.charAt(i) == sub.charAt(j)) {
				j++;
				if (j >= sub.length())
					return true;
			} else {
				j = 0;
			}

			i++;
		}
		return false;
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i <= j; i++,j--) {
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
		}
		return true;
	}
}
