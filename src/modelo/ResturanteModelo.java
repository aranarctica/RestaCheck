package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ResturanteModelo extends Conector {
	
	public ArrayList<Restaurante> selectAll(){
		ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM restaurante");
			while(rs.next()){
				Restaurante restaurante = new Restaurante();
				restaurante.setIdRestaurante(rs.getInt("idRestaurante"));
				restaurante.setNombre(rs.getString("nombre"));
				restaurante.setDireccion(rs.getString("direccion"));
				restaurante.setTelefono(rs.getString("restaurante"));
				restaurante.setPrecio(rs.getString("precio"));
				
				restaurantes.add(restaurante);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurantes;
	}
	
	
	public Restaurante selectPorid(int idRestaurante){
		Restaurante restaurante = new Restaurante();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM restaurante WHERE idRestaurante=?");
			pst.setInt(1, idRestaurante);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				restaurante.setIdRestaurante(rs.getInt("idRestaurante"));
				restaurante.setNombre(rs.getString("nombre"));
				restaurante.setDireccion(rs.getString("direccion"));
				restaurante.setTelefono(rs.getString("restaurante"));
				restaurante.setPrecio(rs.getString("precio"));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return restaurante;
	}
	

}
