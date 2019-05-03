package may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author dbuch
 * test commit
 *
 *         973. K Closest Points to Origin Medium
 * 
 *         333
 * 
 *         38
 * 
 *         Favorite
 * 
 *         Share We have a list of points on the plane. Find the K closest
 *         points to the origin (0, 0).
 * 
 *         (Here, the distance between two points on a plane is the Euclidean
 *         distance.)
 * 
 *         You may return the answer in any order. The answer is guaranteed to
 *         be unique (except for the order that it is in.)
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: points = [[1,3],[-2,2]], K = 1 Output: [[-2,2]] Explanation:
 *         The distance between (1, 3) and the origin is sqrt(10). The distance
 *         between (-2, 2) and the origin is sqrt(8). Since sqrt(8) < sqrt(10),
 *         (-2, 2) is closer to the origin. We only want the closest K = 1
 *         points from the origin, so the answer is just [[-2,2]]. Example 2:
 * 
 *         Input: points = [[3,3],[5,-1],[-2,4]], K = 2 Output: [[3,3],[-2,4]]
 *         (The answer [[-2,4],[3,3]] would also be accepted.)
 * 
 */
public class ShortestPointsToOrigin {

	public static void main(String[] args) {
		kClosest(new int[][] { { -5, 4 }, {-6, -5 }, { 4, 6 } }, 2);
		kClosest(new int[][] { { 3, 3 }, { 5, -1 }, { -2, 4 } }, 2);
		kClosest(new int[][]{{-458,-189},{-675,-87},{-418,851},{-627,-221},{-303,1000},{-912,-422},{619,-821},{-252,-573},{-807,68},{-397,161},{556,-177},{536,-389},{-5,-665},{680,188},{55,-192},{785,-906},{689,51},{764,239},{-452,-970},{-948,-380},{574,-54},{512,-816},{626,707},{518,-892},{99,991},{540,286},{-294,403},{995,174},{-50,-293},{387,173},{850,181},{946,-709},{-375,-392},{-759,-475},{-736,-851},{-666,-937},{518,-538},{-71,-221},{606,-485},{-892,398},{456,-854},{-295,406},{-632,316},{207,707},{254,928},{-362,-720},{-291,352},{370,-377},{42,655},{-313,992}},22);
	}

	static int[][] kClosest(int[][] points, int K) {
		ArrayList<Cartesian> a = new ArrayList<>();
		for (int[] i : points) {
			a.add(new Cartesian(i[0], i[1]));
		}

		Collections.sort(a);
		int[][] arr = new int[K][2];

		for(int i =0 ; i < K ; i++){
			arr[i] = new int[]{a.get(i).x,a.get(i).y};
		}
		return arr;
	}

	static class Cartesian implements Comparable<Cartesian> {
		int x;
		int y;

		Cartesian(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Cartesian o) {
			Double oSum =  Math.sqrt(Math.pow(o.x, 2) + Math.pow(o.y, 2));
			Double thisSum = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
			if (oSum > thisSum)
				return -1;
			else if (oSum < thisSum)
				return 1;
			else
				return 0;
		}
		
		public String toString(Cartesian o){
			return "["+o.x + ", " + o.y + "] ";
		}
	}
}
