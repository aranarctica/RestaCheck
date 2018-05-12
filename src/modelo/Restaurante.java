package modelo;

import java.util.ArrayList;

public class Restaurante extends Conector{

	private int idRestaurante;
	private String nombre;
	private String direccion;
	private String telefono;
	private String precio;
	ArrayList<Cocinero> Cocinero;

	public ArrayList<Cocinero> getCocinero() {
		return Cocinero;
	}

	public void setCocinero(ArrayList<Cocinero> cocinero) {
		Cocinero = cocinero;
	}

	public int getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(int idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	

}
