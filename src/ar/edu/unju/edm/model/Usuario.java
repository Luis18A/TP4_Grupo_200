package ar.edu.unju.edm.model;

public class Usuario {
	
	private String nombreUsuario;
	private String contrase�a;
	private String nombre;
	private String apellido;
	private int dni;
	private String correo;
	private String tipoUsuario;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombreUsuario, String contrase�a, String nombre, String apellido, int dni, String correo,
			String tipoUsuario) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrase�a = contrase�a;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.correo = correo;
		this.tipoUsuario = tipoUsuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + dni;
		result = prime * result + ((nombreUsuario == null) ? 0 : nombreUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (dni != other.dni)
			return false;
		if (nombreUsuario == null) {
			if (other.nombreUsuario != null)
				return false;
		} else if (!nombreUsuario.equals(other.nombreUsuario))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "[nombreUsuario=" + nombreUsuario + ", dni=" + dni + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
}