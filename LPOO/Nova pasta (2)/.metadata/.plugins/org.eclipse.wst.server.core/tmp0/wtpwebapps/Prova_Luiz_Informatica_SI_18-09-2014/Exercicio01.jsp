<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado</title>
</head>
<body>
	<%
		String n1 = request.getParameter("num01");
		String n2 = request.getParameter("nume02");
		String operador = request.getParameter("ope");

		double re;

		double num01 = Double.parseDouble(n1);
		double num02 = Double.parseDouble(n2);

		if (operador.equals("somar")) {

			re = num01 + num02;

			out.print("Resultado:" + re + "<br>");

		} else if (operador.equals("subtrair")) {

			re = num01 - num02;

			out.println("<p>O resultado da subtração é: " + re + "</p>");

		}

		else if (operador.equals("multiplicar")) {

			re = num01 * num02;

			out.println("<p>O resultado da multiplicação é: " + re + "</p>");

		}

		else if (operador.equals("dividir")) {

			re = num01 / num02;

			out.println("<p>O resultado da divisão é: " + re + "</p>");

		}
	%>
</body>
</html>