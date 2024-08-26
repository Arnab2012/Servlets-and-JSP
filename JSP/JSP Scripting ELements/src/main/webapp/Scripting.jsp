<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Example</title>
</head>
<body>

<%-- Declaration --%>
<%! 
    private int add(int a, int b) {
        return a + b;
    }
%>

<%-- Scriptlet --%>
<%
    int num1 = 5;
    int num2 = 10;
    int result = add(num1, num2);
%>

<%-- Expression --%>
<p>The result of adding <%= num1 %> and <%= num2 %> is: <%= result %></p>

</body>
</html>
