<%@page import="sqlserver.EnqueteDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="sqlserver.BDSQL"%>
<%@page import="org.jfree.data.general.DefaultPieDataset"%>
<%@page import="org.jfree.chart.ChartUtilities"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="org.jfree.chart.plot.PlotOrientation"%>
<%@page import="org.jfree.chart.*"%>
<%@page import="org.jfree.chart.JFreeChart"%>
<%@page import="org.jfree.data.category.DefaultCategoryDataset"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Geração de gráficos</title>
</head>
<body>
	<%
		DefaultCategoryDataset ds = new DefaultCategoryDataset();
			//	int[] v = { 10, 30, 15, 5 };//quantidade de votos que provem do banco de dados, esses daqui são apenas para testar

			/*	ds.addValue(v[0], "Votos", "Monica");
		ds.addValue(v[1], "Votos", "Fernando");
		ds.addValue(v[2], "Votos", "Daniel");
		ds.addValue(v[3], "Votos", "Outros");

		//cria grafico

		JFreeChart grafico = ChartFactory.createBarChart(
				"Resultado da Votação", "Canditados", "Quantidade", ds,
				PlotOrientation.VERTICAL, true, true, false);
		JFreeChart grafico2 = ChartFactory.createLineChart(
				"Resultado da Votação", "Canditados", "Quantidade", ds,
				PlotOrientation.VERTICAL, true, true, false);
		JFreeChart grafico3 = ChartFactory.createBarChart3D(
				"Resultado da Votação", "Canditados", "Quantidade", ds,
				PlotOrientation.VERTICAL, true, true, false);

		OutputStream arq = new FileOutputStream(
				"C:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico.png");
		OutputStream arq2 = new FileOutputStream(
				"C:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico1.png");
		OutputStream arq3 = new FileOutputStream(
				"C:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico2.png");

		ChartUtilities.writeChartAsPNG(arq, grafico, 300, 200);
		ChartUtilities.writeChartAsPNG(arq2, grafico2, 300, 200);
		ChartUtilities.writeChartAsPNG(arq3, grafico2, 300, 200);

		arq.close();
		arq2.close();
		arq3.close();

		out.print("<img src='c:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico.png'>'");
		out.print("<img src='c:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico1.png'>'");
		out.print("<img src='c:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico2.png'>'");

		//grafico de pizza feito a pedido do kleber

		DefaultPieDataset piz = new DefaultPieDataset();
		piz.setValue("Monica", v[0]);
		piz.setValue("Fernando", v[1]);
		piz.setValue("Daniel", v[2]);
		piz.setValue("Outros", v[3]);

		JFreeChart grafico4 = ChartFactory.createPieChart3D(
				"Resultado da Votação", piz);

		OutputStream arq4 = new FileOutputStream(
				"C:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico3.png");
		ChartUtilities.writeChartAsPNG(arq4, grafico4, 300, 200);
		out.print("<img src='c:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico3.png'>'");

		arq4.close();
			 */
			 
		int id = Integer.parseInt(request.getParameter("cand"));

		EnqueteDAO e = new EnqueteDAO();

		e.adicionarVoto(id);
		
			int m = 0;
			int f = 0;
			int d = 0;
			int o = 0;

			BDSQL bdsql = new BDSQL();

			String sql = "select * from enquete";

			try {
		bdsql.getConnection();
		bdsql.st = bdsql.con.prepareStatement(sql);
		bdsql.rs = bdsql.st.executeQuery();
		bdsql.rs.next();

		m = bdsql.rs.getInt("voto1");
		f = bdsql.rs.getInt("voto2");
		d = bdsql.rs.getInt("voto3");
		o = bdsql.rs.getInt("voto4");

		System.out.print(m);

		int v[];

		ds.addValue(m, "Votos", "Monica");
		ds.addValue(f, "Votos", "Fernando");
		ds.addValue(d, "Votos", "Daniel");
		ds.addValue(o, "Votos", "Outros");

		JFreeChart grafico5 = ChartFactory.createBarChart3D(
				"Resultado da Votação", "Canditados", "Quantidade", ds,
				PlotOrientation.VERTICAL, true, true, false);

		OutputStream arq5 = new FileOutputStream(
				"C:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico5.png");

		ChartUtilities.writeChartAsPNG(arq5, grafico5, 300, 200);

		arq5.close();

		out.print("<img src='c:/Users/LuizR.Ribas/Desktop/FIEC/LPOO/grafico5.png'>'");

			} catch (SQLException e2) {
		System.out.print(e2.toString());

			}
	%>
</body>
</html>