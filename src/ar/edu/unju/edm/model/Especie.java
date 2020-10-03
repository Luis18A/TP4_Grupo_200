package ar.edu.unju.edm.model;

import java.util.HashMap;
import java.util.Map;

public abstract class Especie {
	
	private String denominacionCientifica;
	private String denominacionVulgar;
	private int codigoNumerico;
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

	public Map<Integer, ParqueNatural> getParquesNaturales() {
		return parquesNaturales;
	}

	public void setParquesNaturales(Map<Integer, ParqueNatural> parquesNaturales) {
		this.parquesNaturales = parquesNaturales;
	}

	public Especie(String denominacionCientifica, String denominacionVulgar, int codigoNumerico,
			Map<Integer, ParqueNatural> parquesNaturales) {
		super();
		this.denominacionCientifica = denominacionCientifica;
		this.denominacionVulgar = denominacionVulgar;
		this.codigoNumerico = codigoNumerico;
		this.parquesNaturales = parquesNaturales;
	}

	@Override
	public String toString() {
		return "Especie [denominacionCientifica=" + denominacionCientifica + ", denominacionVulgar="
				+ denominacionVulgar + ", codigoNumerico=" + codigoNumerico + ", parquesNaturales=" + parquesNaturales + "]";
	}

	
	
	
}
