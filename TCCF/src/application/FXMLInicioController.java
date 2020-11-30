package application;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.produto;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class FXMLInicioController implements Initializable {
	@FXML
    private ImageView imgFundo, imgLogo;

    @FXML
    private Label lblSair, lblTitulo, lblInicio;

    @FXML
    private Rectangle rtgPainel;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnPesquisar, btnAnterior, btnProximo;

    @FXML
    private AnchorPane apScroll;

    @FXML
    private ScrollPane spHAR, spHR, spHF;

    @FXML
    private HBox hbAdicionadosRecentemente, hbRomance, hbFiccao;

    
    @FXML
    void Sair() {
    	System.exit(0);
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
	public void initialize(URL location, ResourceBundle resources){
		try {
			produto[] adicionadosRecentemente = produto.getAdicionadosRecentemente();
			
			for (produto Item : adicionadosRecentemente) {
				Button btnLivro = new Button();
				btnLivro.setLayoutY(14.0);
				btnLivro.setMnemonicParsing(false);
				btnLivro.setPrefWidth(158.0);
				btnLivro.setPrefHeight(209.0);
				btnLivro.getStyleClass().add("itemLivro");
				
				ImageView julianaSono = new ImageView(
						new Image(
								new ByteArrayInputStream(Item.getImagemProd())
						)
				);
				julianaSono.setPreserveRatio(true);
				julianaSono.setFitHeight(209.0);
				btnLivro.setGraphic(julianaSono);
				btnLivro.setOnAction(e -> {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("./FXMLModelo.fxml"));
			    	
			    	Scene scene;
					try {
						scene = new Scene(loader.load());
					} catch (IOException e1) {
						e1.printStackTrace();
						return;
					}
			    	
			    	FXMLModeloController controller = loader.getController();
			    	try {
						controller.setProduto(Item);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	
			    	scene.getStylesheets().add("CSS/application.css");
			    	MainInicio.stage.setScene(scene);
				});
				hbAdicionadosRecentemente.getChildren().add(btnLivro);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			produto[] aventura = produto.getGeneros("Romance");
			
			for (produto Item : aventura) {
				Button btnLivro = new Button();
				btnLivro.setLayoutY(14.0);
				btnLivro.setMnemonicParsing(false);
				btnLivro.setPrefWidth(158.0);
				btnLivro.setPrefHeight(209.0);
				btnLivro.getStyleClass().add("itemLivro");
				
				ImageView img = new ImageView(
						new Image(
								new ByteArrayInputStream(Item.getImagemProd())
						)
				);
				img.setPreserveRatio(true);
				img.setFitHeight(209.0);
				btnLivro.setGraphic(img);
				btnLivro.setOnAction(e -> {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("./FXMLModelo.fxml"));
			    	
			    	Scene scene;
					try {
						scene = new Scene(loader.load());
					} catch (IOException e1) {
						e1.printStackTrace();
						return;
					}
			    	
			    	FXMLModeloController controller = loader.getController();
			    	try {
						controller.setProduto(Item);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	
			    	scene.getStylesheets().add("CSS/application.css");
			    	MainInicio.stage.setScene(scene);
				});
				hbRomance.getChildren().add(btnLivro);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			produto[] aventura = produto.getGeneros("Ficção Científica");
			
			for (produto Item : aventura) {
				Button btnLivro = new Button();
				btnLivro.setLayoutY(14.0);
				btnLivro.setMnemonicParsing(false);
				btnLivro.setPrefWidth(158.0);
				btnLivro.setPrefHeight(209.0);
				btnLivro.getStyleClass().add("itemLivro");
				
				ImageView img = new ImageView(
						new Image(
								new ByteArrayInputStream(Item.getImagemProd())
						)
				);
				img.setPreserveRatio(true);
				img.setFitHeight(209.0);
				btnLivro.setGraphic(img);
				btnLivro.setOnAction(e -> {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("./FXMLModelo.fxml"));
			    	
			    	Scene scene;
					try {
						scene = new Scene(loader.load());
					} catch (IOException e1) {
						e1.printStackTrace();
						return;
					}
			    	
			    	FXMLModeloController controller = loader.getController();
			    	try {
						controller.setProduto(Item);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	
			    	scene.getStylesheets().add("CSS/application.css");
			    	MainInicio.stage.setScene(scene);
				});
				hbFiccao.getChildren().add(btnLivro);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
    void Ir(ActionEvent event) {
		Animation animation = new Timeline(new KeyFrame(Duration.seconds(1), new KeyValue(spHAR.hvalueProperty(), 1)));
		animation.play();
	}

    @FXML
    void Voltar(ActionEvent event) {
    	Animation sajuLindo = new Timeline(new KeyFrame(Duration.seconds(1), new KeyValue(spHAR.hvalueProperty(), 0)));
		sajuLindo.play();
    }
    
    @FXML
    void Proximo(ActionEvent event) {
    	Animation sajuLindo = new Timeline(new KeyFrame(Duration.seconds(1), new KeyValue(spHR.hvalueProperty(), 1)));
		sajuLindo.play();
    }

    @FXML
    void Anterior(ActionEvent event) {
    	Animation sajuLindo = new Timeline(new KeyFrame(Duration.seconds(1), new KeyValue(spHR.hvalueProperty(), 0)));
		sajuLindo.play();
    }
    
    @FXML
    void Seguinte(ActionEvent event) {
    	Animation sajuLindo = new Timeline(new KeyFrame(Duration.seconds(1), new KeyValue(spHF.hvalueProperty(), 1)));
		sajuLindo.play();
    }

    @FXML
    void Antes(ActionEvent event) {
    	Animation sajuLindo = new Timeline(new KeyFrame(Duration.seconds(1), new KeyValue(spHF.hvalueProperty(), 0)));
		sajuLindo.play();
    }
}
