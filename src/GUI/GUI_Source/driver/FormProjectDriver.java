package driver;

import gui.FirstScene;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FormProjectDriver extends Application{
	Stage stage;
	
	public void setScene(Scene scene) {
		stage.setScene(scene);;
	}
	
	public void start(Stage stage) {
		this.stage = stage;
		stage.setTitle("Fitness App");
		stage.show();
		
		FirstScene scene = new FirstScene(this);
		scene.setup();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	
	}
}

