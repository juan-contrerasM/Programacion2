package co.edu.uniquindio.concesionario.model;

import java.time.LocalDate;

import co.edu.uniquindio.concesionario.enums.TipoEstadoCivil;

public abstract class Persona {

	private String documento;
	private String nombre; 
	private String apellido;
	private LocalDate nacimiento;
	private TipoEstadoCivil estadoCivil;

	public Persona () {}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TipoEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(TipoEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
	

}
