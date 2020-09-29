package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainEmojiOFilme extends Application {
	private static Stage stage;
	private static Scene inicioScene;
	private static Scene oIluminado;
	private static Scene emojiFilme;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		stage = primaryStage;
		
		Parent fxmlInicio = FXMLLoader.load(getClass().getResource("../application/FXMLInicio.fxml"));
		inicioScene = new Scene(fxmlInicio);
		inicioScene.getStylesheets().add("CSS/application.css");
		
		Parent fxmlLivro1 = FXMLLoader.load(getClass().getResource("../application/FXMLOIluminado.fxml"));
		oIluminado = new Scene(fxmlLivro1);
		oIluminado.getStylesheets().add("CSS/application.css");
		
		Parent fxmlFilme1 = FXMLLoader.load(getClass().getResource("../application/FXMLEmoji.fxml"));
		emojiFilme = new Scene(fxmlFilme1);
		emojiFilme.getStylesheets().add("CSS/application.css");
		
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(emojiFilme);
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
				stage.setScene(emojiFilme);
				break;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
