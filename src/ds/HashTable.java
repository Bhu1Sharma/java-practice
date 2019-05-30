package ds;

public class HashTable{

	private String hashTable[];
	private final int maxSize = 1000000;
	private int hashFunction(String key) {
		int hash =  key.hashCode();
		hash = hash<0?(hash*-1):hash;
		return hash;
	}
	HashTable(){
		this.hashTable = new String[maxSize];
	}
	
	public void add(String key,String item) {
		this.hashTable[hashFunction(key)] = item;		
	}
	public String get(String key) {
		return this.hashTable[hashFunction(key)];
	}
	
	public void print() {
		for(int i=0 ; i<maxSize ; i++) {
			if(this.hashTable[i]!=null) {
				System.out.println(this.hashTable[i]);
			}
		}
	}
}