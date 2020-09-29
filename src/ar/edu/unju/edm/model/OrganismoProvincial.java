package ar.edu.unju.edm.model;

public class OrganismoProvincial {
	
	private String nombreOrganismo;
	private long cuit;
	private String representanteTitular;
	private int telefono;
	private String direccion;
	
	public OrganismoProvincial() {
		// TODO Auto-generated constructor stub
	}

	public String getNombreOrganismo() {
		return nombreOrganismo;
	}

	public void setNombreOrganismo(String nombreOrganismo) {
		this.nombreOrganismo = nombreOrganismo;
	}

	public long getCuit() {
		return cuit;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	public String getRepresentanteTitular() {
		return representanteTitular;
	}

	public void setRepresentanteTitular(String representanteTitular) {
		this.representanteTitular = representanteTitular;
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

	public OrganismoProvincial(String nombreOrganismo, long cuit, String representanteTitular, int telefono,
			String direccion) {
		super();
		this.nombreOrganismo = nombreOrganismo;
		this.cuit = cuit;
		this.representanteTitular = representanteTitular;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "OrganismoProvincial [nombreOrganismo=" + nombreOrganismo + ", cuit=" + cuit + ", representanteTitular="
				+ representanteTitular + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}

	

	
	
}
