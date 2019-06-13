package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Usuario implements Serializable{
	private Persona personaUsuario;
	private String eMailUsuario, passwordUsuario;
	private Integer idUsuario;
	

	public Persona getPersonaUsuario() {
		return personaUsuario;
	}


	public void setPersonaUsuario(Persona personaUsuario) {
		this.personaUsuario = personaUsuario;
	}


	public String geteMailUsuario() {
		return eMailUsuario;
	}


	public void seteMailUsuario(String eMailUsuario) {
		this.eMailUsuario = eMailUsuario;
	}


	public String getPasswordUsuario() {
		return passwordUsuario;
	}


	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}


	public Integer getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	


	public Usuario() {
		
		
		// TODO Auto-generated constructor stub
	}

}
