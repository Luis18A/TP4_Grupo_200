package ar.edu.unju.edm.model;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
	
	private int codProvincia;
	private String nombreProvincia;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public int getCodProvincia() {
		return codProvincia;
	}

	public void setCodProvincia(int codProvincia) {
		this.codProvincia = codProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public Provincia(int codProvincia, String nombreProvincia) {
		super();
		this.codProvincia = codProvincia;
		this.nombreProvincia = nombreProvincia;
	}

	@Override
	public String toString() {
		return "Provincia [codProvincia=" + codProvincia + ", nombreProvincia=" + nombreProvincia + "]";
	}

	
	
	


}
