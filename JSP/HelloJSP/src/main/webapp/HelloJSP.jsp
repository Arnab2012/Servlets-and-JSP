<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
<h1>Hello JSP</h1>

<%-- Expression (expression calculate/ method/date display)--%>
<%= new java.util.Date() %> <%-- printing the date --%>
<br/>
<%-- Declaration --%>
<%! public int x=25; %>
<%= x %>
</body>
</html>