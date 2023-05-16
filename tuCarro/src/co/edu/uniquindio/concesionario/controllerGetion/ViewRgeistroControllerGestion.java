package co.edu.uniquindio.concesionario.controllerGetion;

import java.time.LocalDate;

import co.edu.uniquindio.concesionario.enums.TipoEstadoCivil;
import co.edu.uniquindio.concesionario.enums.TipoUsuario;
import co.edu.uniquindio.concesionario.factory.ModelFactory;
import co.edu.uniquindio.concesionario.model.Automoviliaria;
import co.edu.uniquindio.concesionario.model.Empleado;

public class ViewRgeistroControllerGestion {
		ModelFactory factory;
		Automoviliaria auto;
	
		
	
	public ViewRgeistroControllerGestion(ModelFactory factory) {
		this.factory=factory;
		auto=factory.getAuto();
		
	}
	
	public Empleado guardarEmpleado(String documento, String nombre, String apellido, LocalDate nacimiento, TipoEstadoCivil estadoCivil, String email, String contrasenia,String telefono, TipoUsuario tipoUsuario) {
		
		return factory.guardarEmpleado(documento, nombre, apellido, nacimiento, estadoCivil, email, contrasenia, telefono, tipoUsuario);	
		
	}
	

}
