<%@ page isErrorPage="true" %> 
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <p><strong>Error Details:</strong></p>
    <pre>
        <%= exception %>
    </pre>
    
    <p><strong>Stack Trace:</strong></p>
    <pre>
        <%
            exception.printStackTrace(new java.io.PrintWriter(out));
        %>
    </pre>
</body>
</html>
