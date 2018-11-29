package july;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>();
		//[5, 7, 7, 8, 8, 10]
		int[] arr = new int[]{1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10};
		for(int i : arr){
			A.add(i);
		}


System.out.println(findCount(A, 4));
	}	

	 static int findCount(final List<Integer> A, int B) {
		int index = binarySearch(A, B, 0, A.size()-1);
		int count = 0 ;
		int index1 = index ;

		while(index>-1 && A.get(index)==B){
			count++;
			index--;
		}
		while(index1+1<A.size() && A.get(index1+1)==B){
			count++;
			index1++;
		}
		
		return count;
	 }

	private static int binarySearch(List<Integer> a, int b, int low, int high) {
		if(low >= high) return a.get(low)==b ? low : -1;
		int mid = low + (high-low)/2 ;
		if(a.get(mid)>b){
			return binarySearch(a, b, low, mid);
		}else if(a.get(mid)<b){
			return binarySearch(a, b, mid, high);
		}else{
			return mid;
		}
	}
}
