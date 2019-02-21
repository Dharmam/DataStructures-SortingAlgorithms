package february;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println("Total no of ways : " + climbStairs(4));
	}

	private static int climbStairs(int n) {
		int[] memo = new int[n + 1];
		return stepUp(n, 0, memo);
	}

	private static int stepUp(int n, int i, int[] memo) {
		if (i > n) {
			return 0;
		}
		if (n == i) {
			return 1;
		}
		if (memo[i] > 0) {
			return memo[i];
		}
		memo[i] = stepUp(n, i + 1, memo) + stepUp(n, i + 2, memo);
		return memo[i];
	}

}
