<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dados Pessoais</title>
</head>
<body>
	<font face="calibri" size=4px> <%
		String nom = request.getParameter("nome");
		String sex = request.getParameter("sexo");
		String est = request.getParameter("estado");
		//strings dos checkbox
		String fute = request.getParameter("fut");
		String nata = request.getParameter("nat");
		String vole = request.getParameter("vol");
		String cami = request.getParameter("cam");
		String bici = request.getParameter("bic");
		String outr = request.getParameter("outros");
		String aux = "";

		//parte logica
		int n = Integer.parseInt(est);
		if (est.equals("1")) {

			est = "São Paulo";

		} else if (est.equals("2")) {

			est = "Paraná";

		} else if (est.equals("3")) {

			est = "Minas Gerais";

		} else if (est.equals("4")) {

			est = "Rio Grande do Sul";

		}

		if (fute != null) {
			aux += fute + ", ";
		}
		if (nata != null) {
			aux += nata + ", ";
		}
		if (vole != null) {
			aux += vole + ", ";
		}
		if (cami != null) {
			aux += cami + ", ";
		}
		if (outr != null) {
			aux += outr + ", ";
		}

		//a ser exibido
		out.print("<b>Nome:</b> " + nom + "<br><br>");
		out.print("<b>Sexo:</b>" + sex + "<br><br>");
		out.print("<b>Estado: </b>" + est + "<br><br>");

		out.print("<font size=4px>Atividades preferidas:</font><br><ul><li>"
				+ aux + "</ul>");
	%>
	</font>
</body>
</html>