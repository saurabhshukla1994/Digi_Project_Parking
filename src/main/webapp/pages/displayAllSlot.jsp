<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>

</head>
<body>

<h2>Information of parking slots is given below:-</h2>
<br><br>
<table style="width:100%">
  <tr>
    <th>ParkingId</th>
    <th>Floor</th>
    <th>Vehicle Type</th>
    <th>Avl Slot</th>
    <th>Booked Slot</th>
    <th>Action</th>
  </tr>
  <c:forEach items="${result}" var="y">
  <tr>
    <td>${y.parkingid}</td>
    <td>${y.floor}</td>
    <td>${y.vehicle_type}</td>
    <td>${y.avl_slot}</td>
    <td>${y.booked_slot}</td>
    <td>
    <a href="#" style="color:Green"><b>Book Slot<b></b></a> <b>/</b> <a href="#" style="color:red"><b>Cancle Slot</b></a>
    </td>
  </tr>
  </c:forEach>
 
</table>


</body>
</html>