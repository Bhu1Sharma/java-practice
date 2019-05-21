package sorting;

public class MergeSort{
	
	public void mergeSort(int array[]) {
		int len = array.length-1;
		
		sort(array,0,len);
	}
	
	private final void merge(int array[], int left, int middle, int right) {
		int i=0,j=0,k;
		int len1 = middle-left+1;
		int len2 = right-middle;
		int lArray[] = new int[len1];
		int rArray[] = new int[len2];
			
			for(i=0 ; i<len1 ; ++i ) {
				lArray[i] = array[left+i];
			}
			for(j=0 ; j<len2 ; ++j) {
				rArray[j] = array[middle+1+j];
			}
			i=0;j=0;k=left;
			while(i<len1 && j<len2) {
				if(lArray[i]<=rArray[j]) {
					array[k] = lArray[i];
					i++;
				}
				else {
					array[k] = rArray[j];
					j++;
				}
				k++;
			}
			
			while(i<len1) {
				array[k] = lArray[i];
				i++;
				k++;
			}
			
			
			while(j<len2) {
				array[k] = rArray[j];
				j++;
				k++;
			}
	}
	
	private final void sort(int array[],int left,int right) {
		if(left<right) {
			
		int middle = (left+right)/2;
		
		sort(array,left,middle);
		sort(array,middle+1,right);
		
		merge(array,left,middle,right);
		
		}
	}
}
