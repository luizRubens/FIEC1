<%@page import="java.sql.SQLException"%>
<%@page import="atividade_11_09_2014.BDSQL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabela Operadores</title>
</head>
<body>
	<%
		BDSQL bdsql = new BDSQL();

		String n1 = "num01";
		String n2 = "num02";
		String operador = "operador";
		String sql = "select * from operador";

		try {

			bdsql.getConnection();
			bdsql.st = bdsql.con.prepareStatement(sql);
			bdsql.rs = bdsql.st.executeQuery();

			out.print("<table border=1 cellspacing=0>");
			out.print("<tr bgcolor='orange'>");
			out.print("<th>Numero 1</th><th>Numero 2</th><th>Operador</th></tr>");

			while (bdsql.rs.next()) {

				n1 = bdsql.rs.getString("num01");
				n2 = bdsql.rs.getString("num02");
				operador = bdsql.rs.getString("operador");

				out.print("<tr><td width=50>" + n1 + "</td>");
				out.print("<td width=50>" + n2 + "</td>");
				out.print("<td width=50>" + operador + "</td></tr>");

			}
		} catch (SQLException e) {
			out.print("<p> Ocorreu um erro.</p>");

			out.print("<p>" + e.toString() + "</p>");

		} finally {
			bdsql.close();
		}
	%>
</body>
</html>