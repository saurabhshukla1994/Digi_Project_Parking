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
<h2> For book your Slot fill the form </h2>

<form action="" method="post">
			<label for="parkingid"> ParkingId:<input type="text" name="parkingid" id="parkingid">
			</label> 
			<br><br> 
			
			 
			 <label for="floor">Floor:</label>
  <select name="floor" id="floor">
    <option>1st-A</option>
    <option>1st-B</option>
    <option>1st-C</option>
    <option>1st-D</option>
    <option>2nd-A</option>
    <option>2nd-B</option>
    
  </select>
  <br><br>
  
   <label for="vehicle_type">Vehicle Type:</label>
  <select name="vehicle_type" id="vehicle_type">
    <option>2-Wheeler</option>
    <option>4-Wheeler</option>
    
    
  </select>
  <br><br>
  <label for="vehicle_number"> Vehicle-Number:<input type="text" name="vehicle_number" id="vehicle_number">
			</label> 
  
  
  
			  <br><br>
			 
			 <label> <input type="submit" value="submit">
			</label>
			

</form>
</center>
</body>
</html>