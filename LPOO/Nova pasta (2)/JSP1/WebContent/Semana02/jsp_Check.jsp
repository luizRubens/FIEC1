<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recebe o check</title>
</head>
<body>
	<%
		String acao = request.getParameter("acao");
		String ave = request.getParameter("aven");
		String rom = request.getParameter("roman");

		out.print("<b>Generos escolhidos</b><br>");
		String aux = "";

		if (acao != null)
			aux += acao + ", ";
		if (ave != null)
			aux += ave + ", ";
		if (rom != null)
			aux += rom + ", ";

		out.print(aux);
	%>
</body>
</html>