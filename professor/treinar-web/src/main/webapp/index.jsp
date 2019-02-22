<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Principal</title>
</head>
<body>

	
	<form action="PrimeiroServlet" method="get">
	
	    <% 
	    for (int i=0;i<6;i++){
	    	out.print("Nome " + i + ": <input type=\"text\" name=\"nomeDaPessoa" + i + "\"><br />");
	    	
	    }
		out.print(request.getAttribute("parabens"));
	%>
	    
	    <input type="submit" value="Enviar">
	</form>	
	
	
	
	
</body>
</html>