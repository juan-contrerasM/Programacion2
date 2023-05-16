package co.edu.uniquindio.concesionario.factory;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.uniquindio.concesionario.enums.TipoEstadoCivil;
import co.edu.uniquindio.concesionario.enums.TipoUsuario;
import co.edu.uniquindio.concesionario.excetions.EmpleadoExisteException;
import co.edu.uniquindio.concesionario.model.Administrador;
import co.edu.uniquindio.concesionario.model.Automoviliaria;
import co.edu.uniquindio.concesionario.model.Empleado;
import co.edu.uniquindio.concesionario.persistence.Persistence;

public class ModelFactory {
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Administrador> administradores = new ArrayList<Administrador>();
	private Automoviliaria auto;

	// sirve para intanciar una sola vez la clase
	private static class SingletonHolder {
		private final static ModelFactory eINSTANCE = new ModelFactory();
	}

	// llamar a SingletonHolder
	public static ModelFactory getIinstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactory() {
		cargarDatosDesdeArchivos();
	}

	public void cargarDatosDesdeArchivos() {
		this.auto = new Automoviliaria();

		try {
			ArrayList<Empleado> empleados = new ArrayList<Empleado>();
			empleados = Persistence.cargarEmpleados();
			getAuto().getListEmpleados().addAll(empleados);

		} catch (Exception e) {
			// Persistence.guardarRegistroLog("datos no cargados", 3, "los datos no pudieron
			// ser cargados");
		}
	}

	public Empleado guardarEmpleado(String documento, String nombre, String apellido, LocalDate nacimiento,
			TipoEstadoCivil estadoCivil, String email, String contrasenia, String telefono, TipoUsuario tipoUsuario) {
		Empleado emp = null;
		try {
			emp = getAuto().guardarEmpleado(documento, nombre, apellido, nacimiento, estadoCivil, email, contrasenia,
					telefono, tipoUsuario);
			Persistence.guardarEmpleado(getEmpleados());
			Persistence.guardarRegistroLog("se guardo un empleado", 1, "se ha guardado el empleado exitosamente");
		} catch (EmpleadoExisteException e) {
			Persistence.guardarRegistroLog("no se guardo el empleado", 2, "no se guardo el empleado ya que ya existe");
		} catch (Exception e) {
			// imprime la pila del error
			e.printStackTrace();
		}
		return emp;

	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Administrador> getAdministradores() {
		return administradores;
	}

	public void setAdministradores(ArrayList<Administrador> administradores) {
		this.administradores = administradores;
	}

	public Automoviliaria getAuto() {
		return auto;
	}

	public void setAuto(Automoviliaria auto) {
		this.auto = auto;
	}

}
