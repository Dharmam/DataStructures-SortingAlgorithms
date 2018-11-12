
public class HexConvertor {

	public static void main(String[] args) {

		System.out.println(dominantIndex(new int[] {1, 2, 3, 4}));
		System.out.println(dominantIndex(new int[] {3, 6, 1, 0}));


	}

	static int dominantIndex(int[] nums) {
		int index = -1 ;
		int max = 0 ;
		int secondMax = 0 ;

		for(int i = 0 ; i < nums.length ; i++) {
			if(max < nums[i]) {
				secondMax = max;
				max = nums[i];
				index = i;
			}
			else if(secondMax < nums[i]) {
				secondMax = nums[i];
			}
		}

		System.out.println("Max : " + max + " Second Max : " + secondMax + " index : " + index);

			if(2*secondMax <= max) {
				return index ;
			}
		
		return -1 ;
	}
}
