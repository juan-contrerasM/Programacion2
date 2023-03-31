package co.edu.uniquindio.concesionario.model;

import co.edu.uniquindio.concesionario.enums.TipoVehiculo;

public class Vehiculo {
	private TipoVehiculo tipoVehiculo;
	
	public Vehiculo() {
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

}
