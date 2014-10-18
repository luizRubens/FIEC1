<%@page import="login.UsuarioDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Status</title>
</head>
<body>
	<%
		UsuarioDAO u = new UsuarioDAO();

		String l = request.getParameter("usuario");
		String s = request.getParameter("senha");

		if (u.logar(l, s)) {

			session.putValue("usuario", l);
			out.println("<font color=green size=5px face='calibri'><p>VOCÊ ESTA LOGADO</p></font>");
			out.println("<br><font size=5px face='calibri'><a href='Principal.jsp'>PRINCIPAL</p></font>");

		} else {

			out.println("<font color=green size=5px face='calibri'><p>IS NOT WORKING !!!</p></font>");
			out.println("<br><font size=5px face='calibri'><a href='Login.jsp'>Falha login</p></font>");

		}
	%>


</body>
</html>