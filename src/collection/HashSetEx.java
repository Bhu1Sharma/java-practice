package collection;

import java.util.*;

public class HashSetEx {

	public static void main(String args[]) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(7);
		hs.add(2);
		hs.add(2);
		hs.add(3);
		hs.add(2);
		hs.add(5);
		hs.add(6);
		hs.add(6);
		hs.add(0);
		hs.add(0);
		hs.add(2);
		hs.add(2);
		for(Integer item : hs) {
			System.out.printf("%d   ",item);
		}
	}
}
