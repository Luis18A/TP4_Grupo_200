package ar.edu.unju.edm.model;

public class Especie {
	
	private String denominacionCientifica;
	private String denominacionVulgar;
	private int codigoNumerico;
	private String tipoEspecie;
	
	public Especie() {
		// TODO Auto-generated constructor stub
	}

	public Especie(String denominacionCientifica, String denominacionVulgar, int codigoNumerico, String tipoEspecie) {
		super();
		this.denominacionCientifica = denominacionCientifica;
		this.denominacionVulgar = denominacionVulgar;
		this.codigoNumerico = codigoNumerico;
		this.tipoEspecie = tipoEspecie;
	}

	public String getDenominacionCientifica() {
		return denominacionCientifica;
	}

	public void setDenominacionCientifica(String denominacionCientifica) {
		this.denominacionCientifica = denominacionCientifica;
	}

	public String getDenominacionVulgar() {
		return denominacionVulgar;
	}

	public void setDenominacionVulgar(String denominacionVulgar) {
		this.denominacionVulgar = denominacionVulgar;
	}

	public int getCodigoNumerico() {
		return codigoNumerico;
	}

	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}

	public String getTipoEspecie() {
		return tipoEspecie;
	}

	public void setTipoEspecie(String tipoEspecie) {
		this.tipoEspecie = tipoEspecie;
	}

	@Override
	public String toString() {
		return "Especie [denominacionCientifica=" + denominacionCientifica + ", denominacionVulgar="
				+ denominacionVulgar + ", codigoNumerico=" + codigoNumerico + ", tipoEspecie=" + tipoEspecie + "]";
	}
}
