<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
<h2>My Parking Status:-</h2>
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
  <c:forEach items="${result}" var="z">
  <tr>
    <td>${z.parkingid}</td>
    <td>${z.floor}</td>
    <td>${z.vehicle_type}</td>
    <td>${z.avl_slot}</td>
    <td>${z.booked_slot}</td>
    <td>
    <spring:url value="deleteSlot/${z.parkingid}" var="deleteURL1"/>
    <a href="${deleteURL1}">Remove</a>
    </td>
    
    
   
  </tr>
  </c:forEach>
 
</table>

</table>
</body>
</html>