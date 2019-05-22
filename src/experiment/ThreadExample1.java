package experiment;


class Thread1 extends Thread{
	
	int array[] = null;
	Thread1(int array[]){
		this.array=array;
	}
	int sum=0;
	
	@Override
	public void run() {
		for(int i=0 ; i<this.array.length ; i++) {
			try { Thread.sleep(500); }catch(Exception e) {}
			this.sum+=this.array[i];
		}
		System.out.println("Sum is => "+this.sum);
	}
	
}



class Thread2 extends Thread{
	
	int array[]= null;
	int product=1;
	Thread2(int array[]){
		this.array=array;
	}
	
	@Override
	public void run() {
		for(int i=0 ; i<this.array.length ; i++) {
			try { Thread.sleep(500); }catch(Exception e) {}
			this.product*=this.array[i];
		}
		System.out.println("Product is => "+this.product);
	}
}



public class ThreadExample1 {
	
	public static void main(String args[]) {
		int array[] = new int[10];
		for(int i=1 ; i<=10 ; i++) {
			array[i-1]=i;
		}
		Thread1 add= new Thread1(array);
		Thread2 multiply= new Thread2(array);
		add.start();
		multiply.start();
	}
	
}
