package dharmam.sample.algorithm;
import java.util.Scanner;

public class TertiarySearch {

	static int[] arr =   {1,2,3,4,5,6,7,8,9,10};
	//new int[10];
	//= {1,2,3,4,5,6,7,8,9};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("\nEnter 10 sorted integer elements");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();*/

		System.out.println("Please enter the number to be searched.");

		int num = sc.nextInt();
		sc.close();
		int first = 0 ;
		int last = arr.length-1;

		search(num,first,last);
	}

	private static void search(int i, int f, int l) {

		{
			if(f>l) 
			{
				System.out.println("Key not found.");
			}

			else
			{
				int mid1 =f+ (l-f)/3;
				int mid2 =f+ 2*(l-f)/3;
				if (i==arr[mid1] || i==arr[mid2])
				{
					System.out.println("Key has been found.");
				}

				else if(i < arr[mid1])
				{
					System.out.println("Checking the first part.");
					search(i,f,mid1-1);
				}

				else if (i > arr[mid2])
				{
					System.out.println("Checking the third part.");
					search(i,mid2+1,l);
				}
				else 
				{
					System.out.println("Checking the second part.");
					search(i,mid1,mid2);
				}
			}

		}


	}
}
