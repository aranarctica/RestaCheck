package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CocineroModelo extends Conector{

	public ArrayList<Cocinero> selectAll(){
		ArrayList<Cocinero> cocineros = new ArrayList<Cocinero>();
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM cocineros");
			while(rs.next()){
				Cocinero cocinero = new Cocinero();
				cocinero.setIdCocinero(rs.getInt("idCocineros"));
				cocinero.setNombre(rs.getString("nombre"));
				cocinero.setApellido(rs.getString("apellido"));
				cocinero.setTrabaja(rs.getInt("trabaja"));
				cocineros.add(cocinero);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cocineros;
	}
	
	public Cocinero selectPorid(int idCocineros){
		Cocinero cocinero = new Cocinero();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM cocineros WHERE idCocineros=?");
			pst.setInt(1, idCocineros);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				cocinero.setIdCocinero(rs.getInt("idCocineros"));
				cocinero.setNombre(rs.getString("nombre"));
				cocinero.setApellido(rs.getString("apellido"));
				cocinero.setTrabaja(rs.getInt("trabaja"));		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cocinero;
	}
	
	
}
