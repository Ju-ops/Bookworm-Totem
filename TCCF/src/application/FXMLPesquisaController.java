package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import ClasseConexao.pesquisa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import model.Resultados;

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
    
    @FXML
    private ListView<?> lvResultado;
    
    @FXML
    private ListView<Resultados> lvResultados;
    
    private List<Resultados> resultados = new ArrayList<>();
    
    private ObservableList<Resultados> obsResultados;
    
    pesquisa pesquisaAtual;

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
		pesquisaAtual = pesquisa.getPesquisa(txtPesquisa.getText());
    	if (pesquisaAtual == null) {
    		MainInicio.changeScreen("pesquisaErro");
    	} else {
    		//MainInicio.changeScreen("pesquisa");
    		
    	}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarResultados();
	}
	
	public void carregarResultados() {
		Resultados p1 = new Resultados(1, "Teste");
		Resultados p2 = new Resultados(2, "Teste2");
		
		resultados.add(p1);
		resultados.add(p2);
		
		obsResultados = FXCollections.observableArrayList(resultados);
		
		lvResultados.setItems(obsResultados);
	}

}
