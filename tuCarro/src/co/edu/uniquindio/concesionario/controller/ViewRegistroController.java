package co.edu.uniquindio.concesionario.controller;

import java.time.LocalDate;

import co.edu.uniquindio.concesionario.enums.TipoEstadoCivil;
import co.edu.uniquindio.concesionario.enums.TipoUsuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewRegistroController {

    @FXML
    private Label lblNacimiento;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblContrasenia;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtEmail;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblEstadoCivil;

    @FXML
    private TextField txtDocumento;

    @FXML
    private DatePicker dateNacimiento;

    @FXML
    private Label lblApellido;

    @FXML
    private Label lblTelefono;

    @FXML
    private ComboBox<TipoUsuario> comboTipoUsuario;

    @FXML
    private TextField txtNombre;

    @FXML
    private Label lblDocumento;

    @FXML
    private TextField txtTelefono;

  

    @FXML
    private TextField txtContrasenia;
    @FXML
	private Button btnRegistrarse;
    @FXML
    private ComboBox<TipoEstadoCivil> comboEstado;
    
    @FXML
	 void RegistrarUsuario(ActionEvent event) {
		 
    	registrarUsuario();
	 }
    
    public void registrarUsuario() {
    	
    	String documento= txtDocumento.getText();
    	String nombre= txtNombre.getText();
    	String apellido=txtApellido.getText();
    	LocalDate nacimiento= dateNacimiento.getValue();
    	String telefono=txtTelefono.getText();
    	String email= txtEmail.getText();
    	String contrasenia=txtContrasenia.getText();
//    con uno accedemos al comobo y con otroa accedemos a la opcion del combo
    	TipoEstadoCivil tipoEstadoCivil= comboEstado.getSelectionModel().getSelectedItem();
    	TipoUsuario tipoUsuario=comboTipoUsuario.getSelectionModel().getSelectedItem();
    	
    	
    	
    	
    	
    }
}
