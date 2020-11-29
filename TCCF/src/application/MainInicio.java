package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainInicio extends Application {
	public static Stage stage;
	private static Scene inicioScene;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		stage = primaryStage;
		
		Parent fxmlInicio = FXMLLoader.load(getClass().getResource("../application/FXMLInicio.fxml"));
		inicioScene = new Scene(fxmlInicio);
		inicioScene.getStylesheets().add("CSS/application.css");
		
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(inicioScene);
		primaryStage.show();
	}
	
	public static void changeScreen(String src) {
		switch (src){
			case "inicio":
				stage.setScene(inicioScene);
				break;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
