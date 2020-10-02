package ar.edu.unju.edm.model;

import java.util.HashMap;
import java.util.Map;

public class Especie {
	
	private String denominacionCientifica;
	private String denominacionVulgar;
	private int codigoNumerico;
	private String tipoEspecie;
	private Map<Integer,ParqueNatural> parquesNaturales = new HashMap<Integer,ParqueNatural>();
	
	public Especie() {
		// TODO Auto-generated constructor stub
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

	public Map<Integer, ParqueNatural> getParquesNaturales() {
		return parquesNaturales;
	}

	public void setParquesNaturales(Map<Integer, ParqueNatural> parquesNaturales) {
		this.parquesNaturales = parquesNaturales;
	}

	public Especie(String denominacionCientifica, String denominacionVulgar, int codigoNumerico, String tipoEspecie,
			Map<Integer, ParqueNatural> parquesNaturales) {
		super();
		this.denominacionCientifica = denominacionCientifica;
		this.denominacionVulgar = denominacionVulgar;
		this.codigoNumerico = codigoNumerico;
		this.tipoEspecie = tipoEspecie;
		this.parquesNaturales = parquesNaturales;
	}

	@Override
	public String toString() {
		return "Especie [denominacionCientifica=" + denominacionCientifica + ", denominacionVulgar="
				+ denominacionVulgar + ", codigoNumerico=" + codigoNumerico + ", tipoEspecie=" + tipoEspecie
				+ ", parquesNaturales=" + parquesNaturales + "]";
	}

	
	
	
}
