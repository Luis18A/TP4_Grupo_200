package ar.edu.unju.edm.model;

import java.util.Date;

public class ParqueNacional {

	private String nombre;
	private Date fechaDeclaracion;
	private int extension;
	private String ubicacionGeografica;
	private OrganismoProvincial nombreOrganismo;
	
	public ParqueNacional() {
		// TODO Auto-generated constructor stub
	}

	public ParqueNacional(String nombre, Date fechaDeclaracion, int extension, String ubicacionGeografica,
			OrganismoProvincial nombreOrganismo) {
		super();
		this.nombre = nombre;
		this.fechaDeclaracion = fechaDeclaracion;
		this.extension = extension;
		this.ubicacionGeografica = ubicacionGeografica;
		this.nombreOrganismo = nombreOrganismo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaDeclaracion() {
		return fechaDeclaracion;
	}

	public void setFechaDeclaracion(Date fechaDeclaracion) {
		this.fechaDeclaracion = fechaDeclaracion;
	}

	public int getExtension() {
		return extension;
	}

	public void setExtension(int extension) {
		this.extension = extension;
	}

	public String getUbicacionGeografica() {
		return ubicacionGeografica;
	}

	public void setUbicacionGeografica(String ubicacionGeografica) {
		this.ubicacionGeografica = ubicacionGeografica;
	}

	public OrganismoProvincial getNombreOrganismo() {
		return nombreOrganismo;
	}

	public void setNombreOrganismo(OrganismoProvincial nombreOrganismo) {
		this.nombreOrganismo = nombreOrganismo;
	}

	@Override
	public String toString() {
		return "ParqueNacional [nombre=" + nombre + ", fechaDeclaracion=" + fechaDeclaracion + ", extension="
				+ extension + ", ubicacionGeografica=" + ubicacionGeografica + ", nombreOrganismo=" + nombreOrganismo
				+ "]";
	}
}