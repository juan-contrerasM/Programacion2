package co.edu.uniquindio.concesionario.model;

public class Usuario extends Persona{
	
	private	String email;
	private	String telefono;
	private	String contrasenia;
	
	
	
	public Usuario() {}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	

}
