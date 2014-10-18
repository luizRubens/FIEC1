<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo 5</title>
</head>
<body>
	<font face=calibri size=6px> <%
 	int dia = Integer.parseInt((new SimpleDateFormat("dd"))
 			.format(new Date()));

 	int mes = Integer.parseInt((new SimpleDateFormat("MM"))
 			.format(new Date()));

 	int ano = Integer.parseInt((new SimpleDateFormat("yyyy"))
 			.format(new Date()));

 	int hor = Integer.parseInt((new SimpleDateFormat("hh"))
 			.format(new Date()));

 	int min = Integer.parseInt((new SimpleDateFormat("mm"))
 			.format(new Date()));

 	int seg = Integer.parseInt((new SimpleDateFormat("ss"))
 			.format(new Date()));

 	out.print("<p>Dia:" + dia + "</p>");

 	out.print("<p>Mês:" + mes + "</p>");

 	out.print("<p>Ano:" + ano + "</p>");
 %>
		<p>Acessando dados do Java dentro do HTML</p> Hora: <b><%=hor%></b> <br>
		Minuto: <b><%=min%></b> <br> Segundo: <b><%=seg%></b> <br> 
 
		
</body>
</html>