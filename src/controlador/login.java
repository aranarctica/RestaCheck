package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.UsuarioModelo;


public class login extends HttpServlet{
	
	Usuario usuario = new Usuario();
	UsuarioModelo usuarioModelo = new UsuarioModelo();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		
		usuario = usuarioModelo.selectEmailContrasena(email, contrasena);
		if (usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena)) {
			request.getSession().setAttribute("iniciado", true); 
			request.setAttribute("usuario", usuario);
			RequestDispatcher dispatcher = request.getRequestDispatcher("web/gestor_login/sistema.jsp");
			dispatcher.forward(request, response);
		} else {
			
		}
	}
}
