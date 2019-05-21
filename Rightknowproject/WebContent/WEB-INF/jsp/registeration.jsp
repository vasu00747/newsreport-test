<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Registration</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="validation" method="post">
  Name:    <input type="text" name="name" required><br><br>
Location: <input type="text" name="location" required><br><br>
Pincode:  <input type="text" name="pincode" required><br><br>
Mob no:   <input type="text" name="mobileno" required><br><br>
Mail id:  <input type="text" name="mailid" required><br><br>


Select the type of devicename:
<select name="devicename">
<option value="RSLAN1">RSLAN1</option>
<option value="RSLAN2">RSLAN2</option>
<option value="RSLAN3">RSLAN3</option>
<option value="RSLAN4">RSLAN4</option>

</select><br><br>
Select the Id proof:
<select name="idproof">
<option value="aadhar">aadhar</option>s
<option value="pan">pan</option>
<option value="voteid">voteid</option>
<option value="license">License</option>

</select><br><br>

Enter your unique id:<input type="text" name="uniqueid"><br><br>

<input type="submit" value="submit">
</form>






</body>
</html>