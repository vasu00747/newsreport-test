<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Employee id</th>
<th>Employee Name</th>
<th>Mobile Number</th>
<th>Address</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach items="${slc}" var="s">
<tr>
<td>${s.empid}</td>
<td>${s.name}</td>
<td>${s.mobileno}</td>
<td>${s.address}</td>
<td><form action="updatecontrol" method="post">
<button name="empid" value="<c:out value="${s.empid}"/>">Edit</button></form>
</td>
<td><form action="delect" method="post">
<button name="empid" value="<c:out value="${s.empid}"/>">Delete</button></form>
</td>
</tr>
</c:forEach>
</table>
New Employee Register<a href="newemp">click Here........</a>
<a href="backop"><input type="button" name="back"></a>
</body>
</html>