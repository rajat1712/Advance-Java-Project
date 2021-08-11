<%@page import="java.util.Iterator"%>
<%@page import="common.User_Bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.Read_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
 <h1>Insert Values</h1>
  <form action="controller/insert_controller.jsp">
  
     SNo : <input type="text" name="s_no"><br>
     User Name : <input type="text" name="user_name"><br>
     Email: <input type="text" name="email"><br>
     Mobile: <input type="text" name="mobile"><br>
   
   <input type="submit" value="Insert">
  </form>




<hr>
  
  <%
      Read_Values obj=new Read_Values();
      List<User_Bean> list=obj.get_values();
      
      Iterator<User_Bean> it=list.iterator();
      
  %>
  
  <table border="1">
  
  <%
     while(it.hasNext()){
    	 User_Bean obj_User_Bean=new User_Bean();
    	 obj_User_Bean=it.next();
    %>
    
    
    	 <tr>
    	 <td><%=obj_User_Bean.getS_no() %></td>
    	 <td><%=obj_User_Bean.getUser_name() %></td>
    	 <td><%=obj_User_Bean.getEmail()%></td>
    	 <td><%=obj_User_Bean.getMobile() %></td>
    	 <td>
    	 <a href="edit.jsp?s_no=<%=obj_User_Bean.getS_no()%>">Edit</a>
    	 </td>
    	 <td>
    	 <a href="controller/delete_controller.jsp?s_no=<%=obj_User_Bean.getS_no()%>">Delete</a>
    	 </td>
    	 
    	 </tr>
<%
     }
  %>
  </center>
</table>
</body>
</html>







