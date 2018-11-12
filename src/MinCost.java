public class MinCost {

	public static void main(String args[]){
		System.out.println(minCostClimbingStairs(new int[]{0,0,1,0}));
		System.out.println(minCostClimbingStairs(new int[]{0,0,1,1}));
		System.out.println(minCostClimbingStairs(new int[]{0,1,1,0}));
		System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
		System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));

		
		System.out.println(minCostClimbingStairs1(new int[]{0,0,1,0}));
		System.out.println(minCostClimbingStairs1(new int[]{0,0,1,1}));
		System.out.println(minCostClimbingStairs1(new int[]{0,1,1,0}));
		System.out.println(minCostClimbingStairs1(new int[]{10, 15, 20}));
		System.out.println(minCostClimbingStairs1(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
	}

	static int minCostClimbingStairs(int[] cost) {

		int sum = 0 ;
		int i = 0 ;
		
		while(i+2<cost.length){
			if(sum+cost[i+1] < sum+cost[i+2]){
				sum+=cost[i+1];
				i+=1;
			}
			else{
				sum+=cost[i+2];
				i+=2;
			}
		}
		System.out.print("i : " + i + " cost.length : " + cost.length + " sum : ");
		return  i+2==cost.length ? Math.min(cost[cost.length-1], cost[cost.length-2]) : sum;

	}
	
	
	static int minCostClimbingStairs1(int[] cost) {
        for(int i=2; i<cost.length; i++)
            cost[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }
}
