<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
body {
    background-color: #3c32cd47;
    width: 50%;
    margin-left: 350px;
    margin-top: 80px;
}
</style>




<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>

</head>
<body>

<h3>Edit Your Details</h3>

<div class="container">
<c:forEach  items="${update}" var="i" > 

<form action="UpdateController" method="post">
    <label for="id"></label>

	<input type="hidden" name="id" value="<c:out value="${i.id}"/>">

    <label for="Name">Name</label>
    <input type="text" id="fname" name="username" value="<c:out value="${i.username}"/>" >

    <label for="College Name">College Name</label>
    <input type="text" id="lname" name="collegename" value="<c:out value="${i.collegename}"/>" >

<label for="Dept Name">Dept Name</label>
	<input type ="text" value="<c:out value="${i.deptname}"/>" name="deptname">
    
    
    <label for="Mobile Number">Mobile Number</label>
    <input type="text" id="lname" name="mobno" value="<c:out value="${i.mobno}"/>" >

    <input type="submit" value="UPDATE">
  </form>
  </c:forEach>
  
</div>



</body>
</html>