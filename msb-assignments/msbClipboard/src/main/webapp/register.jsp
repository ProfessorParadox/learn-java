<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	Register New User!
	<br><br>
	<form action="Register" method="post">
		<!-- Enter userID : <input type="text" name="uid" >  -->
		Enter email : <input type="email" name="umail" ><br>
		Enter username : <input type="text" name="uname" ><br>
		Enter password : <input type="password" name="pass" ><br>
		<input type="submit" value="Register User">
	</form>
</body>
</html>