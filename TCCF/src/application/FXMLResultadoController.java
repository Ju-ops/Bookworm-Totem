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

public class FXMLResultadoController implements Initializable{
	@FXML
    private AnchorPane apProduto;

    @FXML
    private Label lblTituloL, lblAutor, lblGenero, lblAno;
    
    @FXML
    private Button btnMudar;
    
    produto produtoAtual;
    
    public void setProduto(produto y) {
    	produtoAtual = y;
		lblTituloL.setText(produtoAtual.getNomeLivro());
		lblAutor.setText(produtoAtual.getAutoresLivro());
		lblGenero.setText("");
		lblAno.setText("Editora: " + produtoAtual.getEditora() + "            Ano Edição: " + produtoAtual.getAnoEdicao() + "");
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
