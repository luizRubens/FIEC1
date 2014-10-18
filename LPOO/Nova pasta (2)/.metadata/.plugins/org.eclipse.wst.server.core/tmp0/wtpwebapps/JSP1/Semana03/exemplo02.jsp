<%@page import="javax.swing.*"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Veja os dados</title>
</head>
<body>
	<font face="calibri" size="5px"> <%
 	//aqui recebe as informações
 	String nome = request.getParameter("nome");
 	String rg = request.getParameter("rg");
 	String cpf = request.getParameter("cpf");
 	String tel = request.getParameter("telefone");
 	String cpfl = request.getParameter("cpfl");

 	//apartir daqui lê as informações
 	try {
 		BufferedReader br = new BufferedReader(new FileReader(
 				"C:/Users/LuizR.Ribas/Documents/eclipse_txt/" + cpfl));

 		nome = br.readLine();
 		rg = br.readLine();
 		cpf = br.readLine();
 		tel = br.readLine();

 		br.close();

 		out.print("<form action='exemplo01.jsp' method='get'>");
 		out.print("CPF:" + cpf + "<br>");
 		out.print("<input type='hidden' name='cpf' value='" + cpf
 				+ "'><br>");
 		out.print("Nome:<input type='text' name='nome' value='" + nome
 				+ "'><br>");
 		out.print("RG:<input type='text' name='rg' value='" + rg
 				+ "'><br>");
 		out.print("Telefone:<input type='text' name='telefone' value='"
 				+ tel + "'><br><br>");
 		out.print("<input type='submit' value='Gravar'>");
 		out.print("</form>");
 	} catch (IOException e) {

 		out.print("<font color='red'>Falhou :(</font>");

 	}
 %>

	</font>

</body>
</html>