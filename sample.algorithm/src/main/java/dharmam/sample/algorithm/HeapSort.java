package dharmam.sample.algorithm;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = {0,12,5,11,3,10,17,9,18,8,1,7,2,16,15,6,4,20,19,14,2};
		System.out.print("Initial Array is :");
		show(arr);
		heapsort(arr);

	}

	private static void heapsort(int[] arr) {
		int[] arr1 = new int[arr.length];
		for(int i = 0; i < arr.length ; i++)
		{
			for (int j = (arr.length-1)/2;  j >0 ; j--)
			{
				heapify(arr,j);
			}
			System.out.print("After "+i+" pass of heapify : ");
			System.out.println();
			int j = 1;
			while(j<arr.length-i)
			{
				System.out.print(arr[j]+ " ");
				j++;
			}
			System.out.println();
			arr1[i]=arr[1];
			int temp=arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[1];
			arr[1] = temp;
			arr[arr.length-1-i] = -1 ;

		}
		System.out.println();
		System.out.println("Heap Sorting Completed Array is : ");
		for(int i = 0; i<=arr1.length-2;i++)
		{System.out.print(arr1[i]+ " ");}

	}

	private static void show(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println();
		while(i<arr.length)
		{
			System.out.print(arr[i]+ " ");
			i++;
		}
		System.out.println();
	}

	private static void heapify(int[] arr, int node) {
		// TODO Auto-generated method stub
		boolean isSwapped= false;
		int largest = 0;


		if(node >= arr.length/2){return;}
		else{
			if (node >0)
			{
				if(2*node+1 < arr.length)
				{
					if(arr[node] <= arr[2*node] && arr[node] <= arr[2*node +1])
					{
						largest = (arr[2*node]>arr[2*node+1] ? arr[2*node] : arr[2*node+1]);
						if(largest == arr[2*node]) arr[2*node] = arr[node];
						else arr[2*node+1] = arr[node];
						arr[node] = largest;
						isSwapped = true;
					}

					else if(arr[node] <= arr[2*node +1])
					{
						largest = arr[2*node+1];
						arr[2*node+1] = arr[node];
						arr[node] = largest;
						isSwapped = true;
					}
				}
				if(arr[node] <= arr[2*node] && largest == 0 )
				{
					largest = arr[2*node];
					arr[2*node] = arr[node];
					arr[node] = largest;
					isSwapped = true;
				}
				if(isSwapped)heapify(arr, 2*node);
				if(isSwapped)heapify(arr, 2*node+1);

			}
		}
	
	}

}
