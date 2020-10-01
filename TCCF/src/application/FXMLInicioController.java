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

public class FXMLInicioController implements Initializable {
	@FXML
    private ImageView imgFundo, imgPainel, imgLogo;

    @FXML
    private Label lblTitulo, lbl, lblSair;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnPesquisar, btnAnterior, btnProximo, btnLivro1, btnLivro2, btnLivro3, btnLivro4, btnLivro5, btnLivro6, btnLivro7, btnLivro8, btnLivro9, btnLivro10, btnLivro11, btnLivro12, btnLivro13, btnLivro14, btnLivro15, btnLivro16, btnLivro17, btnLivro18;
    
    @FXML
    void sair() {
    	System.exit(0);
    }
    
    @FXML
    protected void ChangeScene(ActionEvent e) {
		MainInicio.changeScreen("iluminado");
	}
    
    @FXML
    protected void FilmeScene(ActionEvent e) {
		MainInicio.changeScreen("emoji");
	}
    
    @FXML
    protected void CDScene(ActionEvent e) {
		MainInicio.changeScreen("aerosmith");
	}
    
    @FXML
    protected void RevistaScene(ActionEvent e) {
		MainInicio.changeScreen("zelda");
	}
    
    @FXML
    protected void Livro2Scene(ActionEvent e) {
		MainInicio.changeScreen("destinos");
	}
    
    @FXML
    protected void Livro3Scene(ActionEvent e) {
		MainInicio.changeScreen("elaeseugato");
	}
    
    @FXML
    protected void Livro4Scene(ActionEvent e) {
		MainInicio.changeScreen("witchAcademy");
	}
    
    @FXML
    protected void Livro5Scene(ActionEvent e) {
		MainInicio.changeScreen("senhorDosAneis");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	
	

}
