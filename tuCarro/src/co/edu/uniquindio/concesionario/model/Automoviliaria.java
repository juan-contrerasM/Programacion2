package co.edu.uniquindio.concesionario.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import co.edu.uniquindio.concesionario.enums.TipoEstadoCivil;
import co.edu.uniquindio.concesionario.enums.TipoUsuario;
import co.edu.uniquindio.concesionario.excetions.EmpleadoExisteException;

public class Automoviliaria {
	//donde se guardan los objetos de cada tipo
	private ArrayList<Empleado>listEmpleados= new ArrayList<>();
	private ArrayList<Administrador>listAdministradores= new ArrayList<>();
	private ArrayList<Vehiculo>listVehiculos= new ArrayList<>();

	//constructor
	public Automoviliaria() {
		
	}


	//metodo de guardar empleados
	public Empleado guardarEmpleado(String documento, String nombre, String apellido, LocalDate nacimiento, TipoEstadoCivil estadoCivil, String email, String contrasenia,String telefono, TipoUsuario tipoUsuario) throws EmpleadoExisteException{
		Empleado emp= null;
		boolean existeEmpleado=verificadorEmpleado(documento, tipoUsuario);
		if( existeEmpleado) {
			throw new EmpleadoExisteException();
			
		}
		else {
			emp = new Empleado();
			emp.setDocumento(documento);
			emp.setNombre(nombre);
			emp.setApellido(apellido);
			emp.setNacimiento(nacimiento);
			emp.setEstadoCivil(estadoCivil);
			emp.setEmail(email);
			emp.setTelefono(telefono);
			emp.setContrasenia(contrasenia);
			emp.setTipoUsuario(tipoUsuario);
			
			getListEmpleados().add(emp);
		}
		return emp;
		
	}
	//metodo para verificar si un empleado ya fue guardado
	public Boolean verificadorEmpleado(String documento, TipoUsuario tipoUsuario) {
		Empleado emp=null;
		boolean existeEmpleado=false;
		if(tipoUsuario==TipoUsuario.EMPLEADO) {
			emp= obtenerEmpleado(documento);
			if(emp!=null) {
				existeEmpleado=true;
			}
		}
		return existeEmpleado;
	}
	//busca el empleado y lo retorna
	public Empleado obtenerEmpleado(String documento) {
		Empleado emp=null;
		for (Empleado empleado : listEmpleados) {
			if( empleado.getDocumento().equals(documento)) {
				emp= empleado;
				break;
			}
		}
		return emp;
	}
	
	                                     //administrador
	
	public Administrador guardarAdministradores(String documento, String nombre, String apellido, LocalDate nacimiento, TipoEstadoCivil estadoCivil, String email, String contrasenia,String telefono, TipoUsuario tipoUsuario) throws EmpleadoExisteException{
		Administrador admi= null;
		boolean existeAdmi=verificadorEmpleado(documento, tipoUsuario);
		if( existeAdmi) {
			throw new EmpleadoExisteException();
			
		}
		else {
			admi = new Administrador();
			admi.setDocumento(documento);
			admi.setNombre(nombre);
			admi.setApellido(apellido);
			admi.setNacimiento(nacimiento);
			admi.setEstadoCivil(estadoCivil);
			admi.setEmail(email);
			admi.setTelefono(telefono);
			admi.setContrasenia(contrasenia);
			admi.setTipoUsuario(tipoUsuario);
			
			getListAbministradores().add(admi);
		}
		return admi;
		
	}
	public boolean verificadorAdministrador(String documento, TipoUsuario tipoUsuario) {
		Administrador admi=null;
		boolean existeAdministrador=false;
		if(tipoUsuario==TipoUsuario.ADMINISTRADOR) {
			admi= obtenerAdministrador(documento);
			if(admi!=null) {
				existeAdministrador=true;
			}
		}
		return existeAdministrador;
	}
	public Administrador obtenerAdministrador(String documento) {
		Administrador admi=null;
		for (Administrador administrador : listAdministradores) {
			if( admi.getDocumento().equals(documento)) {
				admi= administrador;
				break;
			}
		}
		return admi;
	}
	//metodos get y set de las variables globales 

	public ArrayList<Empleado> getListEmpleados() {
		return listEmpleados;
	}

	public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
		this.listEmpleados = listEmpleados;
	}

	public ArrayList<Administrador> getListAbministradores() {
		return listAdministradores;
	}

	public void setListAbministradores(ArrayList<Administrador> listAbministradores) {
		this.listAdministradores = listAbministradores;
	}

	public ArrayList<Vehiculo> getListVehiculos() {
		return listVehiculos;
	}

	public void setListVehiculos(ArrayList<Vehiculo> listVehiculos) {
		this.listVehiculos = listVehiculos;
	}
	
	
	
	public ArrayList<Administrador> getListAdministradores() {
		return listAdministradores;
	}

	public void setListAdministradores(ArrayList<Administrador> listAdministradores) {
		this.listAdministradores = listAdministradores;
	}

}

	
