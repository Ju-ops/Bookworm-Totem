package application;

import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.pesquisa;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class FXMLInicioController implements Initializable {
	@FXML
    private ImageView imgFundo, imgLogo;

    @FXML
    private Label lblTitulo, lbl, lblSair;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnPesquisar, btnAnterior, btnProximo, btnLivro1, btnLivro2, btnLivro3, btnLivro4, btnLivro5, btnLivro6, btnLivro7, btnLivro8, btnLivro9, btnLivro10, btnLivro11, btnLivro12, btnLivro13, btnLivro14, btnLivro15, btnLivro16, btnLivro17, btnLivro18;

    @FXML
    private Rectangle rtgPainel;
    
    @FXML
    private AnchorPane apScroll;
    
    pesquisa pesquisaAtual;
    
    FXMLPesquisaController lblAutor;
    
    @FXML
    void Sair() {
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
    
    @FXML
    protected void Livro6Scene(ActionEvent e) {
		MainInicio.changeScreen("anjos");
	}
    
    @FXML
    protected void Livro7Scene(ActionEvent e) {
		MainInicio.changeScreen("stevenArtOrigins");
	}
    
    @FXML
    protected void Pesquisar(ActionEvent e) throws Exception {
    	/*pesquisaAtual = pesquisa.getPesquisa(txtPesquisa.getText());
    	if (pesquisaAtual == null) {
    		MainInicio.changeScreen("pesquisaErro");
    	} else {
    		String resultadoPesquisa = pesquisaAtual + "";
    		MainInicio.changeScreen("pesquisa");
    		//return resultadoPesquisa;
    	}*/
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	
	@FXML
    void Ir(ActionEvent event) {
		TranslateTransition translate = new TranslateTransition(Duration.seconds(1), btnLivro1);
		translate.setToX(btnLivro1.getLayoutX() + btnLivro2.getLayoutX());
		translate.play();
    }

    @FXML
    void Voltar(ActionEvent event) {

    }
	
	

}
