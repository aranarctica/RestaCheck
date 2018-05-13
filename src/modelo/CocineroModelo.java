package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CocineroModelo extends Conector {

	/**
	 * 
	 * Recoge todos los atributos de Cocinero y los delvuelve en un ArrayList
	 * @return ArrayList<Cocinero> lista Cocineros
	 */
	public ArrayList<Cocinero> selectAll() {
		ArrayList<Cocinero> cocineros = new ArrayList<Cocinero>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM cocineros");
			while (rs.next()) {
				Cocinero cocinero = new Cocinero();
				cocinero.setIdCocinero(rs.getInt("idCocineros"));
				cocinero.setNombre(rs.getString("nombre"));
				cocinero.setApellido(rs.getString("apellido"));

				cocineros.add(cocinero);

			}
			return cocineros;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cocineros;
	}

	/**
	 * Selecciona cada Cocinero por su codigo
	 * @param idCocineros tipo int
	 * @return Cocinero cocinero
	 */
	public Cocinero selectPorid(int idCocineros) {

		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM cocineros WHERE idCocineros=?");
			pst.setInt(1, idCocineros);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Cocinero cocinero = new Cocinero();
				cocinero.setIdCocinero(rs.getInt("idCocineros"));
				cocinero.setNombre(rs.getString("nombre"));
				cocinero.setApellido(rs.getString("apellido"));
				return cocinero;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
/**
 * Inserta un Cocinero en la Base De Datos
 * @param cocinero Añade un cocinero
 */
	public void insert(Cocinero cocinero) {

		try {
			PreparedStatement pst = super.conexion.prepareStatement("INSERT INTO cocineros (nombre, apellido) values(?,?)");
			pst.setString(1, cocinero.getNombre());
			pst.setString(2, cocinero.getApellido());
		

			

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
