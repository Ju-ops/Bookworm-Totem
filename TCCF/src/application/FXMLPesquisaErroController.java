package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class FXMLPesquisaErroController implements Initializable{
	@FXML
    private ImageView imgFundo, imgLogo;

    @FXML
    private Label lblTitulo, lblSair;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnVoltar, btnPesquisar;

    @FXML
    private Text lblAviso;

    @FXML
    private Rectangle rtgPainel;
    
	@FXML
	protected void Sair() {
		System.exit(0);
	}
	
	@FXML
	protected void Voltar() {
		MainInicio.changeScreen("inicio");
	}
	
	@FXML
	protected void Pesquisar(ActionEvent e) throws Exception {
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
