<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<center><h1>Student List</h1>  </center>
<style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 70%;
    margin-left: 210px;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;

}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>




<style>


h1 {
    background-color: white;
    
        font-style: oblique;
    
}
</style>



<table border="2" width="50%" cellpadding="2"  id="customers">  
<tr><th>Id</th><th>Name</th><th>college Name</th><th>Dept Nmae</th><th>Mobile No</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="std" items="${list}">   
   <tr>  
   <td>${std.id }</td>  
   <td>${std.username}</td>  
   <td>${std.collegename}</td> 
      <td>${std.deptname}</td>  
          <td>${std.mobno}</td>  
    
   
   <td><form action="update" method="post">
   <button name="btn" value="<c:out value="${std.id}"/>">Edit
   </button></form></td>
   
   
   <td><a href="deleteemp/${std.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a style="margin-left: 210px;" href="empform">Add New Employee</a>  
  
