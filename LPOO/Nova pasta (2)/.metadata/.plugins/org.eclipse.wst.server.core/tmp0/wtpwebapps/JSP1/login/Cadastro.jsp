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

String login = request.getParameter("usuario");
String senha = request.getParameter("senha");

UsuarioDAO u = new UsuarioDAO();

u.setLogin(login);
u.setSenha(senha);

boolean t = u.inserir();

if(t=true){
	
	out.println("<font color=green size=5px face='calibri'><p>CADASTRO EFETUADO COM SUCESSO</p></font>");
	out.println("<br><font size=5px face='calibri'><a href='Principal.jsp'>PRINCIPAL</p></font>");

	
}
else{
	out.println("<font color=green size=5px face='calibri'><p>N�O EST� FUNCIONANDO !!!</p></font>");
	out.println("<br><font size=5px face='calibri'><a href='Principal.jsp'>Falha login</p></font>");

}
%>

</body>
</html>