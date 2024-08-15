<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SCRIPTLETS</title>
</head>
<body>
<h1>Hello World</h1>
<%
	int a=10,b=20;
	if(a>b){
		out.println(a);
	}
	else{
		out.println(b);
	}
	int c=a+b;
	out.println(c);
%>
</body>
</html>