package aplicacion.modelo.dominio;

import java.io.Serializable;

public class CategoriaUsuario implements Serializable{
	private String descripcionCatUsuario;
	private Integer codigoCatUsuario;

	public String getDescripcionCatUsuario() {
		return descripcionCatUsuario;
	}

	public void setDescripcionCatUsuario(String descripcionCatUsuario) {
		this.descripcionCatUsuario = descripcionCatUsuario;
	}

	public Integer getCodigoCatUsuario() {
		return codigoCatUsuario;
	}

	public void setCodigoCatUsuario(Integer codigoCatUsuario) {
		this.codigoCatUsuario = codigoCatUsuario;
	}
	

	public CategoriaUsuario(String descripcionCatUsuario, Integer codigoCatUsuario) {
		super();
		this.descripcionCatUsuario = descripcionCatUsuario;
		this.codigoCatUsuario = codigoCatUsuario;
	}

	public CategoriaUsuario() {
		// TODO Auto-generated constructor stub
	}

}
