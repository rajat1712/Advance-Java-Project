package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DB_Connection;
import common.User_Bean;

public class Edit_values {
	
	
	
	
	public User_Bean get_value_of_user(String s_no) {
        DB_Connection obj=new DB_Connection();
        
        User_Bean obj1=new User_Bean();
        
        
	try {
		Connection con=obj.createC();
		String query="select * from user where s_no=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, s_no);
		ResultSet set=pstmt.executeQuery();
		while(set.next()) {
			
			
			/*
			 * System.out.println(set.getString("s_no"));
			 * System.out.println(set.getString("user_name"));
			 * System.out.println(set.getString("email"));
			 * System.out.println(set.getString("mobile"));
			 */
			
			obj1.setS_no(set.getString("s_no"));
			obj1.setUser_name(set.getString("user_name"));
			obj1.setEmail(set.getString("email"));
			obj1.setMobile(set.getString("mobile"));
			
			/* list.add(obj1); */
		}
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return obj1;
  }
	
	
	
	public void edit_user(User_Bean obj_user_bean) {
        DB_Connection obj=new DB_Connection();
        
        User_Bean obj1=new User_Bean();
        
        
	try {
		Connection con=obj.createC();
		String query="update user set user_name=?, email=?, mobile=? where s_no=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, obj_user_bean.getUser_name());
		pstmt.setString(2, obj_user_bean.getEmail());
		pstmt.setString(3, obj_user_bean.getMobile());
		pstmt.setString(4, obj_user_bean.getS_no());
		pstmt.executeUpdate();
	}
	catch (Exception e){
		e.printStackTrace();
	}
  }
	
	
	
	
	
}
