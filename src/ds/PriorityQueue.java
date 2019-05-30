package ds;

class PriorityQueueNode<T>{
	T data;
	int priority;
	PriorityQueueNode<T> next;
}

public class PriorityQueue<T> {

	PriorityQueueNode<T> head;
	
	private int size = 0;
	
	public void insert(T data) {
		PriorityQueueNode<T> node = new PriorityQueueNode<T>();
		node.data = data;
		if(head==null) {
			head = node;
			head.next = null;
		}
		else {
			PriorityQueueNode<T> temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
	
			temp.next = node;
		}
		this.size++;
	}
	
	public void insert(T data, int priority)  {
		PriorityQueueNode<T> node = new PriorityQueueNode<T>();
		node.priority = priority;
		node.data = data;
		
		if(head==null) {
			head = node;
			head.next = null;
		}
		else {
			PriorityQueueNode<T> temp = head;
			while(temp.next!=null) {
				if(priority<=temp.priority) {
					break;
				}
				temp = temp.next;
			}
			if(temp.next==null) {
				temp.next = node;
				System.out.println("if");
			}
			else {
				PriorityQueueNode<T> remainingNodes = temp.next;
				node.next = remainingNodes;
				temp.next = node;
			}
		}		
		this.size++;
	}
	
	public int size() {
		return this.size;
	}

	public void printQueue() {
		String printFormat = "%-15s%-15s%-15s\n";
		PriorityQueueNode<T> temp = head;
		System.out.printf(printFormat+"\n","Data","Priority","Next");
		while(temp!=null) {
			System.out.printf(
					printFormat,
					temp.data,
					temp.priority==0?"default":Integer.toString(temp.priority),
					temp.next==null?null:temp.next.data
					);
			temp = temp.next;
		}
	}
	
}