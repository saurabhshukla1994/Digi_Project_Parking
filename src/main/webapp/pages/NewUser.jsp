<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>





</head>
<body>
<center>
	<div>
		<h2>
			Register Here
		</h2>


		<form action="/register" method="post">
			<label for="name"> NAME:<input type="text" name="name" id="name">
			</label> 
			<br><br> 
			<label for="email"> EMAIL ID:<input type="text" name="email" id="email">
			</label> 
			<br><br>
			 <label for="pass"> PASSWORD:<input type="password" name="password" id="pass">
			 </label>
			 <br><br>
			 <label for="city"> CITY:<input type="text" name="city" id="city">
			 </label>
			 <br><br>
			 <label for="contact"> Contact:<input type="text" name="contact" id="contact">
			 </label>
			 <br><br>
			 
			 <label for="field">Choose a field:</label>
  <select name="field" id="field">
    <option value="Admin" disabled="disabled">Admin</option>
    <option value="User">User</option>
    
  </select>
			 
			 
			 <label> <input type="submit" value="submit">
			</label>
			</form>
	</div>
	</center>
</body>
</html>