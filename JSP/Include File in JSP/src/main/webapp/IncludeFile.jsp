<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- for including static content use directive --%>
<%@ include file="file1.txt" %>
<br>
<%-- for including dynamic content --%>
<jsp:include page="file2.txt"></jsp:include>

<br>
<%-- import --%>
<%@ page import="java.util.Date,com.include.Demo" %>
<%@ page import="com.include.Demo" %>

<%
	out.println(Demo.demo());
%>
<br>
<%= new Date() %>
<br>
<%--<% out.println(new Date()); --%>
</body>
</html>