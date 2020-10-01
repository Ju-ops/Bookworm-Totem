package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainInicio extends Application {
	private static Stage stage;
	private static Scene inicioScene;
	private static Scene oIluminado;
	private static Scene EmojiFilme;
	private static Scene aerosmith;
	private static Scene zelda;
	private static Scene destinos;
	private static Scene elaeseugato;
	private static Scene witchAcademy;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		stage = primaryStage;
		
		Parent fxmlInicio = FXMLLoader.load(getClass().getResource("../application/FXMLInicio.fxml"));
		inicioScene = new Scene(fxmlInicio);
		inicioScene.getStylesheets().add("CSS/application.css");
		
		Parent fxmlLivro1 = FXMLLoader.load(getClass().getResource("../application/FXMLOIluminado.fxml"));
		oIluminado = new Scene(fxmlLivro1);
		oIluminado.getStylesheets().add("CSS/application.css");
		
		Parent fxmlLivro2 = FXMLLoader.load(getClass().getResource("../application/FXMLDestinos.fxml"));
		destinos = new Scene(fxmlLivro2);
		destinos.getStylesheets().add("CSS/application.css");
		
		Parent fxmlFilme1 = FXMLLoader.load(getClass().getResource("../application/FXMLEmoji.fxml"));
		EmojiFilme = new Scene(fxmlFilme1);
		EmojiFilme.getStylesheets().add("CSS/application.css");
		
		Parent fxmlCD1 = FXMLLoader.load(getClass().getResource("../application/FXMLAerosmith.fxml"));
		aerosmith = new Scene(fxmlCD1);
		aerosmith.getStylesheets().add("CSS/application.css");
		
		Parent fxmlRevista1 = FXMLLoader.load(getClass().getResource("../application/FXMLZelda.fxml"));
		zelda = new Scene(fxmlRevista1);
		zelda.getStylesheets().add("CSS/application.css");
		
		Parent fxmlLivro3 = FXMLLoader.load(getClass().getResource("../application/FXMLElaESeuGato.fxml"));
		elaeseugato = new Scene(fxmlLivro3);
		elaeseugato.getStylesheets().add("CSS/application.css");
		
		Parent fxmlLivro4 = FXMLLoader.load(getClass().getResource("../application/FXMLWitchAcademy.fxml"));
		witchAcademy = new Scene(fxmlLivro4);
		witchAcademy.getStylesheets().add("CSS/application.css");
		
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(inicioScene);
		primaryStage.show();
	}
	
	public static void changeScreen(String src) {
		switch (src){
			case "inicio":
				stage.setScene(inicioScene);
				break;
			case "iluminado":
				stage.setScene(oIluminado);
				break;
			case "emoji":
				stage.setScene(EmojiFilme);
				break;
			case "aerosmith":
				stage.setScene(aerosmith);
				break;
			case "zelda":
				stage.setScene(zelda);
				break;
			case "destinos":
				stage.setScene(destinos);
				break;
			case "elaeseugato":
				stage.setScene(elaeseugato);
				break;
			case "witchAcademy":
				stage.setScene(witchAcademy);
				break;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
