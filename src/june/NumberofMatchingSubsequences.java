package june;

import java.util.Arrays;

/**
 * 
 * @author dbuch 792. Number of Matching Subsequences
 * 
 *         Given string S and a dictionary of words words, find the number of
 *         words[i] that is a subsequence of S.
 * 
 *         Example : Input: S = "abcde" words = ["a", "bb", "acd", "ace"]
 *         Output: 3 Explanation: There are three words in words that are a
 *         subsequence of S: "a", "acd", "ace". Note:
 * 
 *         All words in words and S will only consists of lowercase letters. The
 *         length of S will be in the range of [1, 50000]. The length of words
 *         will be in the range of [1, 5000]. The length of words[i] will be in
 *         the range of [1, 50].
 */
public class NumberofMatchingSubsequences {

	public static void main(String[] args) {
		String S = "abcde";
		String[] words = new String[]{"a", "bb", "acd", "ace"} ;
		
		numMatchingSubseq(S, words);
	}

	static int numMatchingSubseq(String S, String[] words) {
		int result = 0;
		int[] dictionary = new int[26];

		for (char s : S.toCharArray()) {
			dictionary[s - 'a']++;
		}

		System.out.println(S);

		for (String word : words) {
			int[] currDict = Arrays.copyOf(dictionary, 26);
			boolean isNotSubSeq = false ;
			for (char s : word.toCharArray()) {
				if (currDict[s - 'a'] == 0) {
					isNotSubSeq = true;
					break;
				} else {
					currDict[s - 'a']--;
				}
			}
			if(!isNotSubSeq){
				System.out.println(word + " -- is a subsequence number - " +  result);
				result++;
			}
		}


		return result;
	}
}
