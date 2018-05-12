package modelo;

import java.util.ArrayList;

public class Cocinero extends Conector{

	private int idCocinero;
	private String nombre;
	private String apellido;
	private String trabaja;

	ArrayList<Restaurante> restaurante;

	public ArrayList<Restaurante> getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(ArrayList<Restaurante> restaurante) {
		this.restaurante = restaurante;
	}

	public int getIdCocinero() {
		return idCocinero;
	}

	public void setIdCocinero(int idCocinero) {
		this.idCocinero = idCocinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTrabaja() {
		return trabaja;
	}

	public void setTrabaja(String trabaja) {
		this.trabaja = trabaja;
	}

}
