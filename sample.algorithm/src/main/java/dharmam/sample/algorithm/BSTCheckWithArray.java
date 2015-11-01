package dharmam.sample.algorithm;

public class BSTCheckWithArray {

	public static void main(String[] args) {
		int[] arr = {100,50,35,65,20,-1,60,75,10,25,-1,-1,58,63,-1,80,8,-1,23,27,-1,-1,-1,-1,55,59,62,64,-1,-1,79,81};
		int[] arr1 = {100,50,35,65,20,-1,60,75,10,25,-1,-1,58,63,-1,80,8,-1,23,27,-1,-1,-1,-1,55,56,62,64,-1,-1,79,81};
		boolean res = checkIfBST(arr);
		if(res)System.out.println("Array 1 is not an BST.");
		else System.out.println("Array 1 is a BST");

		boolean res1 = checkIfBST(arr1);
		if(res1)System.out.println("Array 2 is not an BST.");
		else System.out.println("Array 2 is a BST");

	}

	private static boolean checkIfBST(int[] arr) {
		int len = arr.length;
		int i = 1;
		boolean count = false;
		while((2*i+1)<len)
		{
			if(arr[i]== -1)
			{
				i++;
			}
			else if((arr[i] > arr[2*i]||arr[2*i] ==-1) && (arr[i] < arr[2*i+1]||arr[2*i+1] ==-1))
			{
				i++;
			}
			else
			{
				count = true;
				break;
			}

		}

		return count;


	}

}
