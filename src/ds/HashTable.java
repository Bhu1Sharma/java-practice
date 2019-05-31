package ds;

/*
 * Created by Bhuwan Sharma
 * Implementation of HashTable using linked list and customized hashing function
 * Collision is resolved with the help of chaining
 * This is development version 
*/


// Entry class to store key, value pair
class Entry{
	
	String item;
	String key;
	Entry next;

}

// custom exception class "RuntimeException"
class InvalidKeyFormatException extends Throwable{

	private static final long serialVersionUID = 1L;

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
	
	@Override
	public String getMessage(){
		return "Key sholud not be larger than 26 characters long";
	}
}

// Implementation of HashTable class
public class HashTable{

	private Entry hashTable[];
	private final int initialSize = 100;
	private int size;
	
	// Default constructor
	HashTable(){
		this.hashTable = new Entry[this.initialSize];
		this.size=0;
	}
	
	// Custom size constructor currently not recommended to use and hence deprecated
	@Deprecated
	HashTable(int initialSize){
		this.hashTable = new Entry[initialSize];
		this.size=0;
	}
	
	
	// hashing function to convert key into hashed number
	private int hashFunction(String key) {
		int hash =  key.hashCode();
		int len = key.length();
		hash = hash<0?(hash*-1)%len:hash%len;
		return hash;
	}
	
	
	// add function to add key,value pair to HashTable
	public void add(String key,String item) {
		
		if(key.length()>26 || key=="" || key==null) {
		throw new RuntimeException(new InvalidKeyFormatException());
		}
		int hashKey = hashFunction(key);
		Entry current = this.hashTable[hashKey];
		Entry newNode = new Entry();
		newNode.key = key;
		newNode.item = item;
		newNode.next = null;
		
		if(current==null) {
			this.hashTable[hashKey] = newNode;
		}
		else {
			Entry temp = current;
			
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		this.size++;
	}
	
	// get() function should be provided with key to get its corresponding value
	public String get(String key){
		if(key.length()>26) {
			throw new RuntimeException(new InvalidKeyFormatException());
		}
		int hashKey = hashFunction(key);
		Entry current = hashTable[hashKey];
		if(current==null) {
			return null;
		}
		else {
			Entry temp = current;
			
			while(temp!=null) {
				if(temp.key==key) {
					return temp.item;
				}
				temp = temp.next;
			}
		}
		return null;
	}
	
	public int size() {
		return this.size;
	}
	
	// Overridden toString() method from Object class to convert HashTable object to formatted string
	@Override
	public String toString() {
		String result="";
		for(int i=0 ; i<initialSize ; i++) {
			Entry itr = this.hashTable[i];
			if(itr!=null) {
				String bucket = "("+i+")=>[";
				while(itr!=null) {
					if(itr.next==null)
						bucket+="{ "+itr.key+" : "+itr.item+" }";
					else
						bucket+="{ "+itr.key+" : "+itr.item+" }, ";
					itr = itr.next;
				}
				bucket+="]\n";
				result+=bucket;
			}
		}
		return result;
	}
	
	
}