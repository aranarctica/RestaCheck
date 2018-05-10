<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.Restaurante"%>
<%@page import="modelo.RestauranteModelo"%>
<%@ page import="java.util.ArrayList" %>
 <%@ page import="java.util.Iterator" %>

<%
	int idRestaurante = Integer.parseInt(request.getParameter("idRestaurante"));
	RestauranteModelo restauranteModelo = new RestauranteModelo();
	Restaurante restaurante = restauranteModelo.selectPorid(idRestaurante);
	

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
	<td><%= restaurante.getNombre() %></td>
	</tr>
</table>
</body>
</html>