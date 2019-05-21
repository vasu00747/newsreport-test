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
<body style="background-color:cement;">

<table border="2">
<tr>
<th>Cus Seq_Id</th>
<th>Name</th>
<th>Invoice Address</th>
<th>Shipping Address</th>
<th>Sex</th>
<th>Company Name</th>
<th>District</th>
<th>EmailId</th>
<th>MobileNo</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach items="${slc}" var="s">
<tr>
<td>${s.cus}</td>
<td>${s.name}</td>
<td>${s.invoice}</td>
<td>${s.shipping}</td>
<td>${s.sex}</td>
<td>${s.company}</td>
<td>${s.district}</td>
<td>${s.email}</td>
<td>${s.mobile}</td>
<td>
<form action = "editControl" method = "post">
<button name="cus" value="<c:out value="${s.cus}"/>">Edit</button></form>
</form></td>
<td>
<form action = "DeleteControl" method = "post">
<button name="cus" value="<c:out value="${s.cus}"/>">Delete</button></form>
</td>
</tr>
</c:forEach>

</table>

</body>
</html>