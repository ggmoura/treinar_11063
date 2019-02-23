
<%@page import="java.util.List"%>
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
		<%
			List<String> nomes = (List<String>) request.getAttribute("parabens");
			for(String nome: nomes) {
				out.print("<li>");
				out.print(nome);
				out.print("</li>");
			}
		%>
	</ul>
	
	<h1>
	<% 
		out.print(request.getAttribute("parabens"));
	%>
	</h1>
	
</body>
</html>