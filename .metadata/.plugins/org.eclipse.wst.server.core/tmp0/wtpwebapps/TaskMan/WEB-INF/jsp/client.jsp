<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="validd" method="post">
Client Name:       <input type="text" name="name"><br><br>
Client Mailid:     <input type="text" name="mailid"><br><br>
Client Mobileno:   <input type="text" name="mobileno"><br><br>
Client Site:       <input type="text" name="site"><br><br>
choose the Employee Type:
<select name="emptype">
<option value="housekeeper">Housekeeper</option>
<option value="security">Security</option>
<option value="plumper">Plumper</option>
<option value="cooker">Cooker</option>
<option value="electrician">Electrician</option>
</select><br><br>
<input type="submit" value="sumbit"><br><br>
</form>

</body>


</html>