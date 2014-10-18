<%@page contentType="text/html" pageEncoding="ISO-8859-1" 
        import="beans.*, java.io.*,  java.sql.*"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Controle de Clientes</title>
        <link rel="stylesheet" href="estilo.css" type="text/css">
        <script src="function.js" type="text/javascript"></script>
    </head>
    <body>
        <form name="form1" action="manutencao.jsp" method="get">
            <B>Busca por Nome: </B><input class="text1" type="text" name="p_nome" size="25" maxlength="25">
            <input type="Submit" value=" Localizar ">
        </form>
<%
    BD bd = new BD();
    if (bd.getConnection()) {
        try{
            String nome = request.getParameter("p_nome");
            String sql = "Select * from clientes order by nome limit 0,10"; //default
            if(nome!=null)
                sql="Select * from clientes WHERE nome like '" + nome + "%' order by nome limit 0,10";
            bd.statement = bd.connection.prepareStatement(sql);
            bd.resultSet = bd.statement.executeQuery();
            out.println("<form action='mostrarcliente.jsp' method='get'>");
            out.println("<table bgcolor='buttonface' border=1 cellspacing='0'>");
            out.println("<tr><th class='Label2' width='70'>C�digo</th>"+
            			"<th class='Label2' width='300'>Nome</th></tr>");
            bd.resultSet.first();
            do {
              String cod = bd.resultSet.getString("codigo");
              String nom = bd.resultSet.getString("nome");
              out.println("<tr><td onMouseOver='colorir(this)' onMouseOut='normal(this)' >"+
            		  "<a class='Menu' href='mostrarcliente.jsp?p_codigo="+cod+"' target='dir'> "+
            				  cod+"</a></td>");
              out.println("<td class='Label2'>"+nom+"</td></tr>");
         }
         while(bd.resultSet.next());
         out.println("</table></form>");
         bd.close();
        }
        catch(SQLException e)
        {
          if (e.getErrorCode()==0) // Nenhum registro encontrado
            out.println("<font color='red' size=4>Nenhum registro encontrado!</font>");
          if (e.getErrorCode()==1146) // tabela n�o existe
            out.println("<font color='red' size=4>Erro ao ler arquivo!</font>");
        }
     }
     else {
        out.println("<font color='red' size=5>Problemas na conex�o! </font>");
     }
%>
    </body>
</html>
