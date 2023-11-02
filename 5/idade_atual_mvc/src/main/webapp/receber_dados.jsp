<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receber Dados</title>
</head>
<body>
	<form action="ReceberDados" method="get">
		Nome: <input type="text" name=nome size=50><br> <br>
		Endereço: <input type="text" name=endereco size=50><br> <br>
		Ano de nascimento: <input type="text" name=anoNascimento size=4><br>
		<br> Já fez aniversário? <select name="jaFezAniversario"
			id="jaFezAniversario">
			<option value="sim">Sim</option>
			<option value="nao">Não</option>
		</select><br> <br> <input type='submit' value="Enviar">
	</form>
	<%
	String erro = (String) request.getAttribute("erro");
	if (erro != null && !erro.trim().equals("")) {
		out.print(erro);
	}
	%>
</body>
</html>