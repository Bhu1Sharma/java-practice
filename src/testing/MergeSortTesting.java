package testing;

import sorting.MergeSort;

public class MergeSortTesting {
	public static void main(String[] args) {
		int array[] = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		System.out.println("Original Array");
		for(int item : array) {
			System.out.print(item+" ");
		}
		MergeSort ms = new MergeSort();
		ms.mergeSort(array);
		System.out.println("\nSorted Array");
		for(int item : array) {
			System.out.print(item+" ");
		}		
	}
}
