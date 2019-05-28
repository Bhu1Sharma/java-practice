package jdbc;


public class Test {

	
	public static void main(String args[]) {

		String CONNECTION_URL = "jdbc:mysql://localhost:3306/bhuwan_test";
		String USER_NAME = "root";
		String PASSWORD="1";
		
		String tableName = "userDetails";

		String id = "bh1";
		String name = "Bhuwan Sharma";
		String email = "bhuwan.sharma@daffodilsw.com";
		CRUD c = new CRUD(CONNECTION_URL,USER_NAME,PASSWORD);
		try {
			int recordsUpdated = c.create(tableName,id,name,email);
			System.out.println("records updated => "+recordsUpdated);
			
			c.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
