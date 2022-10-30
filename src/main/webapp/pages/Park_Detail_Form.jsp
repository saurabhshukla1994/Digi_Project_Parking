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
			Fill here Parking details
		</h2>


		<form action="/parkinfo" method="post">
			<label for="floor"> Floor:<input type="text" name="floor" id="floor">
			</label> 
			<br><br> 
			<label for="vehicle_type"> Vehicle-Type:<input type="text" name="vehicle_type" id="vehicle_type">
			</label> 
			<br><br>
			 <label for="avl_slot"> Available Slot:<input type="text" name="avl_slot" id="avl_slot">
			 </label>
			 <br><br>
			 <label for="booked_slot"> Booked-Slot:<input type="text" name="booked_slot" id="booked_slot">
			 </label>
			 <br><br>
			 
			 
			 
			 
			 
			 <label> <input type="submit" value="submit">
			</label>
			</form>
	</div>
	</center>
</body>
</html>