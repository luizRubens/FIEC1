<%@page import="java.io.IOException"%>
<%@page import="java.io.PrintWriter"%>
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
		String codigo = request.getParameter("cod");
		String nome = request.getParameter("nome");
		String pessoa = request.getParameter("pessoa");

		System.out.println(codigo);
		System.out.println(nome);
		System.out.println(pessoa);

		if (pessoa.equals("Pessoa Fisica")) {
			try {

				PrintWriter pw = new PrintWriter("C:/Users/LuizR.Ribas/Documents/" +"Pessoa.txt");
				pw.println(codigo);
				pw.println(nome);
				pw.println(pessoa);
				pw.close();

				out.print("<font color='green' size='5px'>Arquivo armazenado com sucesso!</font>");
			} catch (IOException err) {

				out.print("<font color='red' size='5px'>Falha ao gravar as informações</font>");
			}
		}

		if (pessoa.equals("Pessoa Juritica")) {
			try {

				PrintWriter pw = new PrintWriter("C:/Users/LuizR.Ribas/Documents/" +"Empresa.txt");
				pw.println(codigo);
				pw.println(nome);
				pw.println(pessoa);
				pw.close();

				out.print("<font color='green' size='5px'>Arquivo armazenado com sucesso!</font>");
			} catch (IOException err) {

				out.print("<font color='red'>Falha ao gravar as informações</font>");
			}
		}
	%>
</body>
</html>