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
String palavra_invertida = "", palavra = request.getParameter("palavra");

for(int i = palavra.length()-1; i >= 0; i--) {
	palavra_invertida += palavra.charAt(i);
}

if(palavra.equals(palavra_invertida)) {
	out.print(palavra + " é um palíndromo.");
} else {
	out.print(palavra + " não é um palíndromo, pois seu inverso é " + palavra_invertida);
}

%>
</body>
</html>