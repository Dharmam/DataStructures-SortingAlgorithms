/**
 * 
 * @author dbuch
 *
 *         67. Add Binary
 * 
 *         Given two binary strings, return their sum (also a binary string).
 * 
 *         The input strings are both non-empty and contains only characters 1
 *         or 0.
 * 
 *         Example 1:
 * 
 *         Input: a = "11", b = "1" Output: "100" Example 2:
 * 
 *         Input: a = "1010", b = "1011" Output: "10101"
 */
public class AddBinary {

	public static void main(String[] args) {
		String a = "11", b = "1";
		addBinary(a, b);

		a = "1010";
		b = "1011";
		addBinary(a, b);
		
		a = "100";
		b = "110010";
		addBinary(a, b);


	}

	static String addBinary(String a, String b) {
		int sum = 0, carry = 0;
		String result = "";
		String maxString = "";
		String minString = "";
		if (a.length() < b.length()) {
			maxString = b;
			minString = a;
		} else {
			maxString = a;
			minString = b;
		}
		
		while(minString.length() != maxString.length()) {
			minString = "0"+minString;
		}

		System.out.println("Min String : " + minString + " Max String : " + maxString);
		System.out.println("Min String length : " + minString.length() + " Max String length : " + maxString.length());


		int i = minString.length() - 1;
		while (i >= 0) {
			int x = minString.charAt(i) - '0';
			int y = maxString.charAt(i) - '0';

			sum = x + y + carry;
			if (sum > 1) {
				if (sum == 2) {
					sum = 0;
					carry = 1;
				} else {
					sum = 1;
					carry = 1;
				}
			} else {
				carry = 0;
			}
			result = sum + result;
			System.out.println("a : " + x + " b : " + y + " sum : " + sum + " carry : " + carry + " result " + result);
			i--;
		}

		if(carry !=0 )result = carry + result;
		System.out.println(" result " + result);
		System.out.println("----------------");
		return "";
	}
}
