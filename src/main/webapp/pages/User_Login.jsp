<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Wecome to User Portal </h2>
<p>Login to your account</p>
<form action="/logedin" method="post">
Email:<input type="text" name="email">
<br><br>
Password:<input type="password" name="password">
<br><br>
<input type="submit" name="submit">

</form>


</body>
</html>