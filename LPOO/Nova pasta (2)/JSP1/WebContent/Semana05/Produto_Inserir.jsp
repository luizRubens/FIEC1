<%@page import="javax.swing.JOptionPane"%>
<%@page import="beans.ProdutoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produto</title>
</head>
<body>
	<%
	ProdutoDAO p = new ProdutoDAO();
	

	String descricao = request.getParameter("descricao");
	String preco = request.getParameter("preco");

	p.setDescricao(descricao);
	p.setPreco(Float.parseFloat(preco));
	
	out.print(p.inserir());
	

	%>



</body>
</html>