package ar.edu.unju.edm.model;

public class Vegetal extends Especie{
	
	private boolean floracion;
	private String periodoProduccion;
	
	public Vegetal() {
		// TODO Auto-generated constructor stub
	}

	public Vegetal(boolean floracion, String periodoProduccion) {
		super();
		this.floracion = floracion;
		this.periodoProduccion = periodoProduccion;
	}
	
	public boolean getFloracion() {
		return floracion;
	}

	public void setFloracion(boolean floracion) {
		this.floracion = floracion;
	}

	public String getPeriodoProduccion() {
		return periodoProduccion;
	}

	public void setPeriodoProduccion(String periodoProduccion) {
		this.periodoProduccion = periodoProduccion;
	}

	@Override
	public String toString() {
		return "Vegetal [floracion=" + floracion + ", periodoProduccion=" + periodoProduccion + "]";
	}
}