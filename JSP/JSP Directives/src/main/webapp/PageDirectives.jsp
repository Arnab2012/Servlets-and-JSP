<%-- attribute - buffer --%>
<%-- <%@ page buffer="50kb" %> --%>

<%-- attribute - isErrorPage --%>
<%-- <%@ page errorPage="error.jsp" %> --%>

<%-- attribute - session --%> 
<%-- <%@ page session="true" %> --%>

<%-- attribute - isThreadSafe --%>
<%-- <%@ page isThreadSafe="true" %> --%>

<%-- attribute - isELIgnored --%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Example</title>
</head>
<body>
    <!-- EL expressions will be ignored -->
    <p>EL Expression: ${2+4} will not be evaluated.</p>
</body>
</html>
