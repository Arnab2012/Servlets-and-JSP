<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
Name: <%= request.getParameter("name") %><br>
Gender: <%= request.getParameter("gender") %><br>
Languages: <% 
String[]language=request.getParameterValues("language");
for(int i=0;i<language.length;i++){
	out.println(language[i]);
}
%><br>
Country: <%= request.getParameter("country") %><br>
</body>
</html>