package testing;

import sorting.BubbleSort;
public class BubbleSortTesting {
	public static void main(String args[]) {
		int array[] = {10,9,8,7,6,5,4,3,2,1};
		BubbleSort bs = new BubbleSort();
		System.out.println("Original Array");
		for(int item : array) {
			System.out.print(item+" ");
		}
		bs.bubbleSort(array);		
		System.out.println("\nSorted Array");
		for(int item : array) {
			System.out.print(item+" ");
		}	
	}
}