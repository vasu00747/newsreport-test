<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="empregister" method="post">
Name: <input type="text" name="name"><br><br>
Id: <input type="text" name="id"><br><br>

Mailid: <input type="text" name="mailid"><br><br>
Mobileno: <input type="text" name="mobileno"><br><br>
Designation: <input type="text" name="designation"><br><br>
Select the area:
<select name="area">
<option value="northchennai">North chennai</option>
<option value="southchennai">South chennai</option>
</select><br><br>
<input type="submit" value="submit">
</form>



</body>
</html>