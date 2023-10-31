<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
<h1>Operações Matemáticas</h1>
    <p>Soma: ${operacoes.getSum()}</p>
    <p>Subtração: ${operacoes.getSubtraction()}</p>
    <p>Multiplicação: ${operacoes.getMultiplication()}</p>
    <p>Divisão: ${operacoes.getDivision()}</p>
    <p>Resto da Divisão: ${operacoes.getRest()}</p>
</body>
</html>