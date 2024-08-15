<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action="Submit.jsp" method="post">
	Full Name:<input type="text" name="name" required/><br>
	Gender:<input type="radio" name="gender" value="male" checked> Male
			<input type="radio" name="gender" value="female"> Female<br>
	Languages Known:<input type="checkbox" name="language" value="Bengali">Bengali
					<input type="checkbox" name="language" value="English">English
					<input type="checkbox" name="language" value="Hindi">Hindi<br>
	Country:<select name="country">
		<option value="India">India</option>
		<option value="America">America</option>
		<option value="Bangladesh">Bangladesh</option>
	</select><br>
	<input type="submit" value="Submit">
</form>
</body>
</html>