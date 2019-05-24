package experiment;


class Base{
	
	Base(){
		this("Bhuwan");
		System.out.println("default Base()");
	}
	
	Base(String name){
		System.out.println("parametrized Base() : "+name);
	}

}


class Child extends Base{
	
	Child(){	
		this("Bhuwan");
		System.out.println("default Child()");
	}
	
	Child(String name){
		super();
		System.out.println("parametrized Child() : "+name);
	}
	
}

public class ConstructorChaining extends Child{
	
	public static void main(String args[]) {
		new Child();	
	}
	
}
