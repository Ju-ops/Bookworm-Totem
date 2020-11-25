package application;

import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.produto;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
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
    private Button btnPesquisar, btnAnterior, btnProximo;
    
    @FXML
    private Button btnLivro1, btnLivro2, btnLivro3, btnLivro4, btnLivro5, btnLivro6, btnLivroE;

    @FXML
    private Button btnLivro7, btnLivro8, btnLivro9, btnLivro10, btnLivro11, btnLivro12, btnLivroE2;
    
    @FXML
    private Button btnLivro13, btnLivro14, btnLivro15, btnLivro16, btnLivro17, btnLivro18, btnLivroE3;
    
    @FXML
    private Rectangle rtgPainel;
    
    @FXML
    private AnchorPane apScroll;
    
    produto pesquisaAtual;
    
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
    protected void Livro8Scene(ActionEvent e) {
		MainInicio.changeScreen("resultado");
	}
    
    @FXML
    protected void Livro9Scene(ActionEvent e) {
		MainInicio.changeScreen("aa");
	}
    
    @FXML
    protected void Pesquisar(ActionEvent e) throws Exception {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("./FXMLPesquisa.fxml"));
    	
    	Scene scene = new Scene(loader.load());
    	
    	FXMLPesquisaController controller = loader.getController();
    	String nomeLivro = txtPesquisa.getText();
    	controller.setPesquisa(nomeLivro);
    	
    	scene.getStylesheets().add("CSS/application.css");
    	MainInicio.stage.setScene(scene);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	
	@FXML
    void Ir(ActionEvent event) {
		TranslateTransition translate = new TranslateTransition(Duration.seconds(1), btnLivro1);
		translate.setToX(btnLivro1.getLayoutX() - 150);
		translate.play();
		
		TranslateTransition translate2 = new TranslateTransition(Duration.seconds(1), btnLivro2);
		translate2.setToX(btnLivro1.getLayoutX() - 190);
		translate2.play();
		
		TranslateTransition translate3 = new TranslateTransition(Duration.seconds(1), btnLivro3);
		translate3.setToX(btnLivro1.getLayoutX() - 200);
		translate3.play();
		
		TranslateTransition translate4 = new TranslateTransition(Duration.seconds(1), btnLivro4);
		translate4.setToX(btnLivro1.getLayoutX() - 170);
		translate4.play();
		
		TranslateTransition translate5 = new TranslateTransition(Duration.seconds(1), btnLivro5);
		translate5.setToX(btnLivro1.getLayoutX() - 170);
		translate5.play();
		
		TranslateTransition translate6 = new TranslateTransition(Duration.seconds(1), btnLivro6);
		translate6.setToX(btnLivro1.getLayoutX() - 170);
		translate6.play();
		
		TranslateTransition translateE = new TranslateTransition(Duration.seconds(1), btnLivroE);
		translateE.setToX(btnLivro1.getLayoutX() - 200);
		translateE.play();
    }

    @FXML
    void Voltar(ActionEvent event) {
    	TranslateTransition translate = new TranslateTransition(Duration.seconds(1), btnLivro1);
		translate.setToX(btnLivro1.getLayoutX());
		translate.play();
		
		TranslateTransition translate2 = new TranslateTransition(Duration.seconds(1), btnLivro2);
		translate2.setToX(btnLivro2.getLayoutX() - 183);
		translate2.play();
		
		TranslateTransition translate3 = new TranslateTransition(Duration.seconds(1), btnLivro3);
		translate3.setToX(btnLivro3.getLayoutX() - 365);
		translate3.play();
		
		TranslateTransition translate4 = new TranslateTransition(Duration.seconds(1), btnLivro4);
		translate4.setToX(btnLivro1.getLayoutX() * 4);
		translate4.play();
		
		TranslateTransition translate5 = new TranslateTransition(Duration.seconds(1), btnLivro5);
		translate5.setToX(btnLivro1.getLayoutX() * 5);
		translate5.play();
		
		TranslateTransition translate6 = new TranslateTransition(Duration.seconds(1), btnLivro6);
		translate6.setToX(btnLivro1.getLayoutX() * 6);
		translate6.play();
		
		TranslateTransition translateE = new TranslateTransition(Duration.seconds(1), btnLivroE);
		translateE.setToX(btnLivro1.getLayoutX() * 7);
		translateE.play();
    }
    
    @FXML
    void Proximo(ActionEvent event) {
		TranslateTransition translate = new TranslateTransition(Duration.seconds(1), btnLivro7);
		translate.setToX(btnLivro7.getLayoutX() - 150);
		translate.play();
		
		TranslateTransition translate2 = new TranslateTransition(Duration.seconds(1), btnLivro8);
		translate2.setToX(btnLivro7.getLayoutX() - 190);
		translate2.play();
		
		TranslateTransition translate3 = new TranslateTransition(Duration.seconds(1), btnLivro9);
		translate3.setToX(btnLivro7.getLayoutX() - 200);
		translate3.play();
		
		TranslateTransition translate4 = new TranslateTransition(Duration.seconds(1), btnLivro10);
		translate4.setToX(btnLivro7.getLayoutX() - 170);
		translate4.play();
		
		TranslateTransition translate5 = new TranslateTransition(Duration.seconds(1), btnLivro11);
		translate5.setToX(btnLivro7.getLayoutX() - 170);
		translate5.play();
		
		TranslateTransition translate6 = new TranslateTransition(Duration.seconds(1), btnLivro12);
		translate6.setToX(btnLivro7.getLayoutX() - 170);
		translate6.play();
		
		TranslateTransition translateE2 = new TranslateTransition(Duration.seconds(1), btnLivroE2);
		translateE2.setToX(btnLivro7.getLayoutX() - 200);
		translateE2.play();
    }

    @FXML
    void Anterior(ActionEvent event) {
    	TranslateTransition translate = new TranslateTransition(Duration.seconds(1), btnLivro7);
		translate.setToX(btnLivro7.getLayoutX());
		translate.play();
		
		TranslateTransition translate2 = new TranslateTransition(Duration.seconds(1), btnLivro8);
		translate2.setToX(btnLivro7.getLayoutX() * 2);
		translate2.play();
		
		TranslateTransition translate3 = new TranslateTransition(Duration.seconds(1), btnLivro9);
		translate3.setToX(btnLivro7.getLayoutX() * 3);
		translate3.play();
		
		TranslateTransition translate4 = new TranslateTransition(Duration.seconds(1), btnLivro10);
		translate4.setToX(btnLivro7.getLayoutX() * 4);
		translate4.play();
		
		TranslateTransition translate5 = new TranslateTransition(Duration.seconds(1), btnLivro11);
		translate5.setToX(btnLivro7.getLayoutX() * 5);
		translate5.play();
		
		TranslateTransition translate6 = new TranslateTransition(Duration.seconds(1), btnLivro12);
		translate6.setToX(btnLivro7.getLayoutX() * 6);
		translate6.play();
		
		TranslateTransition translateE = new TranslateTransition(Duration.seconds(1), btnLivroE2);
		translateE.setToX(btnLivro1.getLayoutX() * 7);
		translateE.play();
    }
    
    @FXML
    void Seguinte(ActionEvent event) {
		TranslateTransition translate = new TranslateTransition(Duration.seconds(1), btnLivro13);
		translate.setToX(btnLivro13.getLayoutX() - 150);
		translate.play();
		
		TranslateTransition translate2 = new TranslateTransition(Duration.seconds(1), btnLivro14);
		translate2.setToX(btnLivro13.getLayoutX() - 190);
		translate2.play();
		
		TranslateTransition translate3 = new TranslateTransition(Duration.seconds(1), btnLivro15);
		translate3.setToX(btnLivro13.getLayoutX() - 200);
		translate3.play();
		
		TranslateTransition translate4 = new TranslateTransition(Duration.seconds(1), btnLivro16);
		translate4.setToX(btnLivro13.getLayoutX() - 170);
		translate4.play();
		
		TranslateTransition translate5 = new TranslateTransition(Duration.seconds(1), btnLivro17);
		translate5.setToX(btnLivro13.getLayoutX() - 170);
		translate5.play();
		
		TranslateTransition translate6 = new TranslateTransition(Duration.seconds(1), btnLivro18);
		translate6.setToX(btnLivro13.getLayoutX() - 170);
		translate6.play();
		
		TranslateTransition translateE2 = new TranslateTransition(Duration.seconds(1), btnLivroE3);
		translateE2.setToX(btnLivro13.getLayoutX() - 200);
		translateE2.play();
    }

    @FXML
    void Antes(ActionEvent event) {
    	TranslateTransition translate = new TranslateTransition(Duration.seconds(1), btnLivro13);
		translate.setToX(btnLivro13.getLayoutX());
		translate.play();
		
		TranslateTransition translate2 = new TranslateTransition(Duration.seconds(1), btnLivro14);
		translate2.setToX(btnLivro13.getLayoutX() * 2);
		translate2.play();
		
		TranslateTransition translate3 = new TranslateTransition(Duration.seconds(1), btnLivro15);
		translate3.setToX(btnLivro13.getLayoutX() * 3);
		translate3.play();
		
		TranslateTransition translate4 = new TranslateTransition(Duration.seconds(1), btnLivro16);
		translate4.setToX(btnLivro13.getLayoutX() * 4);
		translate4.play();
		
		TranslateTransition translate5 = new TranslateTransition(Duration.seconds(1), btnLivro17);
		translate5.setToX(btnLivro13.getLayoutX() * 5);
		translate5.play();
		
		TranslateTransition translate6 = new TranslateTransition(Duration.seconds(1), btnLivro18);
		translate6.setToX(btnLivro13.getLayoutX() * 6);
		translate6.play();
		
		TranslateTransition translateE = new TranslateTransition(Duration.seconds(1), btnLivroE3);
		translateE.setToX(btnLivro13.getLayoutX() * 7);
		translateE.play();
    }
}
