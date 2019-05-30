package ds;

public class Test {
	public static void main(String args[]) {
//		PriorityQueue<String> pq = new PriorityQueue<String>();
//		pq.insert("bhuwan");
//		pq.insert("jatin");
//		pq.insert("navin");
//		pq.insert("raghu");
//		pq.insert("hardik");
//		pq.insert("rajat");
//		pq.insert("priyesh");
//		pq.insert("ashihek");
//		pq.printQueue();
		
		HashTable ht = new HashTable();
		
		ht.add("1st","Ironman");
		ht.add("2nd","Thor");
		ht.add("3rd","Natasha");
		ht.add("4th","Hulk");
		ht.add("5th","Captain America");
		
		
		
//		System.out.println(ht.get("2nd"));
		
		ht.print();
	}
}
