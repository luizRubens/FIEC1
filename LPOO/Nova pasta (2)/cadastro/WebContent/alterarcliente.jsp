<%@page contentType="text/html" pageEncoding="ISO-8859-1" import="banco.*"%>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Altera��o de cliente</title>
        <link rel="stylesheet" href="estilo.css" type="text/css">
        <script src="function.js" type="text/javascript"></script>
  </head>
  <body>
        <% 
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.cliente.setCodigo(request.getParameter("p_codigo"));
        clienteDAO.cliente.setNome(request.getParameter("p_nome"));
        out.println(clienteDAO.atualizar(clienteDAO.ALTERACAO));
        out.println("<a href='manutencao.jsp' target='esq' " +
        		"onClick=window.open('blank.html','dir')>OK</a>");
        %>
  </body>
</html>
