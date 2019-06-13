package aplicacion.modelo.dominio;

import java.io.Serializable;

public class TipoOferta implements Serializable{
	private Integer idOferta;
	private String nombreOferta,descripcionOferta;
	

	public Integer getIdOferta() {
		return idOferta;
	}


	public void setIdOferta(Integer idOferta) {
		this.idOferta = idOferta;
	}


	public String getNombreOferta() {
		return nombreOferta;
	}


	public void setNombreOferta(String nombreOferta) {
		this.nombreOferta = nombreOferta;
	}


	public String getDescripcionOferta() {
		return descripcionOferta;
	}


	public void setDescripcionOferta(String descripcionOferta) {
		this.descripcionOferta = descripcionOferta;
	}
	


	public TipoOferta(Integer idOferta, String nombreOferta, String descripcionOferta) {
		super();
		this.idOferta = idOferta;
		this.nombreOferta = nombreOferta;
		this.descripcionOferta = descripcionOferta;
	}


	public TipoOferta() {
		// TODO Auto-generated constructor stub
	}

}
