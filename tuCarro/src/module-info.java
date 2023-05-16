module Gfyfhgh {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.desktop;
	requires java.logging;
	
	opens co.edu.uniquindio.concesionario to javafx.graphics, javafx.fxml;
	opens co.edu.uniquindio.concesionario.controller;
	exports co.edu.uniquindio.concesionario.enums;
	
}
