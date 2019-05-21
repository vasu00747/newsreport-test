<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>

<c:forEach items="${editc}" var="ee">
<form action="editcontrol" method="post">
<input type="hidden" name="id" value="<c:out value="${ee.id}"/>">


<tr>
<th>Employee Name</th><td><input type="text" name="name" value="<c:out value="${ee.name}"/>"></td>
</tr>
<tr>
<th>Mobile Number</th><td><input type="text" name="mobileno" value="<c:out value="${ee.mobileno}"/>"></td>
</tr>
<tr>
<th>Address</th><td><input type="text" name="address" value="<c:out value="${ee.address}"/>"></td>

</tr>
<td><input type="submit" value="update"> </td>

</form>
</c:forEach>

</table>
</body>
</html>