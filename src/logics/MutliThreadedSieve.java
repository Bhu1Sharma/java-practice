package logics;


public class MutliThreadedSieve {

    public static void main(String[] args){
    	Threaded task = new Threaded();
    	LinkedList primes = task.getPrimes(200000);
	     try {Thread.sleep(10);}catch(Exception e) {}
	     primes.print();

       	}
}

class Node{
	long item;
	Node next;
}
class LinkedList{
	LinkedList(){
		this.size = 0;
	}
	private int size;
	Node head;
	public void add(long item) {
		Node temp = new Node();
		temp.item = item;
		temp.next=null;
		if(head==null) {
			head = temp;
		}
		else {
			Node itr = head;
			while(itr.next!=null) {
				itr = itr.next;
			}
			
			itr.next = temp;
		}
		size=size+1;
	}
	public void print() {
		if(head==null) {
			return;
		}
		Node temp = new Node();
		temp = head;
		while(temp!=null) {
			System.out.print(temp.item+" ");
			temp = temp.next;
		}
	}
	
	public int size() {
		return this.size;
	}
}

class Threaded{
	private double convertNanoToSec(double nano) {
    	return (double)(nano/(Math.pow(10,9)));
	}
	public LinkedList getPrimes(long range){
		double time = System.nanoTime();
		LinkedList primes = new LinkedList();
		if(range>=2) {
			primes.add(2);			
		}
		 new Thread(()->{
		        for(long i=3 ; i<=range/2 ; i++){
		            boolean flag = true;
		            for(long j=2 ; j<=Math.sqrt(i)+1 ; j++){
		                if(i%j==0){
		                    flag = false;
		                    break;
		                }    
		            }
		            if(flag){
		                primes.add(i);
		           }
		            

		        }
		      }).start();
		      new Thread(()->{
		        for(long i=(range/2)+1 ; i<=range ; i++){
		            boolean flag = true;
		            for(long j=2 ; j<=Math.sqrt(i)+1 ; j++){
		                if(i%j==0){
		                    flag = false;
		                    break;
		                }    
		            }
		            if(flag){
		                primes.add(i);
			       }
		        }
		      }).start();
		      
		     time = convertNanoToSec(
		    		 System.nanoTime()-
		    		 time
		    		 );
		      System.out.println(
		    		  "Time taken by function => "+
		    				  time+
		    				  " seconds"
		      );
		return primes;
	}
	
}

