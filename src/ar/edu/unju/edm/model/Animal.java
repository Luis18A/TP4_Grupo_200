package ar.edu.unju.edm.model;

public class Animal extends Especie{
	
	private String tipoAlimentacion;
	private String periodosCelo;
	private boolean peligroExtincion;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public String getPeriodosCelo() {
		return periodosCelo;
	}

	public void setPeriodosCelo(String periodosCelo) {
		this.periodosCelo = periodosCelo;
	}

	public boolean isPeligroExtincion() {
		return peligroExtincion;
	}

	public void setPeligroExtincion(boolean peligroExtincion) {
		this.peligroExtincion = peligroExtincion;
	}

	public Animal(String tipoAlimentacion, String periodosCelo, boolean peligroExtincion) {
		super();
		this.tipoAlimentacion = tipoAlimentacion;
		this.periodosCelo = periodosCelo;
		this.peligroExtincion = peligroExtincion;
	}

	@Override
	public String toString() {
		return "Animal [tipoAlimentacion=" + tipoAlimentacion + ", periodosCelo=" + periodosCelo + ", peligroExtincion="
				+ peligroExtincion + "]";
	}

	
	
	
	
}