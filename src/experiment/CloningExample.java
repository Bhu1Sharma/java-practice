package experiment;

class Details implements Cloneable{
	
	String name;
	int age;
	static int noofobjects=0;
	
	Details(String name, int age){
		this.name = name;
		this.age = age;
		noofobjects++;
	}
	
	
	public void print() {
		System.out.printf("{{name : %s},{age : %d}}\n",this.name,this.age);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class CloningExample {
	
	public static void main(String args[]) {
		Details user1 = new Details("Bhuwan",23);
		Details user1_copy=null;
		try {			
			user1_copy = (Details) user1.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}

		
		user1.name = "Bhuwan new";
		System.out.println("user1");
		user1.print();

		System.out.println("\nuser1_copy");
		user1_copy.print();
		
		System.out.print("\nNumber of objects created--------> "+Details.noofobjects);
		
	}
}
