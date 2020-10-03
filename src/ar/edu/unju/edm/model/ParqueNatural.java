package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParqueNatural {

	private int codParque;
	private String nombre;
	private LocalDate fechaDeclaracion;
	private int extension;
	private String ubicacionGeografica;
	private Provincia provincia;
	private OrganismoProvincial nombreOrganismo;
	private Map<Integer,Especie> especies = new HashMap<Integer,Especie>();
	
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

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public OrganismoProvincial getNombreOrganismo() {
		return nombreOrganismo;
	}

	public void setNombreOrganismo(OrganismoProvincial nombreOrganismo) {
		this.nombreOrganismo = nombreOrganismo;
	}

	public Map<Integer, Especie> getEspecies() {
		return especies;
	}

	public void setEspecies(Map<Integer, Especie> especies) {
		this.especies = especies;
	}

	public ParqueNatural(int codParque, String nombre, LocalDate fechaDeclaracion, int extension,
			String ubicacionGeografica, Provincia provincia, OrganismoProvincial nombreOrganismo,
			Map<Integer, Especie> especies) {
		super();
		this.codParque = codParque;
		this.nombre = nombre;
		this.fechaDeclaracion = fechaDeclaracion;
		this.extension = extension;
		this.ubicacionGeografica = ubicacionGeografica;
		this.provincia = provincia;
		this.nombreOrganismo = nombreOrganismo;
		this.especies = especies;
	}

	@Override
	public String toString() {
		return "Parque Natural [Código Parque Natural=" + codParque + ", Nombre=" + nombre + ", Fecha de Declaración=" + fechaDeclaracion
				+ ", Extensión=" + extension + ", Ubicacion Geográfica=" + ubicacionGeografica + ", Provincia="
				+ provincia + ", Nombre del Organismo Provincial=" + nombreOrganismo + ", Especies que habitan=" + especies + "]";
	}

	
	public int calcularAnios() {
		int a=0;
		int anio= fechaDeclaracion.getYear();
		a= LocalDate.now().getYear()-anio;
		return a;
	}
	
}