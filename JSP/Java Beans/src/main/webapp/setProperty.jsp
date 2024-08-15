<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>set Property</title>
</head>
<body>
<jsp:useBean id="user" class="com.arnab.beans.Demo" scope="request"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Ayan"/><br>
<jsp:setProperty property="lastName" name="user" value="Das"/>
Value set successfully
<%
request.getRequestDispatcher("getProperty.jsp").forward(request,response);
%>

</body>
</html>