<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="SessionServlet">
	
		Nome: <input name="nome"><br />
		<input type="submit" value="Guardar Nome">
		
	
	</form>
	
	<% 
		List<String> listaNomes = (List<String>) request.getSession().getAttribute("listaNomes");
		if (listaNomes != null) {
			out.print("Nomes " + listaNomes.size());
		} else {
			out.print("Lista vazia");
		}
	%>
	<br>
	<span>${contador}</span><br>
	
	<span>${contadorTotal}</span>
	<br>
	
</body>
</html>