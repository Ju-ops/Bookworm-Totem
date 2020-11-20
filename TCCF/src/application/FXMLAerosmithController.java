package application;

import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.pesquisa;
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

public class FXMLAerosmithController implements Initializable{
	@FXML
    private ImageView imgFundo, imgLogo, imgCD;

    @FXML
    private Label lblTitulo, lblLocal, lblSair, lblTituloL, lblCompositor, lblGenero, lblAno, lblDisponiveis;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnVoltar, btnPesquisar;

    @FXML
    private Text lblSinopse;
    
    @FXML
    private Rectangle rtgPainel;
    
    produto produtoAtual;
    
    pesquisa pesquisaAtual;

    @FXML
	 protected void Sair() {
		 System.exit(0);
	 }
	 
	 @FXML
	 protected void InicioScene(ActionEvent e) {
		MainInicio.changeScreen("inicio");
	 }
	 
	 @FXML
	 protected void Pesquisar(ActionEvent e) throws Exception{
		 pesquisaAtual = pesquisa.getPesquisa(txtPesquisa.getText());
		 if (pesquisaAtual == null) {
			 MainInicio.changeScreen("pesquisaErro");
		 } else {
			 MainInicio.changeScreen("pesquisa");
		 }
	 }
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			produtoAtual = produto.getProduto(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblLocal.setText("Setor:  " + produtoAtual.getSetor() + "      Fileira:  " + produtoAtual.getFileira() + "     Preteleira:  " + produtoAtual.getPrateleira());
		lblTituloL.setText(produtoAtual.getNomeLivro());
		lblCompositor.setText(produtoAtual.getAutoresLivro());
		lblGenero.setText(null);
		lblAno.setText("Editora: " + produtoAtual.getEditora() + "            Ano Edição: " + produtoAtual.getAnoEdicao() + "");
		lblDisponiveis.setText("Exemplares disponíveis:  " + produtoAtual.getDisponiveis());
		lblSinopse.setText(produtoAtual.getDescricaoProd());
		
	}

}
