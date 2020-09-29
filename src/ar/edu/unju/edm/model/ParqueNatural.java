package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ParqueNatural {

	private int codParque;
	private String nombre;
	private LocalDate fechaDeclaracion;
	private int extension;
	private String ubicacionGeografica;
	private OrganismoProvincial nombreOrganismo;
	List<Especie> especies = new ArrayList<Especie>();
	
	public ParqueNatural() {
		// TODO Auto-generated constructor stub
	}

	public int getCodParque() {
		return codParque;
	}

	public void setCodParque(int codParque) {
		this.codParque = codParque;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeclaracion() {
		return fechaDeclaracion;
	}

	public void setFechaDeclaracion(LocalDate fechaDeclaracion) {
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

	public List<Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(List<Especie> especies) {
		this.especies = especies;
	}

	public ParqueNatural(int codParque, String nombre, LocalDate fechaDeclaracion, int extension,
			String ubicacionGeografica, OrganismoProvincial nombreOrganismo, List<Especie> especies) {
		super();
		this.codParque = codParque;
		this.nombre = nombre;
		this.fechaDeclaracion = fechaDeclaracion;
		this.extension = extension;
		this.ubicacionGeografica = ubicacionGeografica;
		this.nombreOrganismo = nombreOrganismo;
		this.especies = especies;
	}

	@Override
	public String toString() {
		return "ParqueNatural [codParque=" + codParque + ", nombre=" + nombre + ", fechaDeclaracion=" + fechaDeclaracion
				+ ", extension=" + extension + ", ubicacionGeografica=" + ubicacionGeografica + ", nombreOrganismo="
				+ nombreOrganismo + ", especies=" + especies + "]";
	}

	

	
}