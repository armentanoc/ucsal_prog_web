<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taboada</title>
</head>
<body>
<%
String strNumber = request.getParameter("numero");
int multiplicacao, numero = Integer.parseInt(strNumber);

for(int i = 1; i < 10; i++) {
	multiplicacao = numero * i;
	out.print(numero + " * " + i + " = " + multiplicacao);
	out.print("<br>");
}

%>
</body>
</html>