<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<h3>Asminds Student</h3>
<br/>
<c:forEach  items="${update}" var="i" > 
<form action="UpdateController" method="post">
	<table>
	<tr><input type="hidden" name="id" value="<c:out value="${i.id}"/>"></tr>
	<tr><th>Username:</th><td><input type ="text" value="<c:out value="${i.username}"/>" name="username"><td></tr>
	<tr><th>College Name:</th><td><input type ="text" value="<c:out value="${i.collegename}"/>" name="collegename"><td></tr>
	<tr><th>Dept Name:</th><td><input type ="text" value="<c:out value="${i.deptname}"/>" name="deptname"><td></tr>
	<tr><th>Mobile Number:</th><td><input type ="text" value="<c:out value="${i.mobno}"/>"  name="mobno"><td></tr>
	
	<tr><th><input type ="submit" value="Update"></th><td></td></tr>
	</table>
</form>
</c:forEach>
</body>  
</html>   