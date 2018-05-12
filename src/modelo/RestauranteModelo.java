package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RestauranteModelo extends Conector {

	public ArrayList<Restaurante> selectAll() {
		ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM restaurante");
			while (rs.next()) {
				Restaurante restaurante = new Restaurante();
				restaurante.setIdRestaurante(rs.getInt("idRestaurante"));
				restaurante.setNombre(rs.getString("nombre"));
				restaurantes.add(restaurante);

			}
			return restaurantes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurantes;
	}

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
				restaurante.setPrecio(rs.getString("precio"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurante;
	}
	
	public void insert(Restaurante restaurante) {

		try {
			PreparedStatement pst = super.conexion
					.prepareStatement("INSERT INTO restaurante (nombre, direccion) values(?,?)");
			pst.setString(1, restaurante.getNombre());
			pst.setString(2, restaurante.getDireccion());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	
	
}
