package dharmam.sample.algorithm;

import junit.framework.TestCase;

public class HeapSortTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testHeapsort() {
		int arr[] = {0,12,5,11,3,10,17,9,18,8,1,7,2,16,15,6,4,20,19,14,2};
		System.out.print("Initial Array is :");
		HeapSort.show(arr);
		HeapSort.heapsort(arr);
	}

}
