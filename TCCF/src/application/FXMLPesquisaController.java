package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class FXMLPesquisaController implements Initializable {	
	@FXML
    private ImageView imgFundo, imgLogo, imgPainel;

    @FXML
    private Label lblSair, lblTitulo, lblAutor;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnVoltar, btnPesquisar;

	@FXML
    void Sair() {
    	System.exit(0);
    }
	
	@FXML
	protected void Voltar() {
		MainInicio.changeScreen("inicio");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/*try {
			pesquisaAtual = pesquisa.getPesquisa(nome + "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		lblAutor.setText(pesquisaAtual.getAutoresLivro());*/
	}

}
