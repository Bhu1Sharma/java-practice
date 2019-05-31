package ds;

public class Test {
	public static void main(String args[]) {

		HashTable ht = new HashTable();
		try {
			ht.add("1wtygew","Ironman");
			ht.add("1wtygew1wtygew","Thor");
			ht.add("1wtygew1wtygew1wtygew","Natasha");
			ht.add("1wtygewadaf","Hulk");
			ht.add("whrewh","Captain America");
			ht.add("53edt","Black Panther");
			
			System.out.println("ht.get()============>"+ht.get("1wtygew1wtygew1wtygew"));			
		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(ht.toString());
		System.out.println(ht.size());
	}
}
