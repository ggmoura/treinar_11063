
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="trn" uri="WEB-INF/custom.tld"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<c:forEach items="${pessoas}" var="pessoa">
			<li><c:out
					value="${pessoa.nome.concat(' ').concat(pessoa.sobrenome)}" /></li>
		</c:forEach>
	</ul>
	<trn:Hello />
</body>
</html>