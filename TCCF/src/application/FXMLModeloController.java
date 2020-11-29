package application;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.produto;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class FXMLModeloController implements Initializable{
	@FXML
    private ImageView imgFundo, imgLogo, imgLivro;

    @FXML
    private Label lblTitulo, lblSair, lblLocal, lblTituloL, lblAutor, lblGenero, lblAno, lblDisponiveis;

    @FXML
    private TextField txtPesquisa;
    
    @FXML
    private Text lblSinopse;
    
    @FXML
    private Rectangle rtgPainel;
    
    produto produtoAtual;
    
    @FXML
	protected void Sair() {
		System.exit(0);
    }
    
    public void setProduto(produto x) {
    	produtoAtual = x;
    	lblLocal.setText("Setor:  " + produtoAtual.getSetor() + "      Fileira:  " + produtoAtual.getFileira() + "     Preteleira:  " + produtoAtual.getPrateleira());
		lblTituloL.setText(produtoAtual.getNomeLivro());
		lblAutor.setText(produtoAtual.getAutoresLivro());
		lblGenero.setText("");
		lblAno.setText("Editora: " + produtoAtual.getEditora() + "            Ano Edição: " + produtoAtual.getAnoEdicao() + "");
		lblSinopse.setText(produtoAtual.getDescricaoProd());
		
		Image imagemLivro = new Image(new ByteArrayInputStream(produtoAtual.getImagemProd()));
		imgLivro.setImage(imagemLivro);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
