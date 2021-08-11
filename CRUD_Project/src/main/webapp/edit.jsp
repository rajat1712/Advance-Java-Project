<%@page import="common.User_Bean"%>
<%@page import="CRUD.Edit_values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
    String s_no=(String)request.getParameter("s_no");
    Edit_values obj=new Edit_values();
    User_Bean obj_user_bean=obj.get_value_of_user(s_no);
%>

 <center>
 <h1>Edit Values</h1>
  <form action="controller/edit_controller.jsp">
  
     SNo : <input type="text" name="s_no" value="<%=s_no%>"><br>
     User Name : <input type="text" name="user_name" value="<%=obj_user_bean.getUser_name()%>"><br>
     Email: <input type="text" name="email" value="<%=obj_user_bean.getEmail()%>"><br>
     Mobile: <input type="text" name="mobile" value="<%=obj_user_bean.getMobile()%>"><br>
   
   <input type="submit" value="Edit">
  </form>
 </center>
</body>
</html>