package experiment;
import java.util.Date;
public class ThreadExample1 {
	
	public static void main(String args[]) {
		
		new Thread(()->{
			for(int i=0 ; i<5 ; i++) {
				try { Thread.sleep(500); }catch(Exception e) {}
				System.out.println("task1");
			}
		}).start();
		
		new Thread(()-> {
			for(int i=0 ; i<5 ; i++) {
				try { Thread.sleep(500); }catch(Exception e) {}
				System.out.println("task2");
			}
		}).start();
		
		System.out.println("date: "+new Date());
	}
	
}