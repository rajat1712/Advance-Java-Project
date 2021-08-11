package CRUD;


import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DB_Connection;

public class Insertion {
	
	
	public void insert_values(String s_no,String user_name,String email,String mobile) {
		DB_Connection obj=new DB_Connection();
		
		
		try {
			Connection con=obj.createC();
			String query="insert into user(s_no,user_name,email,mobile) values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, s_no);
			pstmt.setString(2, user_name);
			pstmt.setString(3, email);
			pstmt.setString(4, mobile);
			pstmt.executeUpdate();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	
}
