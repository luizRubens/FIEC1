<%@page contentType="text/html" pageEncoding="ISO-8859-1"
	import="banco.*, java.io.*,  java.sql.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controle de cliente</title>
<link rel="stylesheet" href="estilo.css" type="text/css">
<script src="function.js" type="text/javascript"></script>
</head>
<body>
	<form name="form1" action="manutencao.jsp" method="get">
		<B>Busca por Nome: </B><input class="text1" type="text" name="p_nome"
			size="25" maxlength="25"> <input type="Submit"
			value=" Localizar ">
	</form>
	<%
		BDSQL bd = new BDSQL();
		if (bd.getConnection()) {
			try {
				String nome = request.getParameter("p_nome");
				String sql = "Select * from cliente order by nome "; //default
				if (nome != null)
					sql = "Select * from cliente WHERE nome like '" + nome
							+ "%' order by nome";
				bd.st = bd.con.prepareStatement(sql);
				bd.rs = bd.st.executeQuery();
				out.println("<form action='mostrarcliente.jsp' method='get'>");
				out.println("<table bgcolor='buttonface' border=1 cellspacing='0'>");
				out.println("<tr><th class='Label2' width='70'>Código</th>"
						+ "<th class='Label2' width='300'>Nome</th></tr>");
				bd.rs.next();
				do {
					String cod = bd.rs.getString("codigo");
					String nom = bd.rs.getString("nome");
					out.println("<tr><td onMouseOver='colorir(this)' onMouseOut='normal(this)' >"
							+ "<a class='Menu' href='mostrarcliente.jsp?p_codigo="
							+ cod + "' target='dir'> " + cod + "</a></td>");
					out.println("<td class='Label2'>" + nom + "</td></tr>");
				} while (bd.rs.next());
				out.println("</table></form>");
				bd.close();
			} catch (SQLException e) {
				if (e.getErrorCode() == 0) // Nenhum registro encontrado
					out.println("<font color='red' size=4>Nenhum registro encontrado!</font>");
				if (e.getErrorCode() == 1146) // tabela não existe
					out.println("<font color='red' size=4>Erro ao ler arquivo!</font>");
			}
		} else {
			out.println("<font color='red' size=5>Problemas na conexão! </font>");
		}
	%>
</body>
</html>
