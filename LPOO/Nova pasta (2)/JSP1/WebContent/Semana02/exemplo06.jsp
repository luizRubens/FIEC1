<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<% 
String aux = request.getParameter("sexo");
out.print("Sexo recebido:<b>"+aux+"</b><br>");
 
aux = request.getParameter("fuman");
if (aux.equals("sim")){
	
	out.print("<b>Fumante</b><br>");
	
}
else {
	
	out.print("<b>Não fumante</b><br>");
	
}


%>




</body>
</html>