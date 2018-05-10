package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.UsuarioModelo;

public class crearCuenta extends HttpServlet{
	UsuarioModelo usuarioModelo = new UsuarioModelo();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String telefono = request.getParameter("email");
		String email = request.getParameter("contrasena");
		String contrasena = request.getParameter("telefono");
		
		
		Usuario usuario = new Usuario();
		
		if (nombre != "" && apellido != "" && email != "" && contrasena != "") {
		
			usuarioModelo.insertarUsuario(usuario);
			response.sendRedirect("web/cateoria.html");
		} else {
			
			 
		}
	}
}
