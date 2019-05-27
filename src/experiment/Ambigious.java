package experiment;

interface A{
	public void print();
	default public void printing() {}
}

class B{
	public void print() {
		System.out.println("B class");
	}
}


public class Ambigious extends B implements A{

	@Override
	public void print(){
		System.out.println("Ambigiuos class");
	}

	public static void main(String args[]) {
		new Ambigious().print();
	}
	
}