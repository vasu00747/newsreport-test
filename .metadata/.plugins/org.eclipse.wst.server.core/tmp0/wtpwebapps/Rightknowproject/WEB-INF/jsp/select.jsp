
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
<title>Insert title here</title>
</head>
<body>
selected.....
<table border="1">
<tr>
<th>Id</th>
<th>DeviceName</th>
<th>IdProof</th>
<th>Location</th>
<th>MailId</th>
<th>MobileNo</th>
<th>Name</th>
<th>pincode</th>
<th>Uniqueid</th>
<th>Edit</th>
<th>delete</th>


</tr>
<c:forEach var="slct" items="${sl}">
<tr>
<td>${slct.id}</td>
<td>${slct.devicename}</td>
<td>${slct.idproof}</td>
<td>${slct.location}</td>
<td>${slct.mailid}</td>
<td>${slct.mobileno}</td>
<td>${slct.name}</td>
<td>${slct.pincode}</td>
<td>${slct.uniqueid}</td>
<td>
<form action = "editControl" method = "post">
<button name="cus" value="<c:out value="${s.cus}"/>">Edit</button></form>
</form></td>
<td>
<form action = "DeleteControl" method = "post">
<button name="cus" value="<c:out value="${s.cus}"/>">Delete</button></form>
</td>
</tr>

</c:forEach>
 </table>
</body>
</html>