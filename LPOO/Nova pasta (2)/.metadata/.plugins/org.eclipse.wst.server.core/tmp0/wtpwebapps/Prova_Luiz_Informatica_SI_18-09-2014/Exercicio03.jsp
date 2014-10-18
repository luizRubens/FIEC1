<%@page import="banco.BancarioDAO"%>
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
		BancarioDAO b = new BancarioDAO();

		String cli = request.getParameter("cliente");
		String operacao = request.getParameter("operacao");
		String valor = request.getParameter("valor");

		float v = Float.parseFloat(valor);
		int c = Integer.parseInt(cli);
		if (v <= 0 || v >= 1001) {
			out.println("Por favor o registro não pode ter valor menor que 1 e maior que 1000");
		} else {
			b.setCliente(c);
			b.setOperacao(operacao);
			b.setValor(v);

			out.print(b.inserir_Bancario());
		}
	%>
</body>
</html>