<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.Usuario"%>
<%@page import="modelo.UsuarioModelo"%>



<%
String email = request.getParameter("email");
String contrasena = request.getParameter("contrasena");
if (email != null && contrasena != null){
 	UsuarioModelo usuarioModelo = new UsuarioModelo();
 	Usuario usuario = usuarioModelo.selectEmailContrasena(email, contrasena);
 	if(usuario == null){
	response.sendRedirect("login_form.jsp");
	}else{
		session.setAttribute("iniciado", "si");
		session.setAttribute("rol", usuario.getRol());
		response.sendRedirect("sistema.jsp");
	}
}else{
	response.sendRedirect("login_form.jsp");
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>