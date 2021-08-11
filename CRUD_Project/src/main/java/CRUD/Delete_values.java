package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import common.DB_Connection;
import common.User_Bean;

public class Delete_values {
	
	public void delete_value(String s_no) {
        DB_Connection obj=new DB_Connection();
      
	try {
		Connection con=obj.createC();
		String query="delete from user where s_no=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, s_no);
		pstmt.executeUpdate();
	}
	catch (Exception e){
		e.printStackTrace();
	}
  }
}
