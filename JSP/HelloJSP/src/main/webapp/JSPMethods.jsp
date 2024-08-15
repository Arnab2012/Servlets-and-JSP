<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>METHODS</title>
</head>
<body>
	<%!
		int c=0;
		int count(int n){
			if(n==0)return c;
			c++;
			return count(n/10);
	}
	%>
	<%-- for calling the function use expression/scriptlets --%>
	<%
		int a=1205;
		int c=count(a);
		out.println("Number of digits in "+a+" is "+c);
	%>
</body>
</html>