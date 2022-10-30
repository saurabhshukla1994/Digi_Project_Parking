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
<!--  <style >
.topnav {
  background-color: #333;
  overflow: hidden;
}
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}
.topnav a:hover {
  background-color: #ddd;
  color: black;
}
.topnav a.active {
  background-color: #04AA6D;
  color: white;
}
</style>-->
</head>
<body>
<p> List of users</p>
<table border = "1" width = "100%">
<thead>
<tr>
<th>UserId</th>
<th >Name</th>
<th>Email</th>
<th>Contact</th>
<th>City</th>
<th>Field</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${result}" var="x">  
  <tr>
    <td>${x.userid}</td>
    <td>${x.name}</td>  

    <td>${x.email}</td>
    <td>${x.contact}</td>
   
    <td>${x.city}</td>
    <td>${x.field}</td>
    <td>
    <spring:url value="deleteUser/${x.userid}" var="deleteURL"/>
    <a href="${deleteURL}">Remove</a>
    
    </td>
    </tr>
 </c:forEach>
</tbody>
</table>
</body>
</html>