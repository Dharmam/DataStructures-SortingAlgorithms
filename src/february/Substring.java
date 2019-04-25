package february;

/**
 * @author dbuch
 * 
 * 392. Is Subsequence
Medium

472

108

Favorite

Share
Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.

Follow up:
If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?
 */
import utils.StringUtils;

public class Substring {

	public static void main(String[] args) {
		System.out.println(StringUtils.isSubstring("abc", "a"));
		System.out.println(StringUtils.isSubstring("abcd", "bcd"));
		System.out.println(StringUtils.isSubstring("abcd", ""));
		System.out.println(StringUtils.isSubstring("abcd", "e"));
		System.out.println(StringUtils.isSubstring("abcd", "cdf"));

		String S = "abcde";
		String[] words = new String[] { "a", "bb", "acd", "ace" };

		System.out.println(numMatchingSubseq(S, words));
	}

	public static int numMatchingSubseq(String S, String[] words) {
		int result = 0;
		for (String word : words) {
			result += (StringUtils.isSubSequence(S, word) ? 1 : 0);
		}

		return result;
	}

}
