<%@page import="CRUD.Delete_values"%>
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
   Delete_values obj=new Delete_values();
   obj.delete_value(s_no);
   
%>
</body>
</html>