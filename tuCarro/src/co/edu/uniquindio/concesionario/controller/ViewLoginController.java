package co.edu.uniquindio.concesionario.controller;

import co.edu.uniquindio.concesionario.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ViewLoginController {
	Main main= new Main();

    @FXML
    private Pane pane2;
	@FXML
	private ImageView imgLogo;
	 @FXML
	  private ComboBox<?> comboTipoUsuario;
	   @FXML
	    private Text txtSingup;
	@FXML
	private ImageView imgUsuario;

	@FXML
	private ImageView imgCandado;

	@FXML
	private TextField txtEmail;

	@FXML
	private Label lblOlvidoClave;

	@FXML
	private AnchorPane pane;

	
	@FXML
	private Button btnEntrar;
    @FXML
    private Button bthRegistrar;

	@FXML
	private TextField txtContrasenia;

	@FXML
	void recuperarClave(MouseEvent event) {

	}

	@FXML
	void registrarse(ActionEvent event) {
		main.carcarVentanaRegistro();
		

	}

	@FXML
	void entrar(ActionEvent event) {

	}
	 

}
