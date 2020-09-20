package ar.edu.unju.edm.model;

public class OrganismoProvincial {

	private String nombreOrganismo;
	private String representanteTitular;
	private String representanteAlterno;
	private int telefono;
	private String direccion;
	private String paginaWeb;
	
	public OrganismoProvincial() {
		// TODO Auto-generated constructor stub
	}

	public OrganismoProvincial(String nombreOrganismo, String representanteTitular, String representanteAlterno,
			int telefono, String direccion, String paginaWeb) {
		super();
		this.nombreOrganismo = nombreOrganismo;
		this.representanteTitular = representanteTitular;
		this.representanteAlterno = representanteAlterno;
		this.telefono = telefono;
		this.direccion = direccion;
		this.paginaWeb = paginaWeb;
	}

	public String getNombreOrganismo() {
		return nombreOrganismo;
	}

	public void setNombreOrganismo(String nombreOrganismo) {
		this.nombreOrganismo = nombreOrganismo;
	}

	public String getRepresentanteTitular() {
		return representanteTitular;
	}

	public void setRepresentanteTitular(String representanteTitular) {
		this.representanteTitular = representanteTitular;
	}

	public String getRepresentanteAlterno() {
		return representanteAlterno;
	}

	public void setRepresentanteAlterno(String representanteAlterno) {
		this.representanteAlterno = representanteAlterno;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	@Override
	public String toString() {
		return "OrganismoProvincial [nombreOrganismo=" + nombreOrganismo + ", representanteTitular="
				+ representanteTitular + ", representanteAlterno=" + representanteAlterno + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", paginaWeb=" + paginaWeb + "]";
	}
}
