package july;

import java.util.ArrayList;
import java.util.Arrays;

public class PRETTYPRINT {

	public static void main(String[] args) {
		//int[][] arr = new int[4][4];
		//printArr(arr);		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		printArrList(arr);
		
		//prettyPrint(arr, 1);
		//prettyPrint(arr, 2);
		prettyPrint(arr, 3);
		printArrList(arr);

		
		
	}

	private static ArrayList<ArrayList<Integer>> prettyPrint(ArrayList<ArrayList<Integer>> arr,int k) {
		if(k==1 || k==0){
			ArrayList<Integer> arr1 = new ArrayList<Integer>();
			arr1.add(k);
			arr.add(arr1);
			return arr;
		}else{
			prettyPrint(arr, k-1);
			for(ArrayList<Integer> a : arr){
				a.add(0, k);
				a.add(k);
			}
			ArrayList<Integer> head = new ArrayList<Integer>();
			ArrayList<Integer> tail = new ArrayList<Integer>();

			for(int i = 0 ;i < arr.get(0).size() ; i++){
				head.add(k);
				tail.add(k);
			}
			arr.add(0, head);
			arr.add(tail);
			return arr;
		}
	}

	private static void printArr(int[][] arr) {
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j <arr[1].length ; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void printArrList(ArrayList<ArrayList<Integer>> arr) {
		for(ArrayList<Integer> a : arr){
			for(int i : a){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
