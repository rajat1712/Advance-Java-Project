package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DB_Connection;
import common.User_Bean;

public class Read_Values {
	
	public static void main(String[] args) {
		Read_Values obj=new Read_Values();
		obj.get_values();
	}
	
	public List<User_Bean> get_values() {
             DB_Connection obj=new DB_Connection();
             
             List<User_Bean> list=new ArrayList<User_Bean>();
             
             
		try {
			Connection con=obj.createC();
			String query="select * from user";
			java.sql.Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(query);
			while(set.next()) {
				User_Bean obj1=new User_Bean();
				
				System.out.println(set.getString("s_no"));
				System.out.println(set.getString("user_name"));
				System.out.println(set.getString("email"));
				System.out.println(set.getString("mobile"));
				
				obj1.setS_no(set.getString("s_no"));
				obj1.setUser_name(set.getString("user_name"));
				obj1.setEmail(set.getString("email"));
				obj1.setMobile(set.getString("mobile"));
				
				list.add(obj1);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}
}
