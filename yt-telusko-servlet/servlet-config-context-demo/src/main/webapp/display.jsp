<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Tags Demo</title>
</head>
<body>
	Hello World, Display JSP Body!
	JSTL Core Tags...
	<br/><br/>
	
	<%
		String name = request.getAttribute("label").toString();
		out.println("Inside Scriptlet, " + name);	
	%>
	
	<br/><br/>
	<c:out value="Hello World, JSTL Out tag!" /> 
	
	<br/><br/>
	Using EL Tag, ${student} 
	<br/><br/>
	
	Now Using Functions Tags...
	<br/><br/>
	<c:set var="str" value="Paradox is a Professor OP" />
	
	Length : ${fn:length(str)}
	<br/>
	
	<c:forEach items="${fn:split(str,' ')}" var="s">
		<br/>
		${s}
	</c:forEach>
	
	<br/><br/>
	Index : ${fn:indexOf(str,"is")}
	
	<br/><br/>
	is there Professor? : ${fn:contains(str,"Professor")}
	<br/>
	is there JSP? : ${fn:contains(str,"JSP")}
	
	<br/><br/>
	<c:if test="${fn:contains(str,'Professor')}">
		If Block Result, Professor is in String.
	</c:if>
	
	<br/><br/>
	<c:if test="${fn:endsWith(str,'OP')}">
		If Block Result, str ends with OP.
	</c:if>
	<br/><br/>
	Now Using SQL Tags...
	Connected with teluskodb1/alien...
	
	<br/><br/>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/teluskodb1" user="root" password="toor"/>
	
	<sql:query var="rs" dataSource="${db}">select * from alien</sql:query>
	
	<c:forEach items="${rs.rows}" var="alienr">
		<br/><c:out value="${alienr}" />
	</c:forEach>	
	

</body>
</html>