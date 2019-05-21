<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="searr" method="post">
<h4><center>Search For Donor</center></h4>
Select Blood Group:
<select name="bloodgroup">
<option value="o+">O+</option>
<option value="A1-">A1-</option>
<option value="A+">A+</option>
<option value="B+">B+</option>
<option value="A-">A-</option>
<option value="B-">B-</option>

</select><br><br>
Select District:
<select name="district">
<option value="Thanjavur">thanjavur</option>
<option value="chennai">chennai</option>
<option value="bangalore">banglore</option>
<option value="pune">pune</option>
<option value="delhi">delhi</option>
<option value="karnadaka">karnadaka</option>
<option value="hyderabad">hyderabad</option>
<option value="coimbatore">coimbatore</option>
</select><br><br>

<input type="submit" value="search">
</form>


</body>
</html>