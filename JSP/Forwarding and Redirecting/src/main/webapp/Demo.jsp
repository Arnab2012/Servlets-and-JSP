<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
It is from Demo
<%-- <jsp:forward page="Forward.jsp"></jsp:forward> --%>
<%-- using scriplet --%>
<%
	//request.getRequestDispatcher("Forward.jsp").forward(request,response);
	
	//now for redirecting
	response.sendRedirect("Redirected.jsp");
%>
</body>
</html>