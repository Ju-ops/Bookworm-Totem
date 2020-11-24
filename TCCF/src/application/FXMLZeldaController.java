package application;

import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class FXMLZeldaController implements Initializable{
	@FXML
    private ImageView imgFundo, imgLogo, imgRevista;

    @FXML
    private Label lblTitulo, lblSair, lblLocal, lblTituloL, lblDiretor, lblGenero, lblAno, lblDisponiveis;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnVoltar, btnPesquisar;

    @FXML
    private Text lblSinopse;
    
    @FXML
    private Rectangle rtgPainel;
    
    produto produtoAtual;

    @FXML
	protected void Sair() {
		System.exit(0);
	}
	 
	@FXML
	protected void InicioScene(ActionEvent e) {
		MainInicio.changeScreen("inicio");
	}
	
	@FXML
	protected void Pesquisar() throws Exception {
		
	}
	 
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			produtoAtual = produto.getProduto(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblLocal.setText("Setor:  " + produtoAtual.getSetor() + "      Fileira:  " + produtoAtual.getFileira() + "     Preteleira:  " + produtoAtual.getPrateleira());
		lblTituloL.setText(produtoAtual.getNomeLivro());
		lblDiretor.setText(produtoAtual.getAutoresLivro());
		lblGenero.setText(null);
		lblAno.setText("Editora: " + produtoAtual.getEditora() + "            Ano Edição: " + produtoAtual.getAnoEdicao() + "");
		lblSinopse.setText(produtoAtual.getDescricaoProd());
		
	}

}
