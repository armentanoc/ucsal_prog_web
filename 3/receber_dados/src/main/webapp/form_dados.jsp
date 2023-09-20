<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados</title>
</head>
<body>
<form action="concatenar.jsp" method="get">
	     
	     Nome: <input type="text"  name="nome" size=30 > 	<br><br>
	     
	     Estado civil: <br><br>
		    <input type="radio" name="estado_civil" value="Solteiro">Solteiro(a)<br>
			<input type="radio" name="estado_civil" value="Casado(a)">Casado(a)<br>
			<input type="radio" name="estado_civil" value="Viúvo(a)">Viúvo(a)<br>
			<input type="radio" name="estado_civil" value="Divorciado(a)">Divorciado(a)<br>

		<br>Faixa Etária: <br><br>
		    <input type="radio" name="faixa_etaria" value="3 a 10 anos">3 a 10 anos<br>
			<input type="radio" name="faixa_etaria" value="11 a 25 anos">11 a 25 anos<br>
			<input type="radio" name="faixa_etaria" value="26 a 55 anos">26 a 55 anos<br>
			<input type="radio" name="faixa_etaria" value="56 a 100 anos">56 a 100 anos<br>
	     <br>
	   <input type="submit" value="Enviar">
</form>
</body>
</html>