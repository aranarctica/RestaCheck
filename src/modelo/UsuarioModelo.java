package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioModelo extends Conector {

	public ArrayList<Usuario> selectAll() {
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuarios");
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellido(rs.getString("apellido"));
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setContrasena(rs.getString("contrasena"));
				usuario.setEmail(rs.getString("email"));
				usuario.setRol(rs.getString("rol"));
				listaUsuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}

	public Usuario selectPorid(int idUsuario) {
		Usuario usuario = new Usuario();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM usuarios WHERE idUsuario=?");
			pst.setInt(1, idUsuario);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellido(rs.getString("apellido"));
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setContrasena(rs.getString("contrasena"));
				usuario.setEmail(rs.getString("email"));
				usuario.setRol(rs.getString("rol"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}

	public Usuario selectEmailContrasena(String email, String contrasena) {

		Statement st;
		ResultSet rs;
		try {
			st = super.conexion.createStatement();
			rs = st.executeQuery(
					"SELECT * FROM usuarios WHERE email='" + email + "'" + "AND contrasena='" + contrasena + "'");
			if (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("1"));
				usuario.setNombre(rs.getString("2"));
				usuario.setApellido(rs.getString("3"));
				usuario.setEmail(rs.getString("4"));
				usuario.setContrasena(rs.getString("5"));
				usuario.setTelefono(rs.getString("6"));
				usuario.setRol(rs.getString("7"));
				return usuario;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
