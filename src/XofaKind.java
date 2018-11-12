import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class XofaKind {

	public static void main(String[] args) {

		int[] deck = new int[] {1,2,3,4,4,3,2,1};
		System.out.println(hasGroupsSizeX(deck));

		deck = new int[] {1,1,1,2,2,2,3,3};
		System.out.println(hasGroupsSizeX(deck));

		deck = new int[] {1};
		System.out.println(hasGroupsSizeX(deck));

		deck = new int[] {1,1};
		System.out.println(hasGroupsSizeX(deck));

		deck = new int[] {1,1,2,2,2,2};
		System.out.println(hasGroupsSizeX(deck));
	}

	static boolean hasGroupsSizeX(int[] deck) {
		HashMap<Integer, Integer> set = new HashMap<>();

		for(int i : deck) {
			if(set.get(i)!=null) {
				set.put(i, set.get(i)+1);
			}else {
				set.put(i, 1);
			}
		}
		Integer prev= null;
		for( Integer value : set.values()) {
			if(prev == null) prev = value;
			else {
				if(prev!=value)
					return false ;
			 prev = value;
			}
		}

		return true;
	}

}
