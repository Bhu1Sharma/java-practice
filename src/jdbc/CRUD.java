package jdbc;

import java.sql.*;

public class CRUD{
	
	private Connection connection;
	
	CRUD(String connectionUrl,String userName,String password){
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			
			this.connection=DriverManager.getConnection(
					connectionUrl,
					userName,
					password
					);

		}
		catch(Exception e) {
			e.printStackTrace();
			try {
				System.out.println("Closing connection.....");
				this.connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
				System.out.println("Error while closing connection....");
			}
		}
	}

	public int create(String table,String id,String name,String email) throws SQLException{
		
		String QUERY = "insert into "+table+" values("+"?,?,?"+");";
		
		PreparedStatement createUser = connection.prepareStatement(QUERY);
		
		createUser.setString(1, id);
		createUser.setString(2, name);
		createUser.setString(3, email);
		
		return createUser.executeUpdate();

	}
	
	public void close() throws SQLException {
			this.connection.close();
	}

}
