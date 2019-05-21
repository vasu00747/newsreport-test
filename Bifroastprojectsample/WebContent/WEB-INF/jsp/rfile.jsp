<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="submit" value="split">&nbsp&nbsp
<input type="submit" value="merge"><br><br>

<form action="rev" method="post">
Batch id: <input type="text" name="batchid"><br><br>
Batch name: <input type="text" name="batchname"><br><br>
priority:   <input type="text" name="priority"><br><br>
Status:    <input type="text" name="status"><br><br>
Delete Pages : <input type="text" name="delete"><br><br>
Invoice Pages : <input type="text" name="invoice"><br><br>
Chart Pages : <input type="text" name="charts"><br><br>
<input type="submit" value="review">&nbsp&nbsp
<input type="submit" value="cancel">
</form>


</body>
</html>