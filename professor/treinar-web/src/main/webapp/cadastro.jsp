
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li>gleidson</li>
		<li>maria sophia</li>
		<li>larissa</li>
	</ul>
	
	<h1>
	<% 
		out.print(request.getAttribute("parabens"));
	%>
	</h1>
	
</body>
</html>