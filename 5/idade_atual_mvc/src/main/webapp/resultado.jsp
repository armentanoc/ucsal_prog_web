<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>
<h1>Dados da Pessoa</h1>
    <p>Nome: ${pessoa.getNome()}</p>
    <p>Endereço: ${pessoa.getEndereco()}</p>
    <p>Ano de Nascimento: ${pessoa.getAnoNascimento()}</p>
    <p>Já fez aniversário: ${pessoa.getJaFezAniversario()}</p>
    <p>Idade: ${pessoa.getIdade()}</p>
</body>
</html>