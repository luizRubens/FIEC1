<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP Page</title>
</head>
<body>
<b>Rodou.....<b><br>
<br>
<b>N�meros Sorteados:<b><br>
<%
	for (int i = 0; i < 10; i++) {

		int n = (int) (Math.random() * 100);

		if (n % 2 == 0) {

			out.println("<font color=red><b>" + n + "</b></font><br>");

		} else {

			out.println("<font color=blue><b>" + n + "</b></font><br>");

		}

	}
%>

</body>
</html>