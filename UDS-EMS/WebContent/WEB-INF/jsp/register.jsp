<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registercontrol" method="post">
<table>

<tr><th>Employee Id</th><td><input type="text" name="empid"></td></tr>
<tr><th>Employee Name</th><td><input type="text" name="name"></td> </tr>
<tr><th>Mobile Number</th><td><input type="text" name="mobileno"></td></tr>
<tr><th>Address</th><td><input type="text" name="address"></td></tr>
<td><input type="submit" value="register"></td>
</table>
<a href="backop"><button type="button">back</button></a>
</form>
</body>
</html>