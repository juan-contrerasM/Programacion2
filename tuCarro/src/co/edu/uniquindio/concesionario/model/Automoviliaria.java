package co.edu.uniquindio.concesionario.model;

import java.util.ArrayList;

public class Automoviliaria {
	private ArrayList<Empleado>listEmpleados= new ArrayList<>();
	private ArrayList<Administrador>listAdministradores= new ArrayList<>();
	private ArrayList<Vehiculo>listVehiculos= new ArrayList<>();

	public Automoviliaria() {
		
	}

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
	

}
