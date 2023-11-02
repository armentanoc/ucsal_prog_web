<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receber Palavras</title>
</head>
<body>
	<form action="ReceberPalavras" method="get">
		Palavra 1: <input type="text" name=palavra1 size=30><br> <br>
		Palavra 2: <input type="text" name=palavra2 size=30><br> <br>
		<br> <br> <input type='submit' value="Enviar">
	</form>
	<%
	String erro = (String) request.getAttribute("erro");
	if (erro != null && !erro.trim().equals("")) {
		out.print(erro);
	}
	%>
</body>
</html>