<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<body>
<h3>Donar Registeration</h3>
<form action="registeration" method="post">
<a href="search">Home</a>&nbsp&nbsp&nbsp&nbsp<a href="search">Search</a>&nbsp&nbsp&nbsp&nbsp<a href="login">Login</a>&nbsp&nbsp&nbsp&nbsp<a href="aboutblood">About Blood</a>&nbsp&nbsp&nbsp&nbsp<a href="bloodbankdetails">BloodBank Details</a>&nbsp&nbsp&nbsp&nbsp<a href="hospital details">Hospital Details</a>&nbsp&nbsp&nbsp&nbsp<a href="todaysposts">Todays Post</a>&nbsp&nbsp&nbsp&nbsp<a href="doctorarticles">Doctor Articles</a>&nbsp&nbsp&nbsp&nbsp<br><br>

UserName:            <input type="text" name="username"required><br><br>
Password:            <input type="password" name="password"required><br><br>
Confirm password:    <input type="password" name="confirmpassword"required><br><br>
mailid:              <input type="text" name="mailid"required><br><br>

Personal Information:<br><br>
Donar name:          <input type="text" name="donarname"required><br><br>
Father Name:         <input type="text" name="fathername"required><br><br>
Age:                 <input type="text" name="age"required><br><br>
Gender:
                     <select name="gender">
                     <option value="male">male</option>
                     <option value="female">female</option>
                     </select><br><br>
Address:             <input type="text" name="address"required><br><br>
Pin:                 <input type="text" name="pin"required><br><br>
District:            <input type="text" name="district"required><br><br>
Area:                <input type="text" name="area"required><br><br>
Phone No:            <input type="text" name="phoneno"required><br><br>
Blood Group:

                    <select name="bloodgroup">
                    <option value="o+">O+</option>
                    <option value="A1-">A1-</option>
                    <option value="A+">A+</option>
                    <option value="B+">B+</option>
                    <option value="A-">A-</option>
                    <option value="B-">B-</option>
                    </select><br><br>
<input type="submit" value="create user">
</form>













</body>
</html>