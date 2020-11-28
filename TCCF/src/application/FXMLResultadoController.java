package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    
    produto produtoAtual;
    
    public void setProduto(produto y) throws Exception {
    	produtoAtual = y;
		lblTituloL.setText(produtoAtual.getNomeLivro());
		lblAutor.setText(produtoAtual.getAutoresLivro());
		lblAno.setText("Editora: " + produtoAtual.getEditora() + " Ano Edição: " + produtoAtual.getAnoEdicao() + "");
		
		//pegar o genero do produto pelo id do produto y
		int id = produtoAtual.getIDProduto();
		String[] genero = produto.getGenero(id);
		lblGenero.setText(String.join(", ", genero));
    }
    
    @FXML
    void Mudar(ActionEvent event) throws IOException {
    	MainInicio.changeScreen("aa");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
