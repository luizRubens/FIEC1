<%@page import="sqlserver.EnqueteDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
"WebContent/login/Principal.jsp"
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Computa voto</title>
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("cand"));

		EnqueteDAO e = new EnqueteDAO();

		if (e.adicionarVoto(id)) {
			out.println("<p>Voto Computado</p>");
		} else {
			out.println("Falha em nossos servidores, vote mais tarde");
		}
	%>
</body>
</html>