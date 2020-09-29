package ar.edu.unju.edm.model;

public class Administrativo extends Usuario {
	
	public Administrativo() {
		// TODO Auto-generated constructor stub
	}
	
	public Administrativo(String nombreUsuario, String contraseña, String nombre, String apellido, int dni, String correo,
			String tipoUsuario) {
		super(nombreUsuario,contraseña,nombre,apellido,dni,correo,tipoUsuario);

	}
}

