<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="modelo.*" %>
    
    <%Usuario usuario = (Usuario)request.getAttribute("usuario");%>
<%Boolean iniciado = (Boolean)request.getSession().getAttribute("iniciado");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println(usuario.getNombre());
out.println(iniciado);
%>
</body>
</html>