package ar.edu.unju.edm.model;

public class Animal extends Especie{
	
	private String tipoAlimentacion;
	private String periodosCelo;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String tipoAlimentacion, String periodosCelo) {
		super();
		this.tipoAlimentacion = tipoAlimentacion;
		this.periodosCelo = periodosCelo;
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

	@Override
	public String toString() {
		return "Animal [tipoAlimentacion=" + tipoAlimentacion + ", periodosCelo=" + periodosCelo + "]";
	}
}