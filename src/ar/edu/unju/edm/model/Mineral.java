package ar.edu.unju.edm.model;

public class Mineral extends Especie{
	
	private String tipoMineral;
	
	public Mineral() {
		// TODO Auto-generated constructor stub
	}

	public Mineral(String tipoMineral) {
		super();
		this.tipoMineral = tipoMineral;
	}

	public String getTipoMineral() {
		return tipoMineral;
	}

	public void setTipoMineral(String tipoMineral) {
		this.tipoMineral = tipoMineral;
	}

	@Override
	public String toString() {
		return "Mineral [Codigo Numerico=" + getCodigoNumerico() + ", Denominación científica=" + getDenominacionCientifica() + ", Denominación vulgar=" + getDenominacionVulgar() + 
				", Tipo de especie=" + getTipoEspecie() + ", Tipo de Mineral=" + tipoMineral + "]";
	}
	
	
}
