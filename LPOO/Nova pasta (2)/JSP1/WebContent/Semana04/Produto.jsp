<%@page import="beans.BD"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabelinha de preços</title>
</head>
<body>
	<font face="calibri" size="5px">
		<p>Produtos</p> <%
 	int cod;
 	String descricao;
 	String marca;
 	float estoque;
 	float preco;

 	String sql = "select * from produto";

 	BD bd = new BD();
 	try {
 		bd.getConnection();
 		bd.st = bd.con.prepareStatement(sql);
 		bd.rs = bd.st.executeQuery();

 		out.print("<table border=1 cellspacing=0>");
 		out.print("<tr bgcolor='orange'>");
 		out.print("<th>cod_produto</th><th>Descrição</th><th>Marca</th><th>Estoque</th><th>Preço</th></tr>");

 		while (bd.rs.next()) {

 			cod = bd.rs.getInt("cod_produto");
 			descricao = bd.rs.getString("descricao");
 			marca = bd.rs.getString("marca");
 			estoque = bd.rs.getFloat("estoque");
 			preco = bd.rs.getFloat("preco");

 			out.print("<tr><td width=50>" + cod + "</td>");
 			out.print("<td width=50>" + descricao + "</td>");
 			out.print("<td width=50>" + marca + "</td>");
 			out.print("<td width=50>" + estoque + "</td>");
 			out.print("<td width=50>" + preco + "</td></tr>");

 		}

 	} catch (SQLException err) {
 		JOptionPane.showMessageDialog(null, "Ocorreu um erro." + err.toString());
 	} finally {
 		bd.Close();
 	}
 %>
		<form action="Produto.jsp" method="get">
			<input type="radio" name="tipo" value="cod">Código <input
				type="radio" name="tipo" value="nome">Descricao<br> <input
				type="text" value="descricao">
		</form>

	</font>
</body>
</html>