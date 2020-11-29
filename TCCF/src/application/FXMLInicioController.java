package application;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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
    private Label lblSair, lblTitulo, lbl;

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
		try {
			produto[] adicionadosRecentemente = produto.getAdicionadosRecentemente();
			
			for (produto Item : adicionadosRecentemente) {
				Button btnLivro = new Button();
				btnLivro.setLayoutY(14.0);
				btnLivro.setMnemonicParsing(false);
				btnLivro.setPrefWidth(95.0);
				btnLivro.setPrefHeight(128.0);
				
				ImageView julianaSono = new ImageView(
						new Image(
								new ByteArrayInputStream(Item.getImagemProd())
						)
				);
				julianaSono.setPreserveRatio(true);
				julianaSono.setFitHeight(128.0);
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
			    	controller.setProduto(Item);
			    	
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
			produto[] aventura = produto.getGeneros("Aventura");
			
			for (produto Item : aventura) {
				Button btnLivro = new Button();
				btnLivro.setLayoutY(14.0);
				btnLivro.setMnemonicParsing(false);
				btnLivro.setPrefWidth(95.0);
				btnLivro.setPrefHeight(128.0);
				
				ImageView julianaSono = new ImageView(
						new Image(
								new ByteArrayInputStream(Item.getImagemProd())
						)
				);
				julianaSono.setPreserveRatio(true);
				julianaSono.setFitHeight(128.0);
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
			    	controller.setProduto(Item);
			    	
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
				btnLivro.setPrefWidth(95.0);
				btnLivro.setPrefHeight(128.0);
				
				ImageView julianaSono = new ImageView(
						new Image(
								new ByteArrayInputStream(Item.getImagemProd())
						)
				);
				julianaSono.setPreserveRatio(true);
				julianaSono.setFitHeight(128.0);
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
			    	controller.setProduto(Item);
			    	
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
		
    }

    @FXML
    void Voltar(ActionEvent event) {
    	
    }
    
    @FXML
    void Proximo(ActionEvent event) {
		
    }

    @FXML
    void Anterior(ActionEvent event) {
    	
    }
    
    @FXML
    void Seguinte(ActionEvent event) {
		
    }

    @FXML
    void Antes(ActionEvent event) {
    	
    }
}
