<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System-Register</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<h1 class="title">Employee Management System</h1>
<div class="login-form">
 
 <div align="center">
 <form action="register" method="post">
 
 <div class="form-group">
 
 
 <label>Full Name :</label>
 <input type="text" name="fullname" class="form-control">
 
 </div>
 <div class="form-group">
 
 
 <label>User Name :</label>
 <input type="text" name="username" class="form-control">
 
 </div>
 
  <div class="form-group">
 
 
 <label>Password :</label>
 <input type="password" name="password" class="form-control">
 
 </div>
 
 <div class="form-group">
 
 
 <label>Email :</label>
 <input type="email" name="email" class="form-control">
 
 </div>
 
 <div class="form-group">
 
 
 <label>Mobile :</label>
 <input type="number" name="mobile" class="form-control">
 
 </div>
 
 <div class="form-group">
 <input type="submit" value="Register">
 
 </div>
 
 </form>
</div>

</div>
<a href="index.jsp">Home</a>



</div>
</body>
</html>