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

<c:forEach items="${ed}" var="ee">
<form action="editConData" method="post">
<input type="hidden" name="cus" value="<c:out value="${ee.cus}"/>">
<tr>
<th>Employee Name</th><td><input type="text" name="name" value="<c:out value="${ee.name}"/>"></td>
</tr>
<tr>
<th>Invoice Address</th><td><input type="text" name="invoice" value="<c:out value="${ee.invoice}"/>"></td>
</tr>
<tr>
<th>Shipping Address</th><td><input type="text" name="shipping" value="<c:out value="${ee.shipping}"/>"></td>
</tr>
<th>Sex</th><td><input type="text" name="sex" value="<c:out value="${ee.sex}"/>"></td>
</tr>
<th>Company Name</th><td><input type="text" name="company" value="<c:out value="${ee.company}"/>"></td>
</tr>
<th>District</th><td><input type="text" name="district" value="<c:out value="${ee.district}"/>"></td>
</tr>
<th>EmailId</th><td><input type="text" name="email" value="<c:out value="${ee.email}"/>"></td>
</tr>
<th>MobileNo</th><td><input type="text" name="mobile" value="<c:out value="${ee.mobile}"/>"></td>
</tr>

<td><input type="submit" value="update"> </td>

</form>
</c:forEach>

</table>
</body>
</html>