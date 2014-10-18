<%@page import="java.sql.SQLException"%>
<%@page import="banco.BDSQL"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"
        import= "java.io.*,  java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Controle de cliente</title>
        <link rel="stylesheet" href="estilo.css" type="text/css">
        <script src="function.js" type="text/javascript"></script>
    </head>
    <body>
<%
    BDSQL bdsql = new BDSQL();
    if (bdsql.getConnection()) {
        try {
            String codigo = request.getParameter("p_codigo");
            String sql = "SELECT codigo,nome FROM cliente WHERE codigo = ?";
            bdsql.st = bdsql.con.prepareStatement(sql);
            bdsql.st.setString(1, codigo);
            bdsql.rs = bdsql.st.executeQuery();
            bdsql.rs.next();
            String cod = bdsql.rs.getString("codigo");
            String nome = bdsql.rs.getString("nome");

            out.println("<form name=form1 action='alterarcliente.jsp' method='get'>");
            out.println("<body><table border=0 cellspacing=4>");
            out.println("<td class='Titulo' align=center colspan=2>Dados do Cliente</td><tr>");
            out.println("<td class='Label1'>Código:</b>&nbsp;</td><td class='Label2'>" + cod + "</td><tr>");
            out.println("<input type='hidden' name='p_codigo' value='" + codigo + "'>");
            out.println("<td class='Label1'>Nome:</td><td ><input class='Text1' type='text' " +
                    "name='p_nome' value='" + nome + "' size='40' maxlength='40'></td><tr>");
            out.println("</table>");
            out.println("<input class='Botao' type='button' name='bt4' value='Novo'"+
            		" onClick=window.open('inserir.html','dir')>");
            out.println("<input class='Botao' type='button' name='bt1' value='Excluir'"+
            		" onClick=excluir('excluircliente.jsp')>");
            out.println("<input class='Botao' type='button' name='bt2' value='Gravar'"+
            		" onClick=alterar('alterarcliente.jsp')>");
            out.println("<input class='Botao' type='button' name='bt3' value='Cancelar'"+
            		" onClick=window.open('blank.html','dir')>");
            out.println("</form>");
            bdsql.close();
        } catch (SQLException e) {
            out.println("<font color='red' size=5>Problemas na conexão!</font>");
        }
    } else {
        out.println("<font color='red' size=5>Problemas na conexão! </font>");
    }
%>

</body>
</html>
