package february;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maximumSubsequence("ABCDGH", "AEDFHR"));
		System.out.println(maximumSubsequence("AGGTAB", "GXTXAYB"));
		System.out.println(maximumSubsequenceRecur("ABCDGH", "AEDFHR", 6, 6));
		System.out.println(maximumSubsequenceRecur("AGGTAB", "GXTXAYB", 6, 7));

	}

	private static int maximumSubsequenceRecur(String A, String B, int i, int j) {
		if (i == 0 || j == 0)
			return 0;
		else {
			if (A.charAt(i-1) == B.charAt(j-1))
				return 1 + maximumSubsequenceRecur(A, B, i - 1, j - 1);
			else {
				return (Math.max(maximumSubsequenceRecur(A, B, i - 1, j), maximumSubsequenceRecur(A, B, i, j - 1)));
			}
		}
	}

	private static int maximumSubsequence(String a, String b) {
		int[][] dp = new int[a.length() + 1][b.length() + 1];
		for (int i = 1; i <= a.length(); i++) {
			for (int j = 1; j <= b.length(); j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[a.length()][b.length()];
	}
}
