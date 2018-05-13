package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RestauranteModelo extends Conector {
	/**
	 * 
	 * Recoge todos los atributos de Restaurantes y los delvuelve en un ArrayList
	 * @return ArrayList<Restaurate> lista Restaurantes
	 */
	public ArrayList<Restaurante> selectAll() {
		ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM restaurante");
			while (rs.next()) {
				Restaurante restaurante = new Restaurante();
				restaurante.setIdRestaurante(rs.getInt("idRestaurante"));
				restaurante.setNombre(rs.getString("nombre"));
				restaurante.setTelefono(rs.getString("telefono"));
				restaurantes.add(restaurante);

			}
			return restaurantes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurantes;
	}
	/**
	 * Selecciona cada Restaurante por su codigo
	 * @param idRestaurantes tipo int
	 * @return Restaurante restaurante
	 */

	public Restaurante selectPorid(int idRestaurante) {
		Restaurante restaurante = new Restaurante();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM restaurante WHERE idRestaurante=?");
			pst.setInt(1, idRestaurante);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				restaurante.setIdRestaurante(rs.getInt("idRestaurante"));
				restaurante.setNombre(rs.getString("nombre"));
				restaurante.setDireccion(rs.getString("direccion"));
				restaurante.setTelefono(rs.getString("telefono"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurante;
	}
	/**
	 * Inserta un Restaurante en la Base De Datos
	 * @param restaurante Añade un restaurante
	 */
	public void insert(Restaurante restaurante) {

		try {
			PreparedStatement pst = super.conexion.prepareStatement("INSERT INTO restaurante (nombre, direccion, telefono) values(?,?,?)");
			pst.setString(1, restaurante.getNombre());
			pst.setString(2, restaurante.getDireccion());
			pst.setString(3, restaurante.getTelefono());
			

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	
	
}
