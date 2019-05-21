<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
            
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<c:forEach var="hh" items="${editc}" >
<form action="editcon" method="post">
<input type="text" name="id" value="<c:out value="${hh.id}"/>">
<tr>
<th>Name</th><td><input type="text" name="name" value="<c:out value="${hh.name}"/>"></td>
</tr>
<td><input type="submit" value="update"></td>

</form>
</c:forEach>
</table>

</body>
</html>