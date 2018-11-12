package june;

import java.util.ArrayList;


public class Array2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
						
		arr.add(1967513926);
		arr.add(1540383426);
		arr.add(-1303455736);
		arr.add(-521595368);
		
		maxset(arr);
	}

	static public ArrayList<Integer> maxset(ArrayList<Integer> A) {
	        boolean accumFull = false ;
	        Integer accumSum = 0  ;
	        ArrayList<Integer> accum = new ArrayList<>();
	        ArrayList<Integer> result = new ArrayList<>();
	        Integer resultSum = 0 ;

	        for(Integer i : A){
	            if(i<0){
	                accumFull = true;
	            }
	            if(!accumFull){
	                accum.add(i);
	                accumSum+=(i%1000000007);
	            }else{
	                if(accumSum >= resultSum && accum.size() > 0) {
	                    result.clear();
	                    result = new ArrayList<>(accum);
	                    resultSum = accumSum ;
	                }
	                accum.clear();
	                accumSum = 0;
	                accumFull = false;

	            }
	        }
	        
	        return result ;
	    }
	 
}
