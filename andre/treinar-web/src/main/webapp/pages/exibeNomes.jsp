<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Resultado da requisição</title>
	</head>
	<body>
		<h1 align="center">Resultado da sua requisição</h1>
		<br/>
		<table border= "1" align="center" style="border-collapse: collapse">
			<tr>
				<%
					List<String> nomes = (List<String>) request.getAttribute("dados");
					for (String nome : nomes) {
				%>
				<td style="padding: 15px; text-align: center;">
				<% 
						out.print(nome.toUpperCase());
				%>
				</td>
				<%	
					}
				%>
			</tr>
		</table>
	</body>
</html>