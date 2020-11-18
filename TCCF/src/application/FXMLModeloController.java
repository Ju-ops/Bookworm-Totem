package application;

import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.produto;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class FXMLModeloController implements Initializable{
	@FXML
    private ImageView imgFundo, imgLogo, imgPainel;

    @FXML
    private Label lblTitulo, lblSair, lblLocal, lblTituloL, lblAutor, lblGenero, lblAno, lblDisponiveis;

    @FXML
    private TextField txtPesquisa;
    
    produto produtoAtual;
    
    int x;
    
    public void setProduto(produto x) {
    	
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			produtoAtual = produto.getProduto(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblLocal.setText("Setor:  " + produtoAtual.getSetor() + "      Fileira:  " + produtoAtual.getFileira() + "     Preteleira:  " + produtoAtual.getPrateleira());
		lblTituloL.setText(produtoAtual.getNomeLivro());
		lblAutor.setText(produtoAtual.getAutoresLivro());
		lblGenero.setText(null);
		lblAno.setText("Editora: " + produtoAtual.getEditora() + "            Ano Edição: " + produtoAtual.getAnoEdicao() + "");
		lblDisponiveis.setText("Exemplares disponíveis:  " + produtoAtual.getDisponiveis());
		//lblSinopse.setText(produtoAtual.getDescricaoProd());
	}

}
