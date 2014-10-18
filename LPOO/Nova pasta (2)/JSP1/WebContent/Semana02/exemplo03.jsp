<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recebe dados da aplicação cliente</title>
</head>
<body>
	<%
		String tim = request.getParameter("time");

		int n = Integer.parseInt(tim);

		switch (n) {
		case 1:
			tim = "São Paulo";
			break;
		case 2:
			tim = "Corinthians";
			break;
		case 3:
			tim = "Palmeiras";
			break;
		case 4:
			tim = "Santos";
			break;
		case 5:
			tim = "Gremio";
			break;
		case 6:
			tim = "Internacional";
			break;
		default:
			tim = "Desconhecido";

		}
		out.print("Nome recebido: <b>" + tim + "</b><br>");
	%>
</body>
</html>