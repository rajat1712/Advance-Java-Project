<%@page import="CRUD.Insertion"%>
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
   
   /* out.println(s_no);
   out.println(user_name);
   out.println(email);
   out.println(mobile); */
   
   Insertion obj=new Insertion();
   obj.insert_values(s_no, user_name, email, mobile);
   
%>
Inserted Successfully!
</body>
</html>