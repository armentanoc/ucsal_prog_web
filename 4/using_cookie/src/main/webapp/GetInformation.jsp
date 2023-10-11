<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recebe Dados</title>
</head>
<body>

	<form action="Cookies" method="get">
	     Nome: <input type="text" name="nome" size=60 ><br><br>
	     Curso: <input type="text" name="curso" size=60 ><br><br>
	     Cargo: <input type="text" name="cargo" size=60 ><br><br>
	     Cor favorita: <br><br> 
	     <input type="radio" name=cor value="blue" size=15 > Azul<br><br>	     
	     <input type="radio" name=cor value="red" size=15 > Vermelho<br><br>
	     <input type="radio" name=cor value="green" size=15 > Verde <br><br>
	     <input type="radio" name=cor value="pink" size=15 > Rosa <br><br>
	     <input type="submit" value="Enviar">
	</form>
</body>
</html>