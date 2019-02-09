package january;

public class StoneGame {

	public static void main(String[] args) {
		System.out.println(isLongPressedName("leelee", "lleeelee"));

		System.out.println(isLongPressedName("saeed", "ssaaedd"));
		System.out.println(isLongPressedName("kikcxmvzi", "kiikcxxmmvvzz"));
		System.out.println(isLongPressedName("alex", "aaleex"));
	}

	static boolean isLongPressedName(String name, String typed) {
		int i = 0, j = 0;char last = '*';
		while (i < name.length() && j < typed.length()) {
			if (name.charAt(i) == typed.charAt(j)) {
				last=name.charAt(i);
				j++;
				i++;
			} 
			else if(last == typed.charAt(j))i--; 
			else return false;
		}
		return ( i==name.length() );
	}

}
