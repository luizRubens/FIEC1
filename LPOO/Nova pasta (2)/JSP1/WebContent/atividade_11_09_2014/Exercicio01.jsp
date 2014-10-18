<%@page import="atividade_11_09_2014.OperadorDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<%
		OperadorDAO op = new OperadorDAO();

		String num01 = request.getParameter("num01");
		String num02 = request.getParameter("num02");
		String operador = request.getParameter("operador");

		operador += "";
		
		op.setNum01(num01);
		op.setNum02(num02);
		op.setOperador(operador);

		out.print(op.inserir_Operador());
	%>
</body>
</html>