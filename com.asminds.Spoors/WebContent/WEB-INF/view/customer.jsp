<html>
<head>
<script type="text/javascript" src="validate.js"></script>
</head>
<body style="background-color:powderblue;">
<form action="insertcontrol" method="post">

<table cellpadding="2" width="20%" 
cellspacing="2">

<tr>
<td colspan=2>
<center><font size=4><b>Customer Creation</b></font></center>
</td>
</tr>

<tr>
<td>Cust Seq_Id</td>
<td><input type="text" name="cus" id="cus"
size="30"></td>
</tr>

<tr>
<td>Name</td>
<td><input type=text name=name id="name" size="30"></td>
</tr>

<tr>
<td>Invoice Address</td>
<td><input type="text" name="invoice" id ="invoice" size="30"></td>
</tr>

<tr>
<td>Shipping Address</td>
<td><input type="text" name="shipping"
id="shipping" size="30"></td>
</tr>

<tr>
<td>Sex</td>
<td><input type="radio" name="sex" value="male" size="10">Male
<input type="radio" name="sex" value="Female" size="10">Female</td>
</tr>

<tr>
<td>Company Name</td>
<td><select name="company">
<option value="-1" selected>select..</option>
<option value="New Delhi">Apsy-Chennai</option>
<option value="Mumbai">Apsy-Coimbatore</option>
<option value="Goa">Apsy-Tirchy</option>
<option value="Patna">Apsy-Madurai</option>
</select></td>
</tr>


<tr>
<td>District</td>
<td><select name="district">
<option value="-1" selected>select..</option>
<option value="Nalanda">Erode</option>
<option value="UP">Coimbatore</option>
<option value="Goa">Tirchy</option>
<option value="Patna">Chennai</option>
</select></td>
</tr>


<tr>
<td>EmailId</td>
<td><input type="text" name="email" id="email" size="30"></td>
</tr>


<tr>
<td>MobileNo</td>
<td><input type="text" name="mobile" id="mobile" size="30"></td>
</tr>
<tr>
<td><input type="reset"></td>
<td colspan="2"><input type="submit" value="create"/></td>
</tr>
</table>
</form>
</body>
</html>