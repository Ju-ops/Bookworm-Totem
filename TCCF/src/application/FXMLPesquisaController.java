package application;

import java.net.URL;
import java.util.ResourceBundle;

import ClasseConexao.pesquisa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class FXMLPesquisaController implements Initializable {	
	@FXML
    private ImageView imgFundo, imgLogo;
	
	@FXML
    private Rectangle rtgPainel;

    @FXML
    private Label lblSair, lblTitulo, lblAutor;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnVoltar, btnPesquisar;
    
    pesquisa pesquisaAtualpesquisa;
    
    FXMLInicioController pesquisaAtual;

	@FXML
    void Sair() {
    	System.exit(0);
    }
	
	@FXML
	protected void Voltar() {
		MainInicio.changeScreen("inicio");
	}
	
	@FXML
	protected void Pesquisar(ActionEvent e) throws Exception {
		pesquisaAtualpesquisa = pesquisa.getPesquisa(txtPesquisa.getText());
    	if (pesquisaAtualpesquisa == null) {
    		MainInicio.changeScreen("pesquisaErro");
    	} else {
    		//MainInicio.changeScreen("pesquisa");
    	}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//lblAutor.setText(pesquisaAtual.getAutoresLivro());
	}

}
