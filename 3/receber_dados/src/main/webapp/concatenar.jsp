<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Palíndromo</title>
</head>
<body>
<%

String nome = request.getParameter("nome");
String estadoCivil = request.getParameter("estado_civil");
String faixaEtaria = request.getParameter("faixa_etaria");

String concat = nome + estadoCivil + faixaEtaria;

out.print("String concatenada = " + concat);


%>
</body>
</html>