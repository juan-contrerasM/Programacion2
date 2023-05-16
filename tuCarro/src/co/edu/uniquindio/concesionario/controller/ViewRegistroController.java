package co.edu.uniquindio.concesionario.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import co.edu.uniquindio.concesionario.controllerGetion.ViewRgeistroControllerGestion;
import co.edu.uniquindio.concesionario.enums.TipoEstadoCivil;
import co.edu.uniquindio.concesionario.enums.TipoUsuario;
import co.edu.uniquindio.concesionario.factory.ModelFactory;
import co.edu.uniquindio.concesionario.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewRegistroController implements Initializable{
	
	private ObservableList<TipoUsuario> listaTipoUsuarios= FXCollections.observableArrayList();
	private ObservableList<TipoEstadoCivil> listaTipoEstadoCivil= FXCollections.observableArrayList();
	private ObservableList<Empleado> listaEmpleados= FXCollections.observableArrayList();
	private ViewRgeistroControllerGestion gestion;
	private ModelFactory factory= new ModelFactory();
	
	

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
    	//se captura la informacion
    	String documento= txtDocumento.getText();
    	String nombre= txtNombre.getText();
    	String apellido=txtApellido.getText();
    	LocalDate nacimiento= dateNacimiento.getValue();
    	String telefono=txtTelefono.getText();
    	String email= txtEmail.getText();
    	String contrasenia=txtContrasenia.getText();
 
    	//con uno accedemos al combo y con otraa accedemos a la opcion del combo, se esta llenando el cobo box
    	
    	TipoEstadoCivil tipoEstadoCivil= comboEstado.getSelectionModel().getSelectedItem();
    	TipoUsuario tipoUsuario=comboTipoUsuario.getSelectionModel().getSelectedItem();
    	
    	if(tipoUsuario.equals(TipoUsuario.EMPLEADO)) {
    		Empleado emp= null;
    		gestion.guardarEmpleado(documento, nombre, apellido, nacimiento, tipoEstadoCivil, email, contrasenia, telefono, tipoUsuario);	
    		 if(emp!= null) {
    			 listaEmpleados.add(emp);
    			 
    			 
    		 }
    	}
    
   	
    	
    }
    public void cargarTipoUsuaurio() {
    	listaTipoUsuarios.add(TipoUsuario.ADMINISTRADOR);
    	listaTipoUsuarios.add(TipoUsuario.EMPLEADO);
    	comboTipoUsuario.setItems(listaTipoUsuarios);
    }
    public void cargarTipoEstadoCivil(){
    	listaTipoEstadoCivil.add(TipoEstadoCivil.CASADO);
    	comboEstado.setItems(listaTipoEstadoCivil);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		factory= ModelFactory.getIinstance();
		gestion= new ViewRgeistroControllerGestion(factory);
		new ViewRegistroController();
		cargarTipoUsuaurio();
		cargarTipoEstadoCivil();
		
		
		
	}
}
