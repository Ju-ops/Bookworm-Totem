package application;

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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class FXMLPesquisaController implements Initializable {	
	@FXML
    private ImageView imgLogo, imgVazio;
	
	@FXML
    private Rectangle rtgPainel;

    @FXML
    private Label lblSair, lblTitulo;
    
    @FXML
    private Text lblAviso;

    @FXML
    private TextField txtPesquisa;

    @FXML
    private Button btnVoltar, btnPesquisar;
    
    @FXML
    private ScrollPane spPainel;

    @FXML
    private VBox vbPainel;
    
    produto produtoAtual;

	produto[] pesquisaAtual;

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
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("./FXMLPesquisa.fxml"));
    	
    	Scene scene = new Scene(loader.load());
    	
    	FXMLPesquisaController controller = loader.getController();
    	String nomeLivro = txtPesquisa.getText();
    	controller.setPesquisa(nomeLivro);
    	
    	scene.getStylesheets().add("CSS/application.css");
    	MainInicio.stage.setScene(scene);
	}
	
	@FXML
    public void setPesquisa(String ow) throws Exception {
    	txtPesquisa.setText(ow);
    	lblAviso.setText("");
    	imgVazio.setOpacity(0);
    	Consulta();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	public void Consulta() throws Exception {
		//pega o texto do textField
		//consulta no banco (ve se tem livro com letra igual as letra do textField)
		//se tiver: mostra os resultado
		//não tive: mostra que :( nao tem
		String pesquisa = txtPesquisa.getText();
		
		produto[] resultadoPesquisa = produto.getPesquisa(pesquisa);
		int tamanhoResultadoPesquisa = resultadoPesquisa.length;
		
		if (tamanhoResultadoPesquisa == 0) {
			//não tive: mostra que :( nao tem
			lblAviso.setText("Parece que não há nada por aqui... Que tal tentar novamente?");
			imgVazio.setOpacity(1);
		} else {
			//se tiver: mostra os resultado			
			for(produto Item : resultadoPesquisa) {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("./FXMLResultado.fxml"));
				
				AnchorPane anchorPane = loader.load();
				FXMLResultadoController controller = loader.getController();
				controller.setProduto(Item);
				vbPainel.getChildren().add(anchorPane);
			}
		}
	}

}
