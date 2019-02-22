<%@page import="java.awt.List"%>
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
			java.util.List<String> nomes = (java.util.List<String>) request.getAttribute("parabens");
			for(String nome : nomes){
				out.print("<li>");
				out.print(nome);
				out.print("</li>");
			}
		
			
		%>
	</ul>
</body>
</html>