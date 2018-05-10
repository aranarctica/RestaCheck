package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	
	public static void main (String[] args){
		
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		ArrayList<Usuario> usuarios = usuarioModelo.selectAll();
		Iterator<Usuario> i = usuarios.iterator();
		while (i.hasNext()){
			Usuario usuario = new Usuario();
			usuario = (Usuario) i.next();
			System.out.println("Este usuario se llama " + usuario.getNombre() + usuario.getApellido());
		}
		
		
	}
	
}
