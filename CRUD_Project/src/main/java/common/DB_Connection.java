package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
	public static void main(String[] args) {
		DB_Connection obj=new DB_Connection();
		System.out.println(obj.createC());
	}
	
	
	public Connection createC(){
		Connection con=null;
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			String user="root";
			String password="Rajat@125";
			String url="jdbc:mysql://localhost:3306/jsp_crud";
			
			con=DriverManager.getConnection(url, user, password);
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
}
