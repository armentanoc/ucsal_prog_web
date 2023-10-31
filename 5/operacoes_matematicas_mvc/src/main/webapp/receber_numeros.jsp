<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Receber Números</title>
</head>
<body>
<form action="ReceberNumeros" method="post">
	     Número 1: <input type="text" name=numero1 size=5 ><br><br>
	     Número 2:	<input type="text" name=numero2 size=5><br><br>	     
	     Número 3:	<input type="text" name=numero3 size=5><br><br>	     
	     <input type='submit' value="Enviar">
	</form>	
<%
	String erro = (String) request.getAttribute("erro");
	if(erro!=null && !erro.trim().equals("")){
		out.print(erro);
	}
%>
</body>
</html>