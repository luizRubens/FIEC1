<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recebe dados da aplicação cliente</title>
</head>
<body>
	<%
		String cor = request.getParameter("cor");

		int n = Integer.parseInt(cor);
		
		if(cor.equals("1")){
			cor="red";
			
		}
		else if(cor.equals("2")){
			cor="lightgreen";
			
		}
		else if(cor.equals("3")){
			cor="blue";
			
		}
		else if(cor.equals("4")){
			cor="orange";
			
		}
		else if(cor.equals("5")){
			cor="gray";
			
		}
		else if(cor.equals("6")){
			cor="green";
			
		}
		else{
			cor="white";
		}
		
		out.print("<body bgcolor=" + cor+">" );
	%>
</body>
</html>