package logics;

public class Test {
	public static void main(String args[]) {
		Search s = new Search();
		int items[] = {1,2,3,4,5,6,7,8,9,10};
		int item = 7;
		int index = s.binarySearch(items, item);
		System.out.printf("index of %d is %d",item,index);
	}
}