<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista de Contas</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>


	<form action="cadastro.trn">
		<input type="hidden" name="action" value="br.com.treinar.servlet.CadastroConta">
		Cliente: <input name="cliente"><br />
		CPF: <input name="cpf"><br />
		Numero: <input name="numero"><br />
		Limite Crédito: <input name="limiteCredito"><br />
		Taxa Manutenção: <input name="taxaManutencao"><br />
			
		<input type="submit" value="Criar Conta Corrente">
	</form>

</body>
</html>