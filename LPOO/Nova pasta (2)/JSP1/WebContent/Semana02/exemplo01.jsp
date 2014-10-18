<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recebe dados da aplicação cliente</title>
</head>
<body>
	<%
		String nom = request.getParameter("nome");
		String fon = request.getParameter("Fone");
		String ema = request.getParameter("email");

		out.print("Nome recebido: <b>" + nom + "</b><br>");
		out.print("Telefone recebido: <b>" + fon + "</b><br>");
		out.print("E-mail recebido: <b>" + ema + "</b><br>");
	%>
</body>
</html>