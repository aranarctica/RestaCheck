package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioModelo extends Conector {
	/**
	 * 
	 * Recoge todos los atributos de Usuario y los delvuelve en un ArrayList
	 * 
	 * @return ArrayList<Usuario> lista Usuarios
	 */
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

	/**
	 * Selecciona cada Usuario por su codigo
	 * 
	 * @param idUsuarios
	 *            tipo int
	 * @return Usuario usuario
	 */

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
	/**
	 * 
	 * 
	 * Selecciona los datos email y contrasena desde la base de datos
	 * @param email parametro email de la base de datos
	 * @param contrasena parametro contrasena de la base de datos
	 * @return recibe un usuario
	 */

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

	/**
	 * Inserta un Usuario en la Base De Datos
	 * 
	 * @param usuario
	 *            Añade un Usuario
	 */
	public void insertarUsuario(Usuario usuario) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement(
					"INSERT INTO usuarios (nombre, apellido, email, contrasena, telefono, rol) VALUES(?,?,?,?,?,?)");
			pst.setString(1, usuario.getNombre());
			pst.setString(2, usuario.getApellido());
			pst.setString(3, usuario.getEmail());
			pst.setString(4, usuario.getContrasena());
			pst.setString(5, usuario.getTelefono());
			pst.setString(6, usuario.getRol());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
