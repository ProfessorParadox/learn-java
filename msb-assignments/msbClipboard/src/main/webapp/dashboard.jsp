<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Dashboard Page</title>
</head>
<body>
	<h1>MSB Clipboard : Dashboard</h1>
	<br>
	
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		response.setHeader("Expires", "0"); //Proxies
		if(session.getAttribute("uname")==null) {
			response.sendRedirect("login.jsp");
		}
	%>
	
	Welcome!
	<br><br>	
		
	<!-- code to new note -->
	<form action="AddNote">
		<input type="submit" value=" (+) New Note ">
	</form>
	<br><br>
	
	<!-- code to logout -->
	<form action="Logout">
		<input type="submit" value=" (x) Logout ">
	</form>
	<br><br>
	
	<!-- code to fetch notes db -->
	<form action="ShowNotes">
		<input type="submit" value=" [...] Show Notes ">
	</form>
	<br><br>	
		
	
	<br><br><br><br><br><br>
	[------END OF PAGE------]
	
	
</body>
</html>