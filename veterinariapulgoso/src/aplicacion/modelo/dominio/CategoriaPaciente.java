package aplicacion.modelo.dominio;

import java.io.Serializable;

public class CategoriaPaciente implements Serializable {
	private String tipoCatPaciente;
	private Integer idCatPaciente;

	public String getTipoCatPaciente() {
		return tipoCatPaciente;
	}

	public void setTipoCatPaciente(String tipoCatPaciente) {
		this.tipoCatPaciente = tipoCatPaciente;
	}

	public Integer getIdCatPaciente() {
		return idCatPaciente;
	}

	public void setIdCatPaciente(Integer idCatPaciente) {
		this.idCatPaciente = idCatPaciente;
	}

	public CategoriaPaciente(String tipoCatPaciente, Integer idCatPaciente) {
		super();
		this.tipoCatPaciente = tipoCatPaciente;
		this.idCatPaciente = idCatPaciente;
	}

	public CategoriaPaciente() {
		// TODO Auto-generated constructor stub
	}

}
