package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Persona implements Serializable {
	private String apellido, nombre, direccion;
	private Integer dni;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Persona(String apellido, String nombre, String direccion, Integer dni) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

}
