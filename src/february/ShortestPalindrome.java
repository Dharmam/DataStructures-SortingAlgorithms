package february;

import utils.StringUtils;

/**
 * 
 * @author dbuch LeetCode 214. Shortest Palindrome
 */
public class ShortestPalindrome {

	public static void main(String[] args) {
		System.out.println(shortestPalindrome("aacecaaa"));
		System.out.println(shortestPalindrome("abcd"));
	}

	static  public String shortestPalindrome(String s) {
		if(s.length()<=1) return s;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s= sb+(s.charAt(0)==sb.charAt(sb.length()-1) ? s.substring(1) : s);
        System.out.println(s);
		int len = s.length();
		String last = s;
        for(int i = 0; i < sb.length() ; i++){
        	String subString = s.substring(i) ;
           // System.out.println(subString);
        	if(isPalindrome(subString)) {
        		last = subString ;
        	}
        }
        return last;
    }

	static boolean isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i <= j; i++,j--) {
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
		}
		return true;
	}

}

//abcdbaabcdba