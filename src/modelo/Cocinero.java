package modelo;

import java.io.File;
import java.io.InputStream;
import java.sql.Blob;
import java.util.ArrayList;

public class Cocinero extends Conector {
/**
 * Atributos de Cocinero
 * 
 * 
 */
	private int idCocinero;
	private String nombre;
	private String apellido;


	



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

	

}
