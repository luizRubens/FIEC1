<%@page import="javax.swing.*"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dados Recebidos</title>
</head>
<body>
	<font face="calibri" size="5px"> <%
 	String nome = request.getParameter("nome");
 	String senha = request.getParameter("senha");

 	if (nome == "" || senha == "") {

 		out.println("<font color='red'><p>Por favor forneca os dados corretamente</p></font>");

 	}
 	else {
 		try {

 			PrintWriter pw = new PrintWriter(new FileWriter(
 					"login.txt", true));
 			pw.println(nome);
 			pw.println(senha);

 			pw.close();

 			out.print("<font color='green'>Arquivo armazenado com sucesso!</font>");
 		}
 		catch (IOException err) {

 			JOptionPane.showMessageDialog(null,
 					"Ocorreu uma falha ao gravar os dados");

 			out.print("<font color='red'>Falha ao gravar as informações</font>");
 		}
 	}
 %>

	</font>

</body>
</html>