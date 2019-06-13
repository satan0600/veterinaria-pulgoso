package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Paciente implements Serializable{
	private String nombrePaciente, razaPaciente;
	private CategoriaPaciente catPaciente;
	private double pesoPaciente;
	private Usuario usuarioPaciente;
	private Integer idPaciente;

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getRazaPaciente() {
		return razaPaciente;
	}

	public void setRazaPaciente(String razaPaciente) {
		this.razaPaciente = razaPaciente;
	}

	public CategoriaPaciente getCatPaciente() {
		return catPaciente;
	}

	public void setCatPaciente(CategoriaPaciente catPaciente) {
		this.catPaciente = catPaciente;
	}

	public double getPesoPaciente() {
		return pesoPaciente;
	}

	public void setPesoPaciente(double pesoPaciente) {
		this.pesoPaciente = pesoPaciente;
	}

	public Usuario getUsuarioPaciente() {
		return usuarioPaciente;
	}

	public void setUsuarioPaciente(Usuario usuarioPaciente) {
		this.usuarioPaciente = usuarioPaciente;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Paciente(String nombrePaciente, String razaPaciente, CategoriaPaciente catPaciente, double pesoPaciente,
			Usuario usuarioPaciente, Integer idPaciente) {
		super();
		this.nombrePaciente = nombrePaciente;
		this.razaPaciente = razaPaciente;
		this.catPaciente = catPaciente;
		this.pesoPaciente = pesoPaciente;
		this.usuarioPaciente = usuarioPaciente;
		this.idPaciente = idPaciente;
	}

	public Paciente() {
		// TODO Auto-generated constructor stub
	}

}
