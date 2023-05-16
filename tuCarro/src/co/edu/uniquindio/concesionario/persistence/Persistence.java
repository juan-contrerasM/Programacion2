package co.edu.uniquindio.concesionario.persistence;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import co.edu.uniquindio.concesionario.enums.TipoEstadoCivil;
import co.edu.uniquindio.concesionario.enums.TipoUsuario;
import co.edu.uniquindio.concesionario.model.Administrador;
import co.edu.uniquindio.concesionario.model.Empleado;

public class Persistence {
		// se crearon costantes donde se almacena la ruta del los archivos txt de cada objeto o accion necesaria
		public static final String RUTA_ARCHIVO_ADMINISTRADORES="co/edu/uniquindio/concesionario/files/ArchivoAdministradores";
		public static final String RUTA_ARCHIVO_EMPLEADOS="co/edu/uniquindio/concesionario/files/ArchivoEmpleados";
		public static final String RUTA_ARCHIVO_LOG="co/edu/uniquindio/concesionario/files/ArchivoLog";
		
		
		// aca se guarda todo aquello que se haga en la aplicacion sea un error, guardar a una persona y las demas acciones 
		//que tiene la aplicaiconn
		public static void guardarRegistroLog(String mensaje, int nivel, String action) {
			ArchivoUtil.guardarRegistroLog(mensaje, nivel, action,RUTA_ARCHIVO_LOG );
		}
		// este metodo permite guardar a los que se registren como empleados en archivos txt
		public static void guardarEmpleado( ArrayList<Empleado>ListaEmpleados) throws IOException {
			String contenido= "";
			for (Empleado empleado : ListaEmpleados) {
				contenido+=empleado.getDocumento()+ "$$"+ empleado.getNombre()+ "$$" + empleado.getApellido()+ "$$"+ 
				empleado.getNacimiento()+"$$"+empleado.getEstadoCivil() +
				empleado.getEmail()+"$$"+ empleado.getTelefono()+"$$"+ empleado.getContrasenia()+ "$$" +empleado.getTipoUsuario()+ "\n"; 
			}
			ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_EMPLEADOS, contenido, false);
		}
		//aca se leen los archivos de txt donde guardan los atributos de los empleados 
		public static ArrayList<Empleado> cargarEmpleados() throws IOException{
			ArrayList<Empleado> empleados= new ArrayList<Empleado>();
			ArrayList<String> contenido= ArchivoUtil.leerArchivo(RUTA_ARCHIVO_EMPLEADOS);
			String linea;
			for(int i=0; i<contenido.size();i++) {
				linea= contenido.get(i);
				Empleado emp= new Empleado();
				emp.setDocumento(linea.split("$$")[0]);
				emp.setNombre(linea.split("$$")[1]);
				emp.setApellido(linea.split("$$")[2]);
				emp.setNacimiento(LocalDate.parse(linea.split("$$")[3]));
				emp.setEstadoCivil(TipoEstadoCivil.valueOf(linea.split("$$")[4]));
				emp.setEmail(linea.split("$$")[5]);
				emp.setTelefono(linea.split("$$")[6]);
				emp.setContrasenia(linea.split("$$")[7]);
				emp.setTipoUsuario(TipoUsuario.valueOf(linea.split("$$")[8]));
				empleados.add(emp);
			}
			return empleados;
		}
		public static void guardarAdministrador( ArrayList<Administrador>ListaAdministradores) throws IOException {
			String contenido= "";
			for ( Administrador admi: ListaAdministradores) {
				contenido+=admi.getDocumento()+ "$$"+ admi.getNombre()+ "$$" + admi.getApellido()+ "$$"+ 
				admi.getNacimiento()+"$$"+admi.getEstadoCivil() +
				admi.getEmail()+"$$"+ admi.getTelefono()+"$$"+ admi.getContrasenia()+ "$$" +admi.getTipoUsuario()+ "\n"; 
			}
			ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_ADMINISTRADORES, contenido, false);
		}
		public static ArrayList<Administrador> cargarAdministradores() throws IOException{
			ArrayList<Administrador> administradores= new ArrayList<Administrador>();
			ArrayList<String> contenido= ArchivoUtil.leerArchivo(RUTA_ARCHIVO_ADMINISTRADORES);
			String linea;
			for(int i=0; i<contenido.size();i++) {
				linea= contenido.get(i);
				Administrador admi= new Administrador();
				admi.setDocumento(linea.split("$$")[0]);
				admi.setNombre(linea.split("$$")[1]);
				admi.setApellido(linea.split("$$")[2]);
				admi.setNacimiento(LocalDate.parse(linea.split("$$")[3]));
				admi.setEstadoCivil(TipoEstadoCivil.valueOf(linea.split("$$")[4]));
				admi.setEmail(linea.split("$$")[5]);
				admi.setTelefono(linea.split("$$")[6]);
				admi.setContrasenia(linea.split("$$")[7]);
				admi.setTipoUsuario(TipoUsuario.valueOf(linea.split("$$")[8]));
				administradores.add(admi);
			}
			return administradores;
		}
		
		
		
		



}
