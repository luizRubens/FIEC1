<%@page import="java.sql.SQLException"%>
<%@page import="banco.BDSQL"%>
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
		BDSQL bdsql = new BDSQL();

		String sql1 = "select * from bancario where cliente=? and operacao=?";
		//String sql2 = " select SUM (valor) as SOMA_DE_TODOS_CREDITOS from bancario where operacao='CREDITO' and cliente=?";
		//String sql3 = " select SUM (valor) as SOMA_DE_TODOS_DEBITOS from bancario where operacao='CREDITO' and cliente=?";

		String c = request.getParameter("cliente");
		String op = request.getParameter("operacao");
		
		int c1 = Integer.parseInt(c);
				try{
				bdsql.getConnection();
				bdsql.st = bdsql.con.prepareStatement(sql1);
				bdsql.st.setInt(1,c1);
				bdsql.st.setString(2, "operacao");

				bdsql.rs = bdsql.st.executeQuery();

				out.print("<table border=1 cellspacing=0>");
				out.print("<tr bgcolor='orange'>");
				out.print("<th>Numero</th><th>Cliente</th><th>Operação</th><th>Valor</th></tr>");

				while (bdsql.rs.next()) {

					int numero = bdsql.rs.getInt("numero");
					int cli = bdsql.rs.getInt("cliente");
					String operador = bdsql.rs.getString("operacao");
					float v = bdsql.rs.getFloat("valor");

					out.print("<tr><td width=50>" + numero + "</td>");
					out.print("<td width=50>" + cli + "</td>");
					out.print("<td width=50>" + operador + "</td></tr>");
					out.print("<td width=50>" + v + "</td></tr>");

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