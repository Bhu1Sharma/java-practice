package logics;

public class Search{

	private int compare(int item1,int item2){
		if(item1==item2) {
			return 0;
		}
		else if(item1<item2) {
			return 1;
		}
		else {
			return -1;
		}
	}
	private void printArray(int array[],int start,int end){
		for(int i=start ;i<=end ; i++) {
			System.out.printf("%d " ,array[i]);
		}
		System.out.println();
	}
	private int bSearch(int[] array,int item, int first ,int last) {
		int mid = (first+last)%2==0?(first+last)/2:(first+last+1)/2;
		if(first<last && first<mid &&last>mid) {
			int res = compare(item, array[mid]);
			if(res==0) {
				return mid;
			}
			else if(res>0){
				printArray(array,first,mid);
				bSearch(array,item,first,mid);
			}
			else if(res<0){
				printArray(array,mid+1,last-1);
				bSearch(array,item,mid+1,last);
			}
		}
		return -1;
	}
	
	public int binarySearch(int[] array, int item){
		int last = array.length;
		int first = 0;
		return bSearch(array,item,first,last);
	}
	

}
