package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainStartfx extends Application {

	public AnchorPane rootPane;
	private fxcontroller fxController;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Camping with Friends!");
		FXMLLoader fxmlLoader = new FXMLLoader();
		try {
			rootPane = fxmlLoader.load(getClass().getResource("GameVisualsFXML.fxml").openStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fxController = (fxcontroller) fxmlLoader.getController();
		primaryStage.setScene(new Scene(rootPane, 1600, 900));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}