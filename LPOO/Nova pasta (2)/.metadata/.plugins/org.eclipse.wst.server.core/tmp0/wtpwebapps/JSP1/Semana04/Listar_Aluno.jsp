<%@page import="beans.BD"%>
<%@page import="javax.swing.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alunos cadastrados</title>
</head>
<body>
	<%
		BD bd = new BD();

		try {
			bd.getConnection(); //conecta com o banco
			String sql = "select * from aluno"; //instrução sql que vai ser executada

			bd.st = bd.con.prepareStatement(sql); //o statement sabe como executar o comando
			bd.rs = bd.st.executeQuery(); //o execute executa o comando

			//aqui sera feito um laço que ira ler as informações no banco de dados.
			//e enquanto houver mais um registro estará sendo efetuada a busca.	
			out.print("<table border=1 cellspacing=0>");
			out.print("<tr bgcolor='orange'>");
			out.print("<th>cod_aluno</th><th>Nome</th></tr>");

			while (bd.rs.next()) {
				int cod_aluno = bd.rs.getInt("cod_aluno");
				String nome = bd.rs.getString("nome");
				out.print("<tr><td width=50>" + cod_aluno + "</td>");
				out.print("<td width=50>" + nome + "</td></tr>");

			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro." + e.toString());
		} finally {
			bd.Close();
		}

		//No ambiente web é necessario colocar o driver no web-inf -> lib
	%>
</body>
</html>