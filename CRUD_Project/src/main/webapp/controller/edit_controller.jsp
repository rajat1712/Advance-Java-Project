<%@page import="CRUD.Edit_values"%>
<%@page import="common.User_Bean"%>
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
   String s_no=request.getParameter("s_no");
   String user_name=request.getParameter("user_name");
   String email=request.getParameter("email");
   String mobile=request.getParameter("mobile");
   User_Bean obj=new User_Bean();
   obj.setS_no(s_no);
   obj.setUser_name(user_name);
   obj.setEmail(email);
   obj.setMobile(mobile);
   /* out.println(s_no);
   out.println(user_name);
   out.println(email);
   out.println(mobile); */
   
   Edit_values new_obj=new Edit_values();
   new_obj.edit_user(obj);
   
%>
Edited Successfully!
</body>
</html>