<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>id</th>
<th>uniqueid</th>
<th>name</th>
<th>location</th>

<th>pincode</th>
<th>mobileno</th>
<th>mailid</th>
<th>devicename</th>
<th>idproof</th>

<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach items="${slctone}" var="s">
<tr>
<td>${s.id}</td>
<td>${s.uniqueid}</td>
<td>${s.name}</td>
<td>${s.location}</td>
<td>${s.pincode}</td>
<td>${s.mobileno}</td>
<td>${s.mailid}</td>
<td>${s.devicename}</td>
<td>${s.idproof}</td>

<td><form action="updatecontrol" method="post">
<button name="id" value="<c:out value="${s.id}"/>">Edit</button></form>
</td>
<td><form action="delect" method="post">
<button name="id" value="<c:out value="${s.id}"/>">Delete</button></form>
</td>
</tr>
</c:forEach>
</table>
New Employee Register<a href="newcus">click Here........</a>
</body>
</html>