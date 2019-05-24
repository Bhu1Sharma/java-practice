package experiment;

import experiment.Console;

public class EnumExample {

	static enum Color {
		RED,
		GREEN,
		BLUE;		
		public void printColor(Color c) {
			System.out.println("its "+c+" color");
		}
	}
	
	public static void main(String args[]) {
		Color c[]=Color.values();
//	
//		Color colors[] = Color.values();
//		System.out.println("data in enum => ");
//				for(Color color : colors) {
//					System.out.print(color+" ");
//				}
//				
//		switch(c) {
//			case RED: System.out.println("Its RED");
//				break;
//			case GREEN: System.out.println("Its GREEN");
//				break;
//			case BLUE: System.out.println("Its BLUE");
//				break;
//			default: System.out.println("none of colors declared");
//				break;
//		}
//		
//		c.printColor(Color.RED);
		
		Console.log(c);
	}
	
}
