<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Edit Profile</h4>
<form action="editedd" method="post">
Email:       <input type="text" name="email"required><br><br>
Address:     <input type="text" name="address"required><br><br>
Zip:         <input type="text" name="zip"required><br><br>
Area:        <input type="text" name="area"required><br><br>
phoneno:     <input type="text" name="phoneno"required><br><br>
Your Status: <input type="text" name="yourstatus"required><br><br>
Availability:

                    <select name="availability">
                    <option value="Anytime">Anytime</option>
                    <option value="Afternoon">Afternoon</option>
                    <option value="Evening">Evening</option>
                    <option value="Night">Night</option>
                    <option value="Morning">Morning</option>
                     <option value="Midnight">Midnight</option>
                     </select><br><br>
<input type="submit" value="update"><br><br>
<a href="changepassword">change password</a>
</form>
                     


</body>
</html>