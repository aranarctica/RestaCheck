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
		String email = request.getParameter("email");
		String contrasena = request.getParameter("contrasena");
		String telefono = request.getParameter("telefono");
		
		
		Usuario usuario = new Usuario();
		
		if (nombre != "" && apellido != "" && email != "" && contrasena != "" && telefono != "") {
		
			usuarioModelo.insertarUsuario(usuario);
			response.sendRedirect("web/categoria.html");
		} else {
			
			 
		}
	}
}
