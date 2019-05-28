package experiment;

@FunctionalInterface
interface Parent {
	public void print();
	@FunctionalInterface
	interface Inner{
		public void printInner();
	}
}

abstract class Abstract{
	
	abstract void hello();
	
	void thanksForSharing() {
		System.out.println("thanks for sharing.");
	}
	
	void nicePost() {
		System.out.print("nice post ");
	}
}


class ExtendingAbstract extends Abstract{

	@Override
	void hello() {
		System.out.print("hello! ");
	}
	@Override
	void nicePost() {
		System.out.print("bad post ");
	}
	public void comment() {
		hello();
		super.nicePost();
		super.thanksForSharing();
	}
	
}


public class Anonymous {

 public Anonymous(Anonymous anonymous) {
		// TODO Auto-generated constructor stub
	 System.out.println(anonymous);
	}
void eatMemory() {

	      double[] intArray = new double[140000000];

	      for (int i=0; i<140000000; i++) {
	        intArray[i] = i*i*i;
	      }

	}
 String convert(long num) {
	 String sizes[]= {"byte","kb","mb","gb","tb"};
	 int size=0;
	 while(num%1024!=0) {
		 num/=1024;
		 size++;
	 }

	 new Anonymous(this);
	 return size+" "+sizes[size-1];
 }
	public static void main(String args[]) {

		Parent p1 = ()->{
				System.out.println("Hello this is parent interface");
		};
		
		Parent.Inner pi1 = ()-> {
				System.out.println("Hello this is inner interface");
		};
		
		p1.print();
		pi1.printInner();

		ExtendingAbstract a = new ExtendingAbstract();
		a.comment();
		
		Anonymous A = new Anonymous(null);
		Runtime r = Runtime.getRuntime();
		A.eatMemory();
		System.out.println("Free memory before gc()-------->"+A.convert(r.freeMemory()));		
		r.gc();
		System.out.println("Free memory after gc()-------->"+A.convert(r.freeMemory()));
	}
	@Override
	public void finalize() {
		System.out.println("gc() running...");
	}
	
}