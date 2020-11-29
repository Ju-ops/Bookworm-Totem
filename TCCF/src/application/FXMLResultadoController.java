package application;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class FXMLResultadoController implements Initializable{
	@FXML
    private AnchorPane apProduto;

    @FXML
    private Label lblTituloL, lblAutor, lblGenero;
    
    @FXML
    private Button btnMudar;
    
    @FXML
    private Text lblAno;
    
    @FXML
    private ImageView imgLivro;
    
    produto produtoAtual;
    
    public void setProduto(produto y) throws Exception {
    	produtoAtual = y;
		lblTituloL.setText(produtoAtual.getNomeLivro());
		lblAutor.setText(produtoAtual.getAutoresLivro());
		lblAno.setText("Editora: " + produtoAtual.getEditora() + " Ano Edição: " + produtoAtual.getAnoEdicao() + "");
		
		Image imagemLivro = new Image(new ByteArrayInputStream(produtoAtual.getImagemProd()));
		imgLivro.setImage(imagemLivro);
		
		//pegar o genero do produto pelo id do produto y
		int id = produtoAtual.getIDProduto();
		String[] genero = produto.getGenero(id);
		lblGenero.setText(String.join(", ", genero));
    }
    
    @FXML
    void Mudar(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("./FXMLModelo.fxml"));
    	
    	Scene scene = new Scene(loader.load());
    	
    	FXMLModeloController controller = loader.getController();
    	controller.setProduto(produtoAtual);
    	
    	scene.getStylesheets().add("CSS/application.css");
    	MainInicio.stage.setScene(scene);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
